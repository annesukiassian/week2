package Day2;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int x = scanner.nextInt();
        int count=0;
        for (int i = 1; i <= x; i++) {
            if(x % i == 0){
                count++;
            };
        }System.out.println(count);
    }
}
