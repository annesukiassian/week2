package Day2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter upper bound -> ");
        int a = scanner.nextInt();
        System.out.print("Enter lower bound -> ");
        int b = scanner.nextInt();
        for (int i = b; i <= a; i++) {
            for ( int j=1; j<a;j++){
                if (i == Math.pow(j,2)) {
                    System.out.println(i);
                }
            }
        }

    }
}
