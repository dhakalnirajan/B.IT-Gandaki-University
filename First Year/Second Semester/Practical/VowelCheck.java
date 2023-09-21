import java.util.Scanner;

public class VowelCheck {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a single character: ");
    String input = scanner.next();

    if (input.length() == 1) {
      char character = input.toUpperCase().charAt(0);

      switch (character) {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
          System.out.println("The character is a vowel.");
          break;
        default:
          System.out.println("The character is not a vowel.");
      }
    } else {
      System.out.println("Please enter a single character.");
    }

    scanner.close();
  }
}
