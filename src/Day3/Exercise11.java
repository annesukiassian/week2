package Day3;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int temp;
        int n= arr.length;

        for (int i = 0; i < n-1; i+=2) {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i +1] = temp;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
