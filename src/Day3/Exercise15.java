package Day3;
//Print those elements of it that appear in the list only once.
public class Exercise15 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 3, 4};
        for (int i = 1; i < (arr.length - 1); i++) {
            if (arr[i - 1] != arr[i] && arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");

            } else {
                i++;
            }
        }

    }
}

