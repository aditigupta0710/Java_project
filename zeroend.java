public class zeroend {
    static void bubblesort(int[] a) {
        int n = a.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0 ; j < n-i-1; j++) {
                if (a[j] == 0 && a[j+1] != 0) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {0, 5, 0, 3, 42};
        bubblesort(a);
        for(int val : a) {
            System.out.print(val + " ");
        }
    }
}
