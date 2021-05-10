package Day5;

import java.util.Scanner;

//Enter the number N and draw an NxN checkerboard where the top left is white.
// Designate white margins O, black margins X.
public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows and columns -> ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i-j)%2==0){
                    System.out.print(" X ");
                } else{
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }

    }
}
