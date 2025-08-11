public class recursionSum_array {
    static int SumofArray(int arr[] , int idx) {
        if(idx == arr.length){
            return 0;
        }
        return arr[idx] + SumofArray(arr, idx+1);
    }
    public static void main(String[] args) {
        int [] arr = {2, 4, 4, 5};
        System.out.println(SumofArray(arr, 0));
    }
}
