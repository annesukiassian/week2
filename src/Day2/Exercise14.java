package Day2;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number -> ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print(" " + "#");
                } else {
                    System.out.print("#" + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
