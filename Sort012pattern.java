public class Sort012pattern {
    static void displayarr(int[] a) {
        for(int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void swap (int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    static void sort012(int[] a) {
        int low = 0, mid = 0, high = a.length-1;
        // explore the unknown region
        while(mid <= high) {
            if(a[mid] == 0) {
                swap(a,mid,low);
                mid++;
                low++;
            } else if(a[mid] == 1) {
                mid++;
            } else {
                swap(a, mid, high);
                high--;
            }
        } 
    }
    public static void main(String[] args) {
        int[] a  = {2,2,1,0,0,0,1,1,1,2,2,2,1,2,0,1,0,2};
        sort012(a);
        displayarr(a);
    }
}