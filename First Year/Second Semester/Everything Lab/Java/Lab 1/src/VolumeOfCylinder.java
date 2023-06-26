// Write a program to find the volume of a cylinder.

public class VolumeOfCylinder {

    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius = 3;
        double height = 20;
        double volume = PI * radius * radius * height;
        System.out.println("Volume of Cylinder is: " + volume);
    }
}