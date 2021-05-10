package Day2;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower bound -> ");
        int a = scanner.nextInt();
        System.out.print("Enter upper bound -> ");
        int b = scanner.nextInt();

        for (; a <= b; ) {
            if (a % 2 == 0) {
                System.out.println(a);
                a += 2;
                continue;
            } else {
                System.out.println(a + 1);
                a += 3;
            }
        }
    }
}
