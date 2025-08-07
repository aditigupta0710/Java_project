import java.util.Scanner;

public class powerpq {

    static int power(int p, int q) {
        if(q == 0) return 1;
        return power(p, q-1) * p;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        System.out.println(p);

        int q = sc.nextInt();
        System.out.println(q);
        System.out.println(power(p, q));
    
    }
}
