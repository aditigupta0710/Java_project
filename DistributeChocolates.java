public class DistributeChocolates {
   static boolean isDivisionPossible(int[] a, int m, int mxchocAllowed){
        int numofstudents = 1;
        int choc = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > mxchocAllowed) return false;
            if(choc + a[i] <= mxchocAllowed) {
                choc += a[i];
            }else {
                numofstudents++;
                choc = a[i];
            }
        }
        if(numofstudents > m) return false;
        return true;
    }
    static int distributechocolates(int[] a,int m) {
        if(a.length < m) return -1;
        int ans = 0, st = 1, end = (int)1e9;
        while(st <= end) {
            int mid = st + (end-st)/2;
            if(isDivisionPossible(a,m,mid)) {
                ans = mid;
                end = mid -1;

            } else {
                st = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {12,34,67,90};
        int m =2;
        System.out.println(distributechocolates(a, m));
    }
}
