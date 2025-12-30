import java.util.Scanner;
import java.math.BigInteger;
public interface addbiginteger {
public static void main(String[] args) {
    String number1 , number2;
    Scanner in = new Scanner(System.in);

    System.out.println("enter any first large number:");
    number1 = in.nextLine();

    System.out.println("enter any second large number:");
    number2 = in.nextLine();

    BigInteger first = new BigInteger(number1);
    BigInteger second = new BigInteger(number2);
    BigInteger sum;

    sum = first.add(second);

    System.out.println("result of addition = " +sum);
}
}
