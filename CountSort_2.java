public class CountSort_2{
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
            System.out.print(val + " ");
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
    static void countsort (int[] a) {
       int n = a.length;
        int[] output = new int[n];
        int max = findMax(a);
        int[] count = new int[max+1];
        for(int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        // make prefix sum array of count array
        for(int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        //find the index of each element in the originalm array and put it in output array
        for(int i = n-1; i >= 0; i--) {
            int idx  = count[a[i]] - 1;
            output[idx] = a[i];
            count[a[i]]--;
        }
        // copy all elements of output to arr
        for (int i = 0 ; i < n; i++) {
            a[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] a = {1,4,5,5,3,2,2,5};
        countsort(a);
        display(a);
    }
}
