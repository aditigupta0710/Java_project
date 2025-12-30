import java.util.ArrayList;

public class findallindices {
    static ArrayList<Integer> allindices(int[] arr, int x, int idx){
        if(idx >= arr.length) {
            return new ArrayList<Integer>();
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if(arr[idx] == x) {
            ans.add(idx);
        }
        ArrayList<Integer> smallans = allindices(arr, x, idx+1);
        ans.addAll(smallans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,5,6,2,2,2};
        int x = 2;
        ArrayList<Integer> ans = allindices(arr, x, 0);
        for(Integer i : ans) {
            System.out.println(i);
        }

    }
}
