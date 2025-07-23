import java.util.Scanner;

public class rotateinplace {
    static void reverse(int[] arr, int i, int j){
        
        while(i< j) {
            swap( arr,i,j);
            i++;
            j--;
        }
    }
     static void rotateinplace(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        reverse(arr, 0 , n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
     }
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter k : ");
        int k = sc.nextInt();
        int[] ans = rotateinplace(arr, k);
        System.out.println("original array : ");
        for(int i =
}
    }

