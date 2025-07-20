import java.util.Arrays;
import java.util.Scanner;

public class kthelementfinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n +  " element ");
        for(int i = 0 ; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter value of k : ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        if(k <= 0 || k > n) {
            System.out.println("invalid value of k !!");
        }
        else{
            int kthsmallest = arr[k-1];
            int kthlargest = arr[n-k];
             
            System.out.println("smallest kth element : " +kthsmallest);
            System.out.println("largest kth element : " +kthlargest);
        }
    }
}
