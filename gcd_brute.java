
import java.util.Scanner ;

    public class gcd_brute {
        static int GCD(int x, int y) {
            int gcd = 1; //default gcd value
            int min = (x > y) ? x : y;

            for(int i = min; i >= 1; i--){
                if (x % i == 0 && y % i == 0) {
                    gcd = i;
                    break; // first largest common divisor
                }
            }
            return gcd;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int x = sc.nextInt();
        System.out.println("enter second number : ");
        int y = sc.nextInt();

        System.out.println("GCD of " + x + " and " + y + " is : " +GCD(x , y));
        sc.close();

    }
}