package Day2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x -> ");
        int x = scanner.nextInt();
        System.out.print("Enter d -> ");
        int d = scanner.nextInt();
        int count = 0;
        int y;
        while (x > 0) {
            y = x % 10;
            if (d == y) {
                count++;
            }
            x = x / 10;
        }
        System.out.println(count);
    }
}
