package Day5;

import java.util.Scanner;

//Print all four-digit numbers on the segment from A to B, the record of which is a palindrome.
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A and B -> ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = 1001;
        for (int i = a; i <= b; i++) {
            if (i / 1000 == i % 10) {
                if ((i/100)%10 == (i/10)%10){
                    System.out.println(i);
                }
            }
        }
    }
}
