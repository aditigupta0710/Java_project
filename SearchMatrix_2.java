public class SearchMatrix_2 {
    static boolean searchMatrix(int[][] a, int target) {
        int n = a.length, m = a[0].length;
        int i = 0, j = m-1;

        while(i < n && j >= 0) {
            if(a[i][j] == target) return true;
            if(target < a[i][j]) {
                j--; //move left
            } else {
                i++;//move down
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] a  = {{1,4,7,11,15}, {2,5,8,12,19},{3,6,9,16,22}, {10,13,14,17,24},{18,21,23,26,30}};
        int target = 21;
        System.out.println(searchMatrix(a, target));
    }
}

