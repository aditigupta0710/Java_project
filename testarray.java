public class testarray {
public static void change(int[] arr) {
    arr[0] = 99;
}
public static void main(String[] args) {
    int[] nums = {1,2,3};
    change(nums);
    System.out.println(nums[0]);
}
}
