public class radixsort {
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
    static void countsort (int[] a , int place) {
       int n = a.length;
        int[] output = new int[n];
        int max = findMax(a);
        int[] count = new int[10];
        for(int i = 0; i < a.length; i++) {
            count[(a[i]/place)%10]++;
        }
        // make prefix sum array of count array
        for(int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        //find the index of each element in the originalm array and put it in output array
        for(int i = n-1; i >= 0; i--) {
            int idx  = count[(a[i]/place)%10] - 1;
            output[idx] = a[i];
            count[(a[i]/place)%10]--;
        }
        // copy all elements of output to arr
        for (int i = 0 ; i < n; i++) {
            a[i] = output[i];
        }
    }
    static void RadixSort(int[] a) {
        int max = findMax(a);
        for(int place = 1; max/place > 0; place *= 10) {
            countsort(a,place);
        }
    }
    public static void main(String[] args) {
        int[] a = {43,453,626,894,0,3};
        RadixSort(a);
        display(a);
    }
}
