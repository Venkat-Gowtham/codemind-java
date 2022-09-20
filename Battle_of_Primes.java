import java.util.*;
class sol
{
    public static int prime(int n)
    {
        if(n<=1)
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
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int c=0;
        for(int i=n1+n2+1;i<1000;i++)
        {
            c+=1;
            if(prime(i)==1)
            {
                break;
            }
        }
        System.out.println(c);
    }
}