import java.util.Scanner;
public class whileloop {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        
        while(true) {
            System.out.println("input an integer");
            n = input.nextInt();

            if(n == 0) {
                break;
            }
            System.out.println("you entered " +n);
        }
    }
}
