import java.util.Scanner;
 public class recursionproblem_1 {
    static void PrintInteger(int n) { // 1 2 3 4 ..... n
        if(n == 1) {
            System.out.println(n);
            return;
        }

        PrintInteger(n -1); // 1 2 3 4 .... n-1
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintInteger(n);
    }
 }