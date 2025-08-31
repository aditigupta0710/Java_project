public class SortArr {
    static void displayarr(int[] num) {
        for (int val : num) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void sortarray(int[] num) {
        int n = num.length;
        int x = -1 , y = -1;
        if (n <= 1) return;
        for(int i = 1; i < n; i++) {
            if(num[i-1] > num[i]) {
                if(x == -1) {
                    x = i-1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }
       // swap x ,y in num
       int temp = num[x];
      num[x] = num[y];
       num[y] = temp;
    }
    public static void main(String[] args) {
        int[] num = {3 , 8 , 6 , 7 , 5 , 9 ,10};
        sortarray(num);
        displayarr(num);
    }
}