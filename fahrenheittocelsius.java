import java.util.Scanner;
public class fahrenheittocelsius {
    public static void main(String[] args) {
        float temperature;
        Scanner in = new Scanner(System.in);

        System.out.println("enter tempertaure in fahraenheit: ");
        temperature = in.nextFloat();

        temperature = ((temperature - 32)*5)/9;
        System.out.println("temperature in celsius:" +temperature);

    }
}
