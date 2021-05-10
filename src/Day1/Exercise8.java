package Day1;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {
        System.out.print("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int count = 0;
        while (!((x != 0) && ((x & (x - 1)) == 0))) {
            x = scanner.nextInt();
            count++;
        }
        System.out.println(x+"\n");
        System.out.println(count);
    }
}

