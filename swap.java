public class swap {
    public static void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;
    }
    public static void main(String[] args) {
        int a = 5 , b = 7;
        swap(a,b);
        System.out.println(a + " " + b);
    }
}
