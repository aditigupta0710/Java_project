public class printFactorial {
    static int printfactorial(int n) {
        if(n == 0) {
            return 1;
        }
        int smallans = printfactorial(n-1);

        int ans = n * smallans;
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(printfactorial(5));
    }
}
