package Day2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower bound -> ");
        int a = scanner.nextInt();
        System.out.print("Enter upper bound -> ");
        int b = scanner.nextInt();
        System.out.print("Enter c -> ");
        int c = scanner.nextInt();
        System.out.print("Enter d -> ");
        int d = scanner.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
    }
}