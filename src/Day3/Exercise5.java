package Day3;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size -> ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + n + " numbers ");
            arr[i] = scanner.nextInt();
        }
        for (int j = 1; j < n; j++) {
            if (arr[j - 1] > 0 && arr[j] > 0) {
                System.out.print(arr[j - 1] + " " + arr[j]);
                break;
            } else if (arr[j - 1] < 0 && arr[j] < 0) {
                System.out.print(arr[j - 1] + " " + arr[j]);
                break;
            }


        }
    }
}
