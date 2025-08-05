import java.util.Scanner;
    public class printFibonacci {
        static int fibonacci(int n) {
            if (n == 0 || n == 1) {
                return n;
            }
            int prev = fibonacci(n-1);
            int PrevPrev = fibonacci(n-2);
            
            return  prev + PrevPrev;
            
        }
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++) {
            System.out.println(fibonacci(i));
        }
    }
}