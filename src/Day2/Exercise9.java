package Day2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Input a number -> ");
            x = scanner.nextInt();
            sum += x ;
        }
        System.out.println(sum);
    }
}
