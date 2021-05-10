package Day3;
//Rearrange the elements of this array in reverse order

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter array size -> ");
//        int n = scanner.nextInt();
        int arr[] = {1 , 2 , 3 ,4, 5};
//        for (int i = 0; i < n; i++) {
//            System.out.print("Enter " + n + " numbers ");
//            arr[i] = scanner.nextInt();
//        }
        int temp;
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n-1-i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


    }
}
