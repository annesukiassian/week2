package Day2;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number -> ");
        int n = scanner.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (count < n) {
                    System.out.print(i + " ");
                    count++;
                }

            }

        }
    }
}
