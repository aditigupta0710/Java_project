public class Binarysearch {
    static int binarySearch(int[] num, int numtofind) {
        int low = 0;
        int high = num.length-1;
        while (low <= high) {
            int middleposition = (low + high) / 2;
            int middlenumber = num[middleposition];
            if(numtofind == middlenumber) {
                return middleposition;
            }
            if(numtofind < middlenumber) {
                high = middleposition-1;
            } else {
                low = middleposition+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 4, 5, 7, 9, 11};
        System.out.println(binarySearch(num, 9));
    }
}