public class lastoccurence {
    static int lastocc(int[] arr, int x) {
        int n = arr.length;
        int st = 0, end = n-1;
        int LO = -1;
        while(st <= end) {
            int mid = st + (end-st)/2;
            if(arr[mid] == x) {
                LO = mid;
                st = mid+1;
            } else if(arr[mid] < x) {
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return LO;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,6,6,6,7,7,7,8};
        int x = 5;
        System.out.println(lastocc(arr, x));
    }
}
