package Day1;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number -> ");
        int inputNumber = scanner.nextInt();
        int n, sum = 0;
        while (inputNumber > 0) {
            n = inputNumber % 10;
            sum = sum + n;
            inputNumber = inputNumber / 10;

        }
        System.out.println("Sum of digits -> " + sum);
    }
}
