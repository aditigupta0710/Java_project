import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumofdigits =0;
        int original_num = n;

        while(n!= 0) {
            sumofdigits += n % 10;
            n = n/10;
        }
        System.out.println("sum of digits of given number: " + original_num + "=" +sumofdigits);
    }
}
