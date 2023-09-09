/*
WAP to create an interface named Shape with its data members and methods for calculating volume. Also, derive a class cuboid
which implements the Shape and calculate the volume of the cuboid. Also, derive a class cube from the class Shape and method for calculating the volume.
Now, Using the main class InterfaceTest , access the methods and variables from it for displaying the volume of cube and cuboid.
*/

// Create an interface named Shape
interface Shape {
  double calculateVolume(); // Method for calculating volume
}

// Derive a class Cuboid which implements the Shape interface
class Cuboid implements Shape {

  // Data members for length, width, and height of the cuboid
  double length;
  double width;
  double height;

  // Constructor to initialize the dimensions of the cuboid
  public Cuboid(double length, double width, double height) {
    this.length = length;
    this.width = width;
    this.height = height;
  }

  // Implement the calculateVolume method from the Shape interface
  public double calculateVolume() {
    return length * width * height;
  }
}

// Derive a class Cube from the Shape interface
class Cube implements Shape {

  // Data member for the side length of the cube
  double sideLength;

  // Constructor to initialize the side length of the cube
  public Cube(double sideLength) {
    this.sideLength = sideLength;
  }

  // Implement the calculateVolume method from the Shape interface
  public double calculateVolume() {
    return sideLength * sideLength * sideLength;
  }
}

// Main class InterfaceTest
public class InterfaceTest {

  public static void main(String[] args) {
    // Create a Cuboid object
    Cuboid cuboid = new Cuboid(5.0, 4.0, 3.0);

    // Calculate and display the volume of the cuboid
    System.out.println("Volume of Cuboid: " + cuboid.calculateVolume());

    // Create a Cube object
    Cube cube = new Cube(3.0);

    // Calculate and display the volume of the cube
    System.out.println("Volume of Cube: " + cube.calculateVolume());
  }
}
