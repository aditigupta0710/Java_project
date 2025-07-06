
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        int passingmarks,marksobtained;
        passingmarks = 30;
        Scanner in = new Scanner(System.in);
    System.out.println("enter marks scored by you: ");
    marksobtained = in.nextInt();
    if (marksobtained >= passingmarks) {
        System.out.println("you passed the exam. good job");
    }
    else{
        System.out.println("you failed the exam. better luck next time!!");
    }
    }
}
