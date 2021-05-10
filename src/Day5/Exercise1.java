package Day5;

import java.util.Scanner;
//Calculate 2 to the power of N
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N-> ");
        int inputNumber = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= inputNumber; i++) {
            result *= 2;
        }
        System.out.print(result);
    }
}
