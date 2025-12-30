public class thirdinteger{

    static void swap(int a, int b){
        System.out.println("original values before swap : ");
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("values after swap: ");
        
    }
    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int[] arr = {1,2,3,4,5};
        swap(a,b);
    }
}