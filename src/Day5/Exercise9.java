package Day5;

import java.util.Scanner;

//Prime number
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int n = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = false;
            }
        }
        if (flag) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }
    }
}
