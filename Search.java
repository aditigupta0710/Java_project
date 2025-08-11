public class Search {
    static boolean search(int[] arr, int target, int idx) {
        if(idx >= arr.length) {
            return false;
        }
        if(arr[idx] == target) return true;

        return search(arr, target, idx+1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,6};
        int target = 5;
        if(search(arr, target, 0)) {
            System.out.println("Yes . ");
        } else{
            System.out.println("No..");
        }
    }
}
