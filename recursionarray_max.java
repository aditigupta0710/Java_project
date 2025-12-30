public class recursionarray_max {
    static void printArray(int arr[] , int idx) {
        if(idx == arr.length) {
            return ;
        }
        System.out.println(arr[idx]);
        printArray(arr, idx);
    }

    static int maxInArray(int arr[] , int idx) {
        if (idx == arr.length-1) {
            return arr[idx];
        }
        int smallAns = maxInArray(arr, idx+1);
        return Math.max(arr[idx] , smallAns);
    }

    public static void main(String[] args) {
        int [] arr = {10,4,5,67,32,21};
        // printArray(arr, 0);
        System.out.println(maxInArray(arr, 0));
    }
}
