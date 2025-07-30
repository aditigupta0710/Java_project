import java.util.ArrayList;
import java.util.Collections;

public class collectioninbuiltreverse {

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
            Collections.reverse(list);

            System.out.println("reversed list : " + list);
            
        }
}


