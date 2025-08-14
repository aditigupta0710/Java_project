import java.util.Scanner;
 
public class remove_a {
    static String removeA(String word, int idx ) {
        if (idx == word.length()) return " " ;

        String smallans = removeA(word, idx+1);

        char currchar = word.charAt(idx);
        if(currchar != 'a'){
            return currchar + smallans;
        }
        else {
            return smallans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
    System.out.println(removeA(word, 0));
    }
}