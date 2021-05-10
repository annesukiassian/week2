package Day4;

import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int[][] arr = {{0, 1, 2}, {1, 5, 3}, {2, 3, 4}};
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] != arr[j][i]) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");

                }

            }

        }
    }
}