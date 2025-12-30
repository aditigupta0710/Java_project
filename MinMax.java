public class MinMax {
    // Example: Find minimum x such that condition(x) is true
    static boolean condition(int x) {
        return x * x >= 30; // Example condition (x^2 >= 30)
    }

    public static void main(String[] args) {
        int low = 0, high = 100, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (condition(mid)) {  
                ans = mid;        
                high = mid - 1;    
            } else {
                low = mid + 1;   
            }
        }

        System.out.println("Minimum x = " + ans);
    }
}
