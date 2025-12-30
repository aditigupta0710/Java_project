import java.util.Scanner;

public class makeprefixsumarray {
        static int[] makeprefixsumarray(int[] arr){
            int n = arr.length;
            for(int i = 1;i < n; i++) {
                arr[i] = arr[i-1] + arr[i];
            }
            return arr;
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
        int[] pref = makeprefixsumarray(arr);
        printArray(pref);
    
    }
}
