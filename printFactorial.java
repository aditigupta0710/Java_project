public class printFactorial {
    static int printfactorial(int n) {
        if(n == 0) return 1;
        return n * printfactorial(n-1);
        

    }

    public static void main(String[] args) {
        System.out.println(printfactorial(5));
    }
}
