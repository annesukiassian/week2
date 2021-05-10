package Day3;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size -> ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int max = arr[0];
        int j;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + n + " numbers ");
            arr[i] = scanner.nextInt();
        }
        for (j = 1; j < n; j++) {
            if(max<arr[j]){
                max = arr[j];
            }
        }
        System.out.println(max);
    }
}
