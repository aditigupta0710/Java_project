public class isSortedrecursion {
    static boolean issorted(int[] arr, int index) {
        if(index == arr.length-1) {
            return true;
        }
        if(arr[index] > arr[index+1]) {
            return false;
        }
        return issorted(arr, index+1);
    }
    
    public static void main(String[] args) {
        int[] arr = {2,3,4,5};
        System.out.println("is array sorted : " +issorted(arr, 0));
    }

}


