import java.util.Scanner;

public class rotatematrix {
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposeinplace(int[][] matrix , int r, int c){
                for(int i = 0; i < c; i++) {
                    for(int j = i; j < r; j++) {
                     int temp = matrix[i][j];
                     matrix[i][j] = matrix[j][i];
                     matrix[j][i] = temp;
                    }
                }

    }
    static void reverseArray(int[] arr){
        int i = 0; int j = arr.length-1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][] matrix, int r , int c) {
        transposeinplace(matrix , r , c);
        for(int i = 0; i < r ; i++) {
            reverseArray(matrix[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows and column of matrix 1: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelements = r * c;
        System.out.println("Enter " + totalelements + "values : ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input matrix : ");
        printMatrix(matrix);
        rotate(matrix, r , c);

        System.out.println("rotation of matrix : ");
        printMatrix(matrix);
    }
}
