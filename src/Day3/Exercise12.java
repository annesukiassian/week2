package Day3;

// Cycle the elements of the array to the right (A [0] goes to A [1], A [1] to A [2], ...,
// the last element goes to A [0]).

public class Exercise12 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int saved = arr[n - 1];
        for (int i = (n - 2); i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = saved;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
