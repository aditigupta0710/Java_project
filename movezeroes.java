import java.util.Arrays;

public class movezeroes {
    public static void main(String[] args) {
        int[] arr = {0,4,0,04,43,2,30};
        int j = 0;
        for (int num : arr) {
            if (num != 0) arr[j++] = num;
        }
        while(j < arr.length) {
            arr[j++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
