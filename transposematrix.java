import java.util.Scanner;
public class transposematrix {
    static void printMatrix (int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++){ 
            System.out.print(matrix[i][j] + " ");
        }
    
        System.out.println();
        }
    }
    static int[][] findTranspose(int[][] matrix , int c,int r) {
        int[][] transpose = new int[c][r];
        for(int i = 0; i < c; i++) {
            for(int j = 0; j < r; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        return transpose;
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
        int[][] transpose = findTranspose(matrix, c, r);
        printMatrix(transpose);
    }
}