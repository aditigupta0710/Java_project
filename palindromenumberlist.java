public class palindromenumberlist {
    public static void main(String[] args) {
        int n,b,rev = 0;
        int limit = 100;
        System.out.println("palindrome numbers from 1 to N:");
        for(int i = 1;i<=limit;i++)
        {
            n = i;
            while(n>0)
            {
                b = n % 10;
                rev = rev * 10 + b;
                n = n / 10;
            }
            if(rev == i)
            {
                System.out.println(i + "");
            }
            rev = 0;
        }
    }
}
