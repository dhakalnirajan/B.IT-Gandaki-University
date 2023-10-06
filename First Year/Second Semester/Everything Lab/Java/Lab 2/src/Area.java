// WAP in Java to calculate the area of a rectangle using the concept of the constructor.

class Area {

  int length;
  int breadth;

  Area(int l, int b) {
    length = l;
    breadth = b;
  }

  int area() {
    return length * breadth;
  }

  public static void main(String[] args) {
    Area a = new Area(10, 20);
    System.out.println("Area of the rectangle is: " + a.area());
  }
}
