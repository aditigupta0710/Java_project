import java.util.Scanner;

public class sumrecursion  {
    static int SOD(int n) {
        if(n >= 0 &&  n <= 9) {
            return n;

        }
        int smallans = SOD(n/10);
        return smallans + n % 10;
        
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
        System.out.println(SOD(n));

    }
}