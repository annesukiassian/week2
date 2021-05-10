package Day1;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
//        for (int i = 1; (Math.abs(inputNumber) >= (i)); i *= 2) {
//            System.out.println(i);
//        }
        int powerOf2 = 1;
        while (powerOf2 <= inputNumber) {
            System.out.println(powerOf2);
            powerOf2 *= 2;


        }
    }
}
