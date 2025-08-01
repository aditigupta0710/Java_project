import java.util.ArrayList;
    public class mergearraylist {
    public static void main(String[] args) {
        ArrayList <String> list1 = new ArrayList<>();
        list1.add("Aditi");
        list1.add("Payal");
    
        System.out.println(list1);

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Ambika");
        list2.add("Shreya");

        list1.addAll(list2);

    
        System.out.println(list2);
        System.out.println("After merging both the arraylists :- " +list1);
    }
}
