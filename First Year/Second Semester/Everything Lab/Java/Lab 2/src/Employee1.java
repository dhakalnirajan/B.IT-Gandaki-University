// Write a program in Java to show the employee id, name, salary of the employee illustrating the concept of constructor.

public class Employee1 {

  int id;
  String name;
  double salary;

  Employee1(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void display() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Salary: " + salary);
  }

  public static void main(String[] args) {
    Employee1 e1 = new Employee1(101, "ABC", 10000);
    e1.display();
  }
}
