package Day3;

import java.util.Scanner;

//Given a sorted array, find the number in array that appears more than or equal to n/2 times.
public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size -> ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int counter = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + n + " numbers ");
            arr[i] = scanner.nextInt();
        }
        System.out.print(arr[n / 2]);
    }


}
