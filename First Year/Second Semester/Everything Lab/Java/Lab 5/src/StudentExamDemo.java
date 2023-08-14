// WAP in Java Create a base class Student with attributes as name and rollno with a method displayDetails(). Derive a subclass StudentExam from the base class with additional attribute marks. Override the displayDetails() method in the StudentExam to display both the student details along with their scores.

class Student {

  String name;
  int rollno;

  public void displayDetails() {
    System.out.println("Name: " + name + "\nRoll No: " + rollno);
  }
}

class StudentExam extends Student {

  int marks;

  public void displayDetails() {
    super.displayDetails();
    System.out.println("Marks: " + marks);
  }
}

class StudentExamDemo {

  public static void main(String args[]) {
    StudentExam s = new StudentExam();
    s.name = "ABC";
    s.rollno = 101;
    s.marks = 90;
    s.displayDetails();
  }
}
