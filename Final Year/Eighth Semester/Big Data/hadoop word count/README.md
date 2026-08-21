# Hadoop WordCount — Windows 11 (Native, No WSL) Demo Package

This package contains everything you need to compile, run, and demonstrate the classic
Hadoop MapReduce WordCount program on a **native Windows 11** installation of Apache
Hadoop 3.x (winutils.exe + standard Windows binaries, no WSL, no Linux).

## Package Contents

- `WordCount.java` — Mapper, Reducer, and Driver (main) in a single file
- `input.txt` — sample text with repeated words for a non-trivial word count
- `README.md` — this file

## Assumptions

- Hadoop 3.x is installed natively on Windows and `HADOOP_HOME` is set (e.g. `C:\hadoop`)
- Java JDK 11 is installed and `JAVA_HOME` is set (e.g. `C:\Java\jdk-11`)
- `winutils.exe` and `hadoop.dll` are already placed inside `%HADOOP_HOME%\bin`
- You are working from a folder such as `C:\wordcount` where you have copied
  `WordCount.java` and `input.txt`

All commands below use native Windows CMD syntax (backslashes, `%VAR%` syntax, `.cmd`
scripts). No Linux/WSL commands are used anywhere in this guide.

---

## Step 1 — Open a Command Prompt in your project folder

1. Create a working folder, for example: `C:\wordcount`
2. Copy `WordCount.java` and `input.txt` into `C:\wordcount`
3. Open **Command Prompt** and navigate there:

```cmd
cd C:\wordcount
```

---

## Step 2 — Compile the Java program

Create a folder for the compiled `.class` files:

```cmd
mkdir wordcount_classes
```

Compile `WordCount.java` against the Hadoop classpath. Hadoop 3.x provides a helper
command that prints the full classpath for you:

```cmd
javac -classpath "%HADOOP_HOME%\share\hadoop\common\*;%HADOOP_HOME%\share\hadoop\common\lib\*;%HADOOP_HOME%\share\hadoop\mapreduce\*;%HADOOP_HOME%\share\hadoop\mapreduce\lib\*;%HADOOP_HOME%\share\hadoop\yarn\*;%HADOOP_HOME%\share\hadoop\yarn\lib\*" -d wordcount_classes WordCount.java
```

If compilation succeeds, you will see `.class` files inside `wordcount_classes`
(no output = no errors, which is normal for `javac`).

---

## Step 3 — Package the .class files into a JAR

```cmd
cd wordcount_classes
jar -cvf WordCount.jar *.class
move WordCount.jar C:\wordcount\
cd C:\wordcount
```

You should now have `C:\wordcount\WordCount.jar`.

---

## Step 4 — Start HDFS and YARN

From any folder (these are global commands once `HADOOP_HOME\bin` and `sbin` are on
your `PATH`):

```cmd
start-dfs.cmd
```

Wait for the NameNode and DataNode windows to open, then start YARN:

```cmd
start-yarn.cmd
```

Wait for the ResourceManager and NodeManager windows to open. Each command opens
separate terminal windows for each daemon — **do not close them**, they must keep
running during your demo.

---

## Step 5 — Verify all four daemons are running

In a new Command Prompt window, run:

```cmd
jps
```

You must see all four of the following (order and PID numbers will differ):

```
NameNode
DataNode
ResourceManager
NodeManager
Jps
```

If any daemon is missing, check the corresponding terminal window it opened for
errors before proceeding.

---

## Step 6 — Create the HDFS input directory

```cmd
hdfs dfs -mkdir /user
hdfs dfs -mkdir /user/wordcount
hdfs dfs -mkdir /user/wordcount/input
```

(If any of these already exist from a previous run, HDFS will show a harmless
"already exists" message — you can ignore it.)

---

## Step 7 — Upload the sample input file into HDFS

```cmd
hdfs dfs -put C:\wordcount\input.txt /user/wordcount/input
```

Confirm it uploaded correctly:

```cmd
hdfs dfs -ls /user/wordcount/input
```

---

## Step 8 — Run the WordCount JAR against the HDFS input

```cmd
hadoop jar C:\wordcount\WordCount.jar WordCount /user/wordcount/input /user/wordcount/output
```

Hadoop will print MapReduce job progress in the console. Wait until it reports
`map 100% reduce 100%` and the job completes successfully.

---

## Step 9 — View the final output in the console

```cmd
hdfs dfs -cat /user/wordcount/output/part-r-00000
```

This prints every unique word and its total count directly to the console —
this is what you show the examiner during your viva.

---

## Step 10 — Clean up the output directory (for re-runs)

Hadoop refuses to run a job if the output directory already exists, so before
running the job again, delete it:

```cmd
hdfs dfs -rm -r /user/wordcount/output
```

You can then repeat Step 8 as many times as needed without errors.

---

## Step 11 — Stop Hadoop services when the demo is finished

```cmd
stop-yarn.cmd
stop-dfs.cmd
```

Close any remaining daemon windows manually if they don't close automatically.

---

## Quick Reference — Full Command Sequence

```cmd
cd C:\wordcount
mkdir wordcount_classes
javac -classpath "%HADOOP_HOME%\share\hadoop\common\*;%HADOOP_HOME%\share\hadoop\common\lib\*;%HADOOP_HOME%\share\hadoop\mapreduce\*;%HADOOP_HOME%\share\hadoop\mapreduce\lib\*;%HADOOP_HOME%\share\hadoop\yarn\*;%HADOOP_HOME%\share\hadoop\yarn\lib\*" -d wordcount_classes WordCount.java
cd wordcount_classes
jar -cvf WordCount.jar *.class
move WordCount.jar C:\wordcount\
cd C:\wordcount

start-dfs.cmd
start-yarn.cmd
jps

hdfs dfs -mkdir /user
hdfs dfs -mkdir /user/wordcount
hdfs dfs -mkdir /user/wordcount/input
hdfs dfs -put C:\wordcount\input.txt /user/wordcount/input

hadoop jar C:\wordcount\WordCount.jar WordCount /user/wordcount/input /user/wordcount/output
hdfs dfs -cat /user/wordcount/output/part-r-00000

hdfs dfs -rm -r /user/wordcount/output

stop-yarn.cmd
stop-dfs.cmd
```

---

## Troubleshooting Tips

- **`'hadoop' is not recognized as an internal or external command`** — your `PATH`
  is missing `%HADOOP_HOME%\bin`. Add it under System Properties → Environment
  Variables, then open a new Command Prompt.
- **`jps` shows fewer than 4 daemons** — wait 15–20 seconds after `start-dfs.cmd`
  and `start-yarn.cmd` before checking; daemons take a moment to initialize.
  If a daemon still fails to start, check the daemon's own console window for a
  Java stack trace.
- **`Output directory already exists`** — run Step 10 to delete the previous
  output folder before re-running the job.
- **Permission or `Access is denied` errors on HDFS** — make sure Command Prompt
  was opened normally (Run as Administrator is rarely required, but try it if
  errors persist).
- **NameNode fails to start after a reboot** — this is normal if HDFS was not
  shut down cleanly; run `hdfs namenode -format` only as a last resort, since it
  wipes all HDFS data.
