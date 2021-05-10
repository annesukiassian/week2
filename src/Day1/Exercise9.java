package Day1;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int i=0;
        int res=1;
        while (res<=inputNumber){
           res*=2;
           i++;
        }
        System.out.println(i);

    }
}
