import java.util.Scanner;

public class arraymanipulation {
    
    static int findmax(int[] arr){
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mx){
                mx = arr[i];
            }
        }
        return mx;
    }

    static int findsecondmax(int[] arr){
        int mx = findmax(arr);
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = findmax(arr);
        return secondmax;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array : ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("enter " + n + " element ");
            for(int i = 0 ; i < arr.length; i++){
                arr[i]  = sc.nextInt();
        }
        System.out.println("first maximum element : " +findmax(arr));
        System.out.println("second maximum element : " +findsecondmax(arr));
    }
}
