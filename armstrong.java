public class armstrong {
public static void main(String[] args) {
    int n,arg,sum = 0,r;
    n = 153;
    arg = n;
    for (int i = 1; i < 200; i++)
    {
        while(n>0)
        {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n/10;

        }
    }
    if(arg == sum)
    {
            System.out.println("given number is armstrong number: " + arg);
    }
    else
    {
            System.out.println("given number is not armstrong number:" + arg);
    }

        }
    }

