public class allindex {
    static void findallindex(int[] arr, int target, int idx) {
        if(idx >= arr.length) {
            return;
        }
        if(arr[idx] == target) {
            System.out.println(idx);
        }

        findallindex(arr, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,5,6};
        int target = 4;
        findallindex(arr, target, 0);
    }
}



