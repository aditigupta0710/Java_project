import java.util.Scanner;

public class countdigits{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int numofdigits = 0;
        int original_n = num;


        while(num > 0) {
            num = num / 10;
            numofdigits++;
        }
        System.out.println("number of digits in " + original_n + " = " + numofdigits);
    }

    }

