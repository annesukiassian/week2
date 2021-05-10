package Day4;

import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    //Max sum and its row.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the number of athletes -> ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of throws -> ");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int indexMax = -1;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += arr[i][j];
            }
            if (maxSum < sum) {
                maxSum = sum;
                indexMax = i;
            }
        }
        System.out.print(maxSum + " " + indexMax);
    }
}
