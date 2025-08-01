import java.util.Scanner;

public class sortzeroesandoneinplace{
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

     static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void sortzeroesandoneinplace(int[] arr) {
        int n = arr.length;
        int left = 0, right = n-1;
        while(left < right) {
            if(arr[left] == 1 && arr[right] == 0) {
                swap(arr, left , right);
                left++;
                right--;
            } 
            if(arr[left] == 0) {
                left++;
            }
            if(arr[right] == 1) {
            right--;
        }
    }
    printArray(arr);
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
        sortzeroesandoneinplace(arr);
        System.out.println("sorted array : ");
        printArray(arr);
    }
}