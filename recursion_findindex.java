public class recursion_findindex {
    static int findindex(int[] arr, int target, int idx) {
        if(idx >= arr.length) {
            return -1;
        }
        if(arr[idx] == target) return idx;

        return findindex(arr, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,5,6};
        int target = 4;
        System.out.println(findindex(arr, target, 0));
    }
}

