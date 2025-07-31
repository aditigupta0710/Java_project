import java.util.*;

    public class removeeven {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        l1.removeIf(n -> n % 2 == 0);
        System.out.println(l1);
        System.out.println("after removing even : " +l1);
    }
}
