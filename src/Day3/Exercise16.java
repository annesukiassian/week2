package Day3;
//It is required to “compress” it by moving all non-zero elements to the left side of the array

import java.util.Scanner;

public class Exercise16 {
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
        int temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp = arr[counter];
                arr[counter]=arr[i];
                arr[i]=temp;
                counter++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
