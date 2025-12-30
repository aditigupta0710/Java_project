import java.util.ArrayList;
    public class somemoremethods {
    public static void main(String[] args) {
        ArrayList <Integer> l1 = new ArrayList<>();
        l1.add(6);
        l1.add(46);
        l1.add(47);
        l1.add(26);
        l1.add(47);
        l1.add(26);
        
       System.out.println(l1.indexOf(83));
       System.out.println(l1.lastIndexOf(47));
       System.out.println(l1.lastIndexOf(26));

    }
}
