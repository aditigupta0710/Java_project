import java.util.Scanner;
public class swapnumber {
    public static void main(String[] args) {
        int x,y;
        System.out.println("enter x and y");
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        System.out.println("before swapping\nx = " +x+ "\ny = " +y);

        x = x+y;
        y =x-y;
        x = x-y;

        System.out.println("after swapping\nx = " +x+ "\ny = "+y);


    }
}
