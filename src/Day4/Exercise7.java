package Day4;

public class Exercise7 {
    //Multiplication of 2 arrays.
    public static void main(String[] args) {
        int row1 = 2;
        int col1 = 3;
        int row2 = 3;
        int col2 = 2;
        int[][] arr1 = {{3, -2, 5}, {3, 0, 4}};
        int[][] arr2 = {{2, 3}, {-9, 0}, {0, 4}};
        int[][] product = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    product[i][j] += arr1[i][k] * arr2[k][j];

                }
                System.out.print(product[i][j] + " ");

            }
            System.out.println();
        }

    }
}
