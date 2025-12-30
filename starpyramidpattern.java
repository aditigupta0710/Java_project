public class starpyramidpattern {
    public static void main(String[] args) {
        int n =4;

        for ( int i = 1; i <= n; i++) {

            for (int j = i; j < n; j++) {
                System.out.println(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                System.out.println("*");
            }
            System.out.println();
        }  
      }
}
