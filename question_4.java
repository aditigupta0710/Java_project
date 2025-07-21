import java.util.Scanner;
    public class question_4 {
        static boolean isSorted(int[] arr) {
            boolean check = true;
            for(int i = 1; i < arr.length; i++) {
                if(arr[i] < arr[i-1]){
                    // not sorted
                    check = false;
                    break;
                }
            }
            return check;
        }

        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            System.out.println("enter size of array : ");
            int n = sc.nextInt();
n(
            int[] arr = new int[n];
            System.out.printl"enter " + n + " element ");
            for(int i = 0 ; i < arr.length; i++){
                arr[i]  = sc.nextInt();
            }            
            System.out.println("is Sorted : " +isSorted(arr));
        }
}
