public class firstoccurence {
    static int firstocc(int[] arr, int x) {
        int n = arr.length;
        int st = 0, end = n-1;
        int FO = -1;
        while(st <= end) {
            int mid = st + (end-st)/2;
            if(arr[mid] == x) {
                FO = mid;
                end = mid-1;
            } else if(x < arr[mid]) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return FO;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,6,2,4};
        int x = 5;
        System.out.println(firstocc(arr, x));
    }
}
