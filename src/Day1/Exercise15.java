package Day1;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number -> ");
        int max = 0;
        int secondMax = 0;
        while (true) {

            int inputNumber = scanner.nextInt();
            if(inputNumber==0){
                break;
            }
            if (inputNumber > max) {
                secondMax=max;
                max=inputNumber;
            }else{
                if(inputNumber<secondMax){

                }else{
                    secondMax=inputNumber;
                }
            }

        }
        System.out.println(secondMax);
    }
}