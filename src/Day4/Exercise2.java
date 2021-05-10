package Day4;

public class Exercise2 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == arr.length - 1 - j) {
                    System.out.print(1 + " ");
                } else if (i < arr.length - 1 - j) {
                    System.out.print(0 + " ");
                } else if (i > arr.length - 1 - j) {
                    System.out.print(2 + " ");
                }
            }
            System.out.println();
        }
    }
}
