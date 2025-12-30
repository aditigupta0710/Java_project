public class CountingSort {
    
    // Function to perform Counting Sort
    public static void countingSort(int[] arr) {
        int n = arr.length;

        // Step 1: Find the maximum element in the array
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Step 2: Create a count array to store frequency
        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // Step 3: Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    // Driver function
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        countingSort(arr);

        System.out.println("\nSorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
