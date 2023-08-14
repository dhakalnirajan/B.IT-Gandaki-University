// WAP in Java toCreate a superclass Shape with a method to display(). Derive a class Rectangle from it and make a method to display(). Again derive a class Triangle from class Shape. Use the concept of method overriding and access the members from the main class Test.

class Shape {

  void display() {
    System.out.println("Shape");
  }
}

class Rectangle extends Shape {

  void display() {
    System.out.println("Rectangle");
  }
}

class Triangle extends Shape {

  void display() {
    System.out.println("Triangle");
  }
}

class Test {

  public static void main(String args[]) {
    Shape s = new Shape();
    Rectangle r = new Rectangle();
    Triangle t = new Triangle();
    s.display();
    r.display();
    t.display();
  }
}
