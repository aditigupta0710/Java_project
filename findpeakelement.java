public class findpeakelement {
    static int findPeakElement(int[] nums) {
        int n = nums.length;
        int st = 0, end = n-1;
        while(st <= end) {
            int mid = st + (end-st) /2;
            if((mid == 0 || nums[mid] > nums[mid-1]) && (mid == n-1 || nums[mid] > nums[mid+1])) {
                return mid;
            }
            if(nums[mid] < nums[mid+1]) {
                st = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
}