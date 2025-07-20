import java.util.Scanner;

public class question_2 {
    static int lastoccurences(int arr[] , int x) {
        int lastindex = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x){
                lastindex = i;
            }
        }
        return lastindex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n= sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter " + n + " elements  : ");
        for(int i = 0 ; i < arr.length ; i ++) {
            arr[i] = sc.nextInt();
        } 

        System.out.println("enter x : ");
        int x = sc.nextInt();
        System.out.println("count of x : " +lastoccurences(arr, x));
    }    
    }
    

