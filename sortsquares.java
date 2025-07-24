 import java.util.Scanner;

public class sortsquares{
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
     static void reverse(int[]arr){
        int i = 0, j = arr.length-1;
        while(i < j){
        swap(arr,i,j);
            i++;
        j--;
        }

    }
    static int[] sortsquares(int[] arr) {
        int n = arr.length;
        int left  = 0, right = n-1, k = 0;
        int[] ans = new int[n];
        while(left <= right) {
            // bigger number's square is added to ans
            if(Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k] = arr[left] * arr[left];
                k++;
                left++;
            } else {
                ans[k++] = arr[right];
                right--;
            }
        } return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " elements  :");
        for(int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("original array : ");
        printArray(arr);
        int[] ans = sortsquares(arr);
        
        System.out.println("sorted array : ");
        reverse(ans);
        printArray(ans);
    
    }
}

