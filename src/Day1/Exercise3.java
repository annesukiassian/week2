package Day1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int i = 1;
        while ((i*i)<=Math.abs(inputNumber)){
            System.out.println(i*i);
            i++;
        }

    }
}
