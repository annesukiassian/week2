package Day2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number -> ");
        int binNumber = scanner.nextInt();
        int x;
        int result = 0;
        int count = 0;
        while (binNumber > 0) {
            x = binNumber % 10;
            result += x * Math.pow(2, count);
            binNumber = binNumber / 10;
            count++;
        }

        System.out.println(result);
    }
}
