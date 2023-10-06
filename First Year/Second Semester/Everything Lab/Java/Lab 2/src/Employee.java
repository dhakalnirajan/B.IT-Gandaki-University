// Write a program to take the input from the user and display the name, age,salary of an employee. In this class the member functions are setdata and displaydata.

import java.util.Scanner;

public class Employee {

  Scanner sc = new Scanner(System.in);
  String name;
  int age;
  double salary;

  public void setdata() {
    System.out.println("Enter the name, age and salary");
    name = sc.next();
    age = sc.nextInt();
    salary = sc.nextDouble();
  }

  public void displaydata() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }

  public static void main(String[] args) {
    Employee e = new Employee();
    e.setdata();
    e.displaydata();
  }
}
