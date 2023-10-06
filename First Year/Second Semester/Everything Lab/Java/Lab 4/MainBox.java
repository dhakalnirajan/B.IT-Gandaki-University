class Box {

  public double length;
  public double breadth;
  public double height;

  // Constructor
  public Box(double length, double breadth, double height) {
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  // Method to calculate volume
  public double calculateVolume() {
    return length * breadth * height;
  }

  // Getters and setters
  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getBreadth() {
    return breadth;
  }

  public void setBreadth(double breadth) {
    this.breadth = breadth;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }
}

class Subbox1 extends Box {

  public double weight;

  // Constructor
  public Subbox1(double length, double breadth, double height, double weight) {
    super(length, breadth, height);
    this.weight = weight;
  }

  // Getters and setters
  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}

class Subbox2 extends Box {

  public double price;

  // Constructor
  public Subbox2(double length, double breadth, double height, double price) {
    super(length, breadth, height);
    this.price = price;
  }

  // Getters and setters
  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}

public class MainBox {

  public static void main(String[] args) {
    // Create a Box object
    Box box = new Box(10, 20, 30);

    // Create a Subbox1 object
    Subbox1 subbox1 = new Subbox1(5, 10, 15, 25);

    // Create a Subbox2 object
    Subbox2 subbox2 = new Subbox2(8, 12, 16, 50);

    // Display the variables of the Box object
    System.out.println("Box Length: " + box.getLength());
    System.out.println("Box Breadth: " + box.getBreadth());
    System.out.println("Box Height: " + box.getHeight());
    System.out.println("Box Volume: " + box.calculateVolume());

    // Display the variables of the Subbox1 object
    System.out.println("Subbox1 Length: " + subbox1.getLength());
    System.out.println("Subbox1 Breadth: " + subbox1.getBreadth());
    System.out.println("Subbox1 Height: " + subbox1.getHeight());
    System.out.println("Subbox1 Volume: " + subbox1.calculateVolume());
    System.out.println("Subbox1 Weight: " + subbox1.getWeight());

    // Display the variables of the Subbox2 object
    System.out.println("Subbox2 Length: " + subbox2.getLength());
    System.out.println("Subbox2 Breadth: " + subbox2.getBreadth());
    System.out.println("Subbox2 Height: " + subbox2.getHeight());
    System.out.println("Subbox2 Volume: " + subbox2.calculateVolume());
    System.out.println("Subbox2 Price: " + subbox2.getPrice());
  }
}
