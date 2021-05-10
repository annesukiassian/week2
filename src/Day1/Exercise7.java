package Day1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        for (int i = 2; inputNumber >= i; inputNumber--) {
            if (inputNumber % 2 == 0) {
                System.out.println(inputNumber);
            }
        }
    }
}