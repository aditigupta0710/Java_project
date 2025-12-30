import java.util.Scanner;

public class largestofthreenumbers {
public static void main(String[] args) {
    int a,b,c;
    System.out.println("enter any three numbers: ");
    Scanner in = new Scanner(System.in);

    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    if (a > b && a > c)
    System.out.println("the largest of all numbers is : " +a);
    else if (b > a && b > c)
     System.out.println("the largest of all numbers is : " +b);
     else if (c > a && c > b)
      System.out.println("the largest of all numbers is : " +c);
      else
       System.out.println("number not exist");

}    
}
