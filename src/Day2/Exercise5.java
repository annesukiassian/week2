package Day2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x -> ");
        int x = scanner.nextInt();
        int y = x;
        int lastDigit = 0;
        int count = 0;
        int reversedX = 0;
        while (x > 0) {
            lastDigit = x % 10;
            x = x / 10;
            count++;
        }
        while (y != 0) {
            lastDigit = y % 10;
            reversedX += (int) (lastDigit * Math.pow(10, count - 1));
            y = y / 10;
            count--;
        }
        System.out.println(reversedX);
    }
}
