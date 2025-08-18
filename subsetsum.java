public class subsetsum {
    static void subsetSum(int[] arr, int n, int idx, int currsubsetsum) {
        if(idx >= n) {
            System.out.println(currsubsetsum);
            return;
        }
                //curr idx + currsubsetsum
        subsetSum(arr, n, idx+1, currsubsetsum+arr[idx]);//include
        //curr ans
        subsetSum(arr, n, idx+1, currsubsetsum);// exclude
    }
    public static void main(String[] args) {
        int[] arr = {2 , 4, 5};
        subsetSum(arr, arr.length, 0, 0);        
    }
}