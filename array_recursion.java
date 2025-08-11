public class array_recursion {
    
    static void printarray (int[] arr , int idx) { // 5,6,7,8
        //base case
        if(idx == arr.length) {
            return;

        }
        //self work
        System.out.println(arr[idx]); // 5
        //recursive work = sub problem

        printarray(arr, idx+1);
    }
    public static void main(String[] args) {
        int [] arr = {5,6,7,8,9};
        printarray(arr, 0);
    }
}


