// WAP in JAVA: Create a class Rectangle and using Inheritance, create another class cuboid. Make one main class named MainShape and access variables through that class.

class Rectangle {

  int length;
  int breadth;

  Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }
}

class Cuboid extends Rectangle {

  int height;

  Cuboid(int length, int breadth, int height) {
    super(length, breadth);
    this.height = height;
  }
}

class MainShape {

  public static void main(String[] args) {
    Cuboid c = new Cuboid(10, 20, 30);
    System.out.println("Length: " + c.length);
    System.out.println("Breadth: " + c.breadth);
    System.out.println("Height: " + c.height);
  }
}
