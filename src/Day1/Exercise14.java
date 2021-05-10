package Day1;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x ");
        int firstX = scanner.nextInt();
        System.out.println("Enter the p ");
        int p = scanner.nextInt();
        System.out.println("Enter the y ");
        int y = scanner.nextInt();
        int count = 0;
        double secondX = firstX;
        for (int i = 0; secondX < y; i++) {
            secondX += secondX * p / 100;
            count++;
        }
        System.out.println(count);
    }
}
