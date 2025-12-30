import java.util.Scanner;
    public class transposeinplace {
    static void printMatrix (int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){ 
            System.out.print(matrix[i][j] + " ");
        }
    
        System.out.println();
        }
    }
    static void transposeinPlace(int[][] matrix,int r, int c) {
        for(int i = 0; i < c; i++) {
            for(int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and columns of matrix 1 : ");
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
        System.out.println("input matrix : ");
        printMatrix(matrix);
        System.out.println("transpose of matrix");
        transposeinPlace(matrix, r, c);
        printMatrix(matrix);
    }
}

