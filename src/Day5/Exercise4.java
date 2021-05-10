package Day5;

import java.util.Scanner;

//Write a java program to determine whether the number is prime or not.
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N-> ");
        int inputNumber = scanner.nextInt();
        if (inputNumber % 3 == 0) {
            System.out.println("Number is not prime");
        } else if (inputNumber % 2 == 0) {
            System.out.println("Number is not prime");
        } else if (inputNumber % 2 != 0 && inputNumber % 3 != 0) {
            System.out.println("Number is prime");
        }
    }
}
