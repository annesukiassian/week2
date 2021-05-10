package Day4;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n -> ");
        int n = scanner.nextInt();
        int[][] arr = new int[2 * n + 1][2 * n + 1];
        int length = arr.length;
        int firstElement=0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                arr[i][j]=firstElement;
                firstElement++;
            }
        }
    }
}
