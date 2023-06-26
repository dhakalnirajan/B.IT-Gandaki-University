// WAP to calculate the product of two numbers taking the input from the user.

import java.util.Scanner;

public class Product {

    public static void main(String[] args) {
        double a, b, product;
        System.out.println("Enter one number: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        System.out.println("Enter another number: ");
        b = sc.nextDouble();
        product = a * b;
        System.out.println("Product of two numbers is: " + product);
    }
}
