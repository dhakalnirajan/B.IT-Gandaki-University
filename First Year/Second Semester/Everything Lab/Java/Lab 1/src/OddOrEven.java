// WAP to take input from the user and find if the number is odd or even.

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter one number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
