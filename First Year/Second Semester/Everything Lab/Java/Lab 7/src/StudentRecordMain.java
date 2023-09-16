class Student {

  private String[] names;
  private int[] scores;

  public Student() {
    names = new String[10];
    scores = new int[10];
  }

  public void addStudent(int index, String name, int score) {
    try {
      if (index < 0 || index >= 10) {
        throw new ArrayIndexOutOfBoundsException(
          "Index out of bounds. Valid indices are 0-9."
        );
      }
      names[index] = name;
      scores[index] = score;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public void displayStudents() {
    System.out.println("Student Records:");
    for (int i = 0; i < 10; i++) {
      System.out.println("Name: " + names[i] + ", Score: " + scores[i]);
    }
  }
}

public class StudentRecordMain {

  public static void main(String[] args) {
    Student studentRecord = new Student();

    // Add 10 students
    studentRecord.addStudent(0, "Ram", 95);
    studentRecord.addStudent(1, "Shyam", 88);
    studentRecord.addStudent(2, "Hari", 75);
    studentRecord.addStudent(3, "Krishna", 92);
    studentRecord.addStudent(4, "Aswin", 80);
    studentRecord.addStudent(5, "Nirajan", 78);
    studentRecord.addStudent(6, "Arjun", 89);
    studentRecord.addStudent(7, "Himal", 93);
    studentRecord.addStudent(8, "Rakesh", 70);
    studentRecord.addStudent(9, "Rudra", 84);

    // Try adding a student with an invalid index
    studentRecord.addStudent(10, "InvalidStudent", 60);

    // Display student records
    studentRecord.displayStudents();
  }
}
