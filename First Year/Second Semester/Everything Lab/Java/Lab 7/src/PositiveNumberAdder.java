import java.util.Scanner;

public class PositiveNumberAdder {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;

    while (true) {
      try {
        System.out.print("Enter a positive number (or 0 to exit): ");
        int number = scanner.nextInt();

        if (number < 0) {
          throw new IllegalArgumentException(
            "Input must be a positive number."
          );
        }

        if (number == 0) {
          break; // Exit the loop if 0 is entered
        }

        sum += number;
      } catch (IllegalArgumentException e) {
        System.out.println("Invalid input: " + e.getMessage());
        scanner.nextLine(); // Consume the invalid input
      } catch (java.util.InputMismatchException e) {
        System.out.println("Invalid input. Please enter a valid number.");
        scanner.nextLine(); // Consume the invalid input
      }
    }

    System.out.println("Sum of positive numbers: " + sum);
    scanner.close();
  }
}
