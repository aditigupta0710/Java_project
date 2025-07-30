import java.util.ArrayList;
    public class methodsofarrraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(8);
        l1.add(6);
        l1.add(9);
        // get an element at index i
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));

        //print with for loop
        for(int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) +  " ");
        }

        //printing the arraylist directly

        System.out.println(l1);

        // adding element at some index i
        l1.add(1, 50);
        System.out.println(l1);

        // modifying element at some index i

        l1.set(1, 100);
        System.out.println(l1);

        // to remove element 
        l1.remove(1);
        System.out.println(l1);
        // removing an element e
        l1.remove(Integer.valueOf(100));
        System.out.println(l1);
        
    }
}




