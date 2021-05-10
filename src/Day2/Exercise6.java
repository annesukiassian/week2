package Day2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        while (true) {
            System.out.print("Enter a number -> ");
            x = scanner.nextInt();
            if (x >= 2) {
                if (x % 2 == 0) {
                    System.out.println(2);
                    break;
                } else if (x % 3 == 0) {
                    System.out.println(3);
                    break;
                } else {
                    System.out.println(x);
                    break;
                }
            }
        }

    }

}

