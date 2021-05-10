package Day4;

//Add 2D arrays.
public class Exercise8 {
    public static void main(String[] args) {
        int row = 2;
        int col = 3;
        int[][] arr1 = {{3, -2, 5}, {3, 0, 4}};
        int[][] arr2 = {{2, 3, 8}, {0, 4, 5}};
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}