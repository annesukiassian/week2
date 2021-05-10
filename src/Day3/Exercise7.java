package Day3;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size -> ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + n + " numbers ");
            arr[i] = scanner.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (min > arr[i] && arr[i] > 0) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

}
