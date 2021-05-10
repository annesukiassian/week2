package Day3;

public class Exercise13 {
    //Swap the minimum and maximum elements of this array.
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        int temp;
        if (maxIndex != minIndex) {
            temp = arr[maxIndex];
            arr[maxIndex] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

