import java.util.Arrays;

class longestsubstring {
    public static int main(String[] args) {
        String s = "abcabcdb";
        int n = s.length();
        int[] last = new int[256];
        Arrays.fill( last, -1);
        int start = 0, ans = 0;
        for(int i = 0; i <= n; i++){
            int c = s.charAt(i);
            if(last[c] >= start) {
                start = last[c] +1;
            }
            last[c] = i;
            ans = Math.max(ans, i-start+1);
        }
        return ans;
    }
}