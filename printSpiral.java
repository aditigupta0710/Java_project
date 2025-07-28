import java.util.Scanner;
 public class printSpiral {
    static void printMatrix (int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){ 
            System.out.print(matrix[i][j] + " ");
        }
    
        System.out.println();
        }
    }
    static void printSpiralorder(int[][] matrix, int r, int c){
        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalelements = 0;
        while(totalelements < r * c) {
            // topRow = leftcol to rightcol
            for(int j = leftCol; j <= rightCol; j++){
                System.out.println(matrix[topRow][j] + " ");
                totalelements++;
            }
            topRow++;
            // rightcol = toprow to bottomrow
            for(int i  = topRow; i <= bottomRow; i++){
                System.out.println(matrix[i][rightCol] + " ");
                totalelements++;
            }
            rightCol--;

            //bottomrow = rightcol to leftcol
            for(int j = rightCol; j >= leftCol; j--){
                System.out.println(matrix[bottomRow][j] + " ");
                totalelements++;
            }
            bottomRow--;
            //leftcol = bottomrow to toprow
            for(int i = bottomRow; i >= topRow; i-- ){
                System.out.println(matrix[i][leftCol] + " ");
                totalelements++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns of matrix  : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelements = r*c;
        System.out.println("enter " + totalelements + " values : ");
        for(int i = 0; i  < r; i++) {
             for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
             }
        }
        System.out.println("Input matrix : ");
        printMatrix(matrix);

        System.out.println("spiral order: ");
        printSpiralorder(matrix, r, c);
        
    }
}
