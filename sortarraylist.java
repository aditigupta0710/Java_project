import java.util.ArrayList;
import java.util.Collections;
 public class sortarraylist{

        static void reverselist(ArrayList<Integer> list) {
            int i = 0, j = list.size()-1;
            while(i<j){
                /*
                 * int temp = a;
                 * a = b;
                 * b = temp;
                 */

                 Integer temp = Integer.valueOf(list.get(i));
                 list.set(i, list.get(j));
                 list.set(j, temp);

                 i++;
                 j--;
                
            }
        }
        
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(0);
            list.add(3);
            list.add(5);
            list.add(6);
            list.add(7);
            list.add(9);

            System.out.println("original arraylist : " + list);
            reverselist(list);

            System.out.println("reversed list : " + list);

            Collections.sort(list);
            System.out.println("Ascending order" +list); 
            Collections.sort(list , Collections.reverseOrder());
            System.out.println("descending order " +list);

            ArrayList <String> l1 = new ArrayList<>();
            l1.add("welcome ");
            l1.add("to");
            l1.add("coding");
            l1.add("world");

            System.out.println("original list : " +l1);
            Collections.sort(l1);
            System.out.println("arranged in ascending order : " +l1);
            Collections.sort(l1, Collections.reverseOrder());
            System.out.println("arranged in descending order : "+l1);
        
 }
    }