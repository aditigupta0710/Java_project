import java.util.*;
  public class comparelists {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(2,3,4));
        ArrayList <Integer> list1 = new ArrayList<>(Arrays.asList(2,3,5));
            boolean isEqual = list.equals(list1);
            System.out.println("ARE THE LISTS EQUAL : " +isEqual);
    }
}
