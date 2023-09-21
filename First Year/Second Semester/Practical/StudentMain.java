// WAP in java to create a class "Student" with attributes "name", "rollno", "marks". Create methods to input student's data, calculate the average marks and display the student's data. In the main program, create an object of the Student class and display the results.

import java.util.Scanner;

class Student {
    private String name;
    private int rollno;
    private double[] marks;

    // Constructor to initialize student data
    public Student(String name, int rollno, double[] marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    // Method to calculate the average marks
    public double calculateAverageMarks() {
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        return totalMarks / marks.length;
    }

    // Method to display student data
    public void displayStudentData() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollno);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + calculateAverageMarks());
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollno = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] marks = new double[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        Student student = new Student(name, rollno, marks);

        System.out.println("\nStudent Data:");
        student.displayStudentData();

        scanner.close();
    }
}

