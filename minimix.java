public class minimix {
    public static void main(String[] args) {
        int[] arr = {3,5,1,9,2};
        int max = arr[0], min = arr[0];

        for(int i : arr) {
            if(i > max) max = i;
            if(i < min)min = i;
        }
        System.out.println("max : " +max);
        System.out.println("min : " +min);
    }
}
