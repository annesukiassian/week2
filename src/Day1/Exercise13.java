package Day1;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x ");
        int day1 = scanner.nextInt();
        System.out.println("Enter the y ");
        int count = 1;
        int y = scanner.nextInt();
        double day2 = day1;
        for (int i = 0; day2 <= y; i++) {
            day2 += (day2 * 0.1);
            count++;
        }
        System.out.println(count);
    }
}
