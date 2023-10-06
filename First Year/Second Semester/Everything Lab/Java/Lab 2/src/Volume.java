// Write a program in Java to calculate volume of cube and cuboid using the concept of method overloading.

class Volume {

  public static void main(String args[]) {
    Volume ob = new Volume();
    ob.cube(10);
    ob.cube(10, 20);
  }

  void cube(int a) {
    System.out.println("Volume of cube is: " + a * a * a);
  }

  void cube(int a, int b) {
    System.out.println("Volume of cuboid is: " + a * b * b);
  }
}
