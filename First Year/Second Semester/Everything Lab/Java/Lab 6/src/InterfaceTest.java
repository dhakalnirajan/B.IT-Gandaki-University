/*
WAP to create an interface named Shape with its data members and methods for calculating volume. Also, derive a class cuboid
which implements the Shape and calculate the volume of the cuboid. Also, derive a class cube from the class Shape and method for calculating the volume.
Now, Using the main class InterfaceTest , access the methods and variables from it for displaying the volume of cube and cuboid.
*/

// Create an interface named Shape
interface Shape {
  double calculateVolume();
}

// Derive a class Cuboid that implements the Shape interface
class Cuboid implements Shape {

  private double length;
  private double width;
  private double height;

  public Cuboid(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  @Override
  public double calculateVolume() {
    return length * width * height;
  }
}

// Derive a class Cube from the Shape interface
class Cube implements Shape {

  private double side;

  public Cube(double side) {
    this.side = side;
  }

  @Override
  public double calculateVolume() {
    return side * side * side;
  }
}

// Main class InterfaceTest to access methods and variables
public class InterfaceTest {

  public static void main(String[] args) {
    // Create a Cuboid
    Cuboid cuboid = new Cuboid(5.0, 3.0, 2.0);
    double cuboidVolume = cuboid.calculateVolume();
    System.out.println("Volume of Cuboid: " + cuboidVolume);

    // Create a Cube
    Cube cube = new Cube(4.0);
    double cubeVolume = cube.calculateVolume();
    System.out.println("Volume of Cube: " + cubeVolume);
  }
}
