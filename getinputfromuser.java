import java.util.Scanner;
class getinputfromuser {
    public static void main(String[] args) {
        int a;
        String s;
        float b;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        s = sc.nextLine();
        System.out.println("your entered string is: " +s);

        System.out.println("enter a integer ");
        a = sc.nextInt();
        System.out.println("your entered integer is: " +a);

        System.out.println("enter a float");
        b = sc.nextFloat();
        System.out.println("your entered float is: " +b);






    }
}
