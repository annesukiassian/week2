package Day1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        for (int i=0; i<=inputNumber;inputNumber--){
            System.out.println(inputNumber);
        }
    }
}
