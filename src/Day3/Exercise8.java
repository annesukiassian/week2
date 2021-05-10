package Day3;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size -> ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int count = 1;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + n + " numbers ");
            arr[i] = scanner.nextInt();
        }
        int j=0;
        for (int i = 1; i < n; i++) {
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }if (i == j) {
                count++;
            }
        }
        System.out.println(count);
    }

}