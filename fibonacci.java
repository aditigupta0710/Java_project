import java.util.Scanner;

public class fibonacci {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int a = 0, b =1;

    System.out.print("fibonacci: ");
    for(int i = 1; i <= num ; i++) {
        System.out.print(a +  " ");
        int sum = a + b;
        a = b;
        b = sum;
    }
}
}
