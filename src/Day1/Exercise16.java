package Day1;

import java.util.Random;
import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(100);
        int inputNumber = 0;
        while (randomNumber != inputNumber) {
            System.out.print("Guess the number -> ");
            inputNumber = scanner.nextInt();
            if (inputNumber > randomNumber) {
                System.out.println("Too high");
                continue;
            } else if (inputNumber < randomNumber) {
                System.out.println("Too low");
                continue;
            }
            System.out.println("Yes you guessed the number!");
            break;
        }
    }
}
