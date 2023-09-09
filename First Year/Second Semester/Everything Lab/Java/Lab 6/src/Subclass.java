/*Create two subclasses ‘FirstSubclass’ and ‘SecondSubclass’ that both extend the
‘Parent’ class. Each subclass should use the ‘displayMessage’ method with the first
subclass printing 'This is first subclass’ and the second subclass printing ‘This is the
second subclass’. In the main method create an object of each subclass and call the
‘displayMessage’ method for each object.
*/

class Parent {

  public void displayMessage() {
    System.out.println("This is parent class");
  }
}

class FirstSubclass extends Parent {

  public void displayMessage() {
    System.out.println("This is first subclass");
  }
}

class SecondSubclass extends Parent {

  public void displayMessage() {
    System.out.println("This is second subclass");
  }
}

class Subclass {

  public static void main(String[] args) {
    FirstSubclass first = new FirstSubclass();
    SecondSubclass second = new SecondSubclass();
    first.displayMessage();
    second.displayMessage();
  }
}
