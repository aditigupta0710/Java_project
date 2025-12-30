
import java.util.Scanner;

public class partitionarray {
        static int findarraysum(int[] arr){
            int totalsum = 0;
            int n = arr.length;
            for(int i = 0; i < n; i++){
                totalsum += arr[i];
            }
            return totalsum;
        }
        static boolean equalsumpartition(int[] arr) {
            int totalsum = findarraysum(arr);
            int prefsum = 0;
            for(int i = 0; i < arr.length; i++) {
                prefsum += arr[i];
                int suffixsum = totalsum - prefsum;
                if(suffixsum == prefsum) {
                    return true;
                }
            }
            return false;
        }
        static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " elements ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("input array ");
        printArray(arr);
        
        System.out.println("equal partition possible : " + equalsumpartition(arr));
    
    }
}

