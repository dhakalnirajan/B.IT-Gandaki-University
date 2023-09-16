import java.util.Scanner;

class Employee {

  private String name;
  private double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }
}

public class EmployeeSalaryChecker {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Enter employee name: ");
      String name = scanner.nextLine();

      System.out.print("Enter employee salary: ");
      double salary = scanner.nextDouble();

      if (salary < 30000) {
        throw new IllegalArgumentException("Salary cannot be less than 30,000");
      }

      Employee employee = new Employee(name, salary);
      System.out.println("Employee Details:");
      System.out.println("Name: " + employee.getName());
      System.out.println("Salary: " + employee.getSalary());
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    } catch (java.util.InputMismatchException e) {
      System.out.println("Invalid input. Please enter a valid salary.");
    } finally {
      scanner.close();
    }
  }
}
