import java.util.*;

public class frequency {
    public static void main(String[] args) {
        int[] arr  = {1,1,2,2,2,2,3,4,4,3,3,3,4,4,4};
        Map<Integer , Integer>map = new 
        HashMap<>();
        for (int i : arr)
            map.put(i, map.getOrDefault(i,0) + 1);
            System.out.println(map);
    }    
}
