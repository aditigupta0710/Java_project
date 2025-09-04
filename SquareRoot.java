public class SquareRoot {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        int left = 1, right = x, ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (mid <= x / mid) { 
                ans = mid;       
                left = mid + 1;  
            } else {
                right = mid - 1; 
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int num = 17;
        System.out.println("Square root of " + num + " is: " + mySqrt(num));
    }
}
