import java.util.*;

public class removeduplicates {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,3,5,8,4,8,9,3,2,5,7};
        Set<Integer> set = new
        LinkedHashSet<>();
        for (int i : arr) set.add(i);
        System.out.println(set);
    }    
}
