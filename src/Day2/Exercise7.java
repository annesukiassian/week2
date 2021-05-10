package Day2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int x = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            if(x % i == 0){
                System.out.println(i);
            };
        }
    }
}
