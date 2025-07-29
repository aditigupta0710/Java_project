import java.util.Scanner;

public class generateSpiral {
    static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    static int[][] generateSpiral(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0, rightCol = n-1, bottomRow = n-1, leftCol = 0;
        int curr  = 1;
        while(curr <= n * n) {
        for(int j = leftCol; j <= rightCol && curr <= n*n; j++){
        matrix[topRow][j] = curr;
        curr++;
        }
        topRow++;
        // rightcol= toprow to bottomrow
        for(int i = topRow; i <= bottomRow && curr <= n*n; i++){
            matrix[i][rightCol] = curr;
            curr++;
        }
        rightCol--;
        // bottomrow = rightcol to leftcol
        for(int j = rightCol; j >= leftCol && curr <= n*n ; j-- ) {
            matrix[bottomRow][j] = curr;
            curr++;
        }
        bottomRow--;
        //leftcol = bottomrow to toprow
        for(int i = bottomRow; i >= topRow && curr <= n*n; i--) {
            matrix[i][leftCol] = curr;
            curr++;
        }
        leftCol++;
    }
    return matrix;
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n : ");
    int n = sc.nextInt();

    int[][] matrix = generateSpiral(n);
    printMatrix(matrix);
    }
}
