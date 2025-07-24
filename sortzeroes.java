import java.util.Scanner;

public class sortzeroes{
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

    static void sortzeroes(int[] arr) {
        int n = arr.length;
        int zeroes = 0;
        // count number of zeroes
        for(int i = 0; i < n;i++){
            if(arr[i] == 0) {
                zeroes++;
            }        
    }
    // 0 to zeroes-1 : 0, zeroes to n-1 : 1
    for(int i = 0; i  < n; i++) {
        if(i  < zeroes) {
            arr[i] = 0;
        } else {
            arr[i] = 1;
        }
        }
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
        sortzeroes(arr);
        System.out.println("sorted array : ");
        printArray(arr);
    }
}