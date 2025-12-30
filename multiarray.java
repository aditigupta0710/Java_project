public class multiarray {
    static void printArray(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                    {1,4,6},
                     {5,7,8},
                    {7,9,6},
                };
                printArray(arr);
    }
}
