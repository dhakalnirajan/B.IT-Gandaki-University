import student.Marks;

public class PassMarks {

  public static void main(String[] args) {
    // Assuming you have 10 students
    int numStudents = 10;
    Marks marksObj = new Marks(numStudents);

    System.out.println("Enter marks for " + numStudents + " students:");
    marksObj.inputMarks();

    int[] studentMarks = marksObj.getMarks();

    System.out.println("Students who passed the exam (Marks >= 40 and < 100):");
    for (int i = 0; i < numStudents; i++) {
      if (studentMarks[i] >= 40 && studentMarks[i] < 100) {
        System.out.println("Student " + (i + 1) + ": " + studentMarks[i]);
      }
    }
  }
}
