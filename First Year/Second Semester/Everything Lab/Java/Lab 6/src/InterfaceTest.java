/*
WAP to create an interface named Shape with its data members and methods for
calculating volume. Also, derive a class cuboid which implements the Shape and
calculate the volume of the cuboid. Also, derive a class cube from the class Shape and
method for calculating the volume. Now, Using the main class InterfaceTest , access the
methods and variables from it for displaying the volume of cube and cuboid.

*/

class Shape {

  float length, breadth, height;
  float volume;

  void volume() {
    volume = length * breadth * height;
  }
}

class Cuboid extends Shape {

  float length, breadth, height, volume;

  void volume() {
    volume = length * breadth * height;
  }
}

class Cube extends Shape {

  float length, volume;

  void volume() {
    volume = length * length * length;
  }
}

class InterfaceTest {

  public static void main(String[] args) {
    Shape s1 = new Shape();
    s1.length = 10;
    s1.breadth = 20;
    s1.height = 30;
    s1.volume();
    System.out.println("The volume of the cuboid is: " + s1.volume);

    Cuboid c1 = new Cuboid();
    c1.length = 10;
    c1.breadth = 20;
    c1.height = 30;
    c1.volume();
    System.out.println("The volume of the cuboid is: " + c1.volume);

    Cube c2 = new Cube();
    c2.length = 10;
    c2.volume();
    System.out.println("The volume of the cube is: " + c2.volume);
  }
}
