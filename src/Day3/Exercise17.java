package Day3;

import java.util.Scanner;

//Write a java program to check if the given array sorted.
public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size -> ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + n + " numbers ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                System.out.print("The array is in ascending order");
                break;
            } else if (arr[i] < arr[i - 1]) {
                System.out.print("The array is in descending order");
                break;
            }
        }
    }
}
