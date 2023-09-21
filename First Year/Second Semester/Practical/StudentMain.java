// WAP in java to create a class "Student" with attributes "name", "rollno", "marks". Create methods to input student's data, calculate the average marks and display the student's data. In the main program, create an object of the Student class and display the results.

public class Student {

  String name;
  int rollno;
  float marks;

  public void input() {
    name = input("Enter name: ");
    rollno = input("Enter rollno: ");
    marks = input("Enter marks: ");
  }

  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Rollno: " + rollno);
    System.out.println("Marks: " + marks);
  }

  public float average() {
    return marks / 3;
  }

  public String toString() {
    return "Name: " + name + "\nRollno: " + rollno + "\nMarks: " + marks;
  }
}

public class StudentMain {

  public static void main(String[] args) {
    Student s = new Student();
    s.input();
    s.display();
  }
}
