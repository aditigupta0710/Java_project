import java.util.Arrays;

public class sortproblems {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 6};

        // Built-in sorting
        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
