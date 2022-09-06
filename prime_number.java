import java.util.*;
class gowtham
{
    public static int prime(int n)
    {
        if(n<2)
        {
            return 0;
        }
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
       if(prime(a)==1)
       {
           System.out.println("prime");
       }
       else
       {
           System.out.println("not a prime");
       }
    }
}