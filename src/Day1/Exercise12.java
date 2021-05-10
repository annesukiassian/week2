package Day1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int count = 2;
        int num1 = 1;
        int num2 = 1;
        int num3 = 2;
        while (num3 < inputNumber) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            count++;
        }
        if(num3==inputNumber){
            System.out.println(count);
        }else{
            System.out.println("-1");
        }
    }
}
