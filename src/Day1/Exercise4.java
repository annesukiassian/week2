package Day1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        while (inputNumber > 2) {
            if (inputNumber % 2 == 0) {
                System.out.println(2);
            } else if (inputNumber % 3 == 0) {
                System.out.println(3);
            } else if (inputNumber % 5 == 0) {
                System.out.println(5);
            } else {
                System.out.println(inputNumber);
            }
            break;
        }
    }
}
