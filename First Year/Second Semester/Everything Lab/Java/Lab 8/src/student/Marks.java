/*
Create a class Marks from the package Student. Again, create a class
PassMarks and access all the students who passed the exam (Marks>=40 and
<100) from the package Marks.Take the marks from the user.
*/

package student;

import java.util.Scanner;

public class Marks {

  private int[] marks;

  public Marks(int numStudents) {
    marks = new int[numStudents];
  }

  public void inputMarks() {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < marks.length; i++) {
      System.out.print("Enter marks for student " + (i + 1) + ": ");
      marks[i] = sc.nextInt();
    }
  }

  public int[] getMarks() {
    return marks;
  }
}
