public class ExampleOne {

  public static void main(String args[]) {
    try {
      int a = 10;
      int b = a / 0;
      System.out.println(b);
    } catch (ArithmeticException e) {
      System.out.println("Exception Occurs here");
    } finally {
      System.out.println("finally block");
    }
    System.out.println("Code Outside try-catch-finally block");
  }
}
