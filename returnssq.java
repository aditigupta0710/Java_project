import java.util.ArrayList;

public class returnssq {
    static ArrayList<String>getssq(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if(s.length() == 0) {
            ans.add(" ");
            return ans;
        }

        char curr = s.charAt(0);
        ArrayList<String> smallans = getssq(s.substring(1));
        //smallans = ["bc" "b" "c" ""]
        for(String ss : smallans) {
            ans.add(ss);
            ans.add(curr + ss);

        } 
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = getssq("aditi");
        for(String ss : ans) {
            System.out.println(ss);
        }

    }
}