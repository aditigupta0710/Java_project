import java.util.Scanner;

<<<<<<< HEAD
public class numericalrectangularpattern{
=======
public class numericalrectangularpattern {
>>>>>>> fd55cd506cc306b1dda6cc9abacb25de8d9d54fb
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        

        for (int i = 1; i <= r; i ++) {
            for (int j = i; j <= r; j ++) {
                System.out.print(j);
            }
            for(int k = 1; k <= i-1; k++) {
                System.out.print(k);
            }
        } System.out.println();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> fd55cd506cc306b1dda6cc9abacb25de8d9d54fb
