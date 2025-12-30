import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
    public class FindDuplicates {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(2, 4, 4, 45, 45, 23 ,96, 23 ,96));
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int num : list){
            if(!seen.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("duplicates : " + duplicates);

    }
}
