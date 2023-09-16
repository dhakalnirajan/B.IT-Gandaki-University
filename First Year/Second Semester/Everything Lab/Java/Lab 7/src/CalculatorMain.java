class Calculator {

  private int num1;
  private int num2;

  public Calculator(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  public int add() {
    if (num1 < 0 || num2 < 0) {
      throw new ArithmeticException(
        "Both numbers must be positive for addition."
      );
    }
    return num1 + num2;
  }

  public double divide() {
    if (num2 == 0) {
      throw new ArithmeticException("Division by zero is not allowed.");
    }
    return (double) num1 / num2;
  }
}

public class CalculatorMain {

  public static void main(String[] args) {
    Calculator obj1 = new Calculator(10, 20);
    Calculator obj2 = new Calculator(-5, 0);

    try {
      int result1 = obj1.add();
      System.out.println("Addition result 1: " + result1);

      double result2 = obj2.divide();
      System.out.println("Division result 2: " + result2);
    } catch (ArithmeticException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
