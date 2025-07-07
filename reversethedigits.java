import java.util.Scanner;
public class reversethedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original_num = n;
        int reverseddigits = 0;
        while(n>0) {
           reverseddigits =  reverseddigits * 10 + n % 10;
            n /= 10;
        }
        System.out.println("reversed number is " +reverseddigits);
    }
}
