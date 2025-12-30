 import java.util.Scanner;
    public class countfunction {

    static int countdigits(int n) {
        if(n < 10) return 1;
        return 1 + countdigits(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countdigits(n));
    }
}
