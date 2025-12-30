import java.util.Arrays;
import java.util.Scanner;

public class question_5 {
    static int[] smallestandlargestelement(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0] , arr[arr.length - 1]};
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter" + n + " element ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int[] ans = smallestandlargestelement(arr);
        System.out.println("smalest : " +ans[0]);
        System.out.println("largest : " +ans[1]);
        
    }
}

