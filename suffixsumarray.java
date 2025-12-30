    import java.util.Scanner;

public class suffixsumarray {
        static int[] makesuffixsumarray(int[] arr){
            int n = arr.length;
            for(int i = n-2 ;i >= 0; i--) {
                arr[i] = arr[i] + arr[i+1];
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
        int[] pref = makesuffixsumarray(arr);
        printArray(pref);
    
    }
}

