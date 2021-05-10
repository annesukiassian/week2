package Day2;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers do you wanna enter ? -> ");
        int n = scanner.nextInt();
        int inputNumber;
        int zeroNumbers = 0;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + " -> ");
            inputNumber = scanner.nextInt();
            if (inputNumber == 0) {
                zeroNumbers++;
            } else if (inputNumber >= 0) {
                positiveNumbers++;
            } else if (inputNumber <= 0) {
                negativeNumbers++;
            }
        }
        System.out.println("Zeros -> " + zeroNumbers + "\n" + "Positives -> " + positiveNumbers + "\n" + "Negatives -> " + negativeNumbers);
    }
}
