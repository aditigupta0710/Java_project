import java.util.Scanner;

public class tripletsum {
    static int tripletsum(int[] arr , int target) {
        int ans = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i+1; i < n; j++){
                for(int k = j+1; j < n; j++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter " + n + " element ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter target sum : ");
        int target = sc.nextInt();

        System.out.println(tripletsum(arr, target));

    }
}
