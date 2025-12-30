import java.util.Scanner;

public class gcd_recursion {
    static int GCD(int x , int y) {
        if(y == 0) {
            return x;
        }
        return GCD(y , x % y);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number : ");
        int x = sc.nextInt();

        System.out.println("enter second number : ");
        int y = sc.nextInt();

        System.out.println("gcd of " + x + " and " + y + " is : " + GCD(x, y));
    }
}
