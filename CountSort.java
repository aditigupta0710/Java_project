public class CountSort {
    static int findMax(int[] a) {
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > mx) {
                mx = a[i];
            }
        }
        return mx;
    }

    static void display(int[] a) {
        for(int val : a) {
            System.out.println(val + " ");
        }
        System.out.println();
    }
    static void basiccountsort(int[] a) {
        int max = findMax(a);
        int[] count = new int[max+1];
        for(int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        int k  = 0;
        for(int i = 0; i < count.length; i++) {
            for(int j = 0; j < count[i]; j++) {
                a[k++] = i;
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,4,5,5,3,2,2,5};
        basiccountsort(a);
        display(a);
    }
}
