public class oddcount {
    public static void main(String[] args) {
        int count= 0;
        for(int i = 1;i <= 100; i++) 
        {
            if(i % 2 != 0)
            {
                count++;
            }
        }
        System.out.println("the count off odd numbers are: " +count);
    }
}