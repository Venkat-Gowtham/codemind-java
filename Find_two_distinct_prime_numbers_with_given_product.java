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
        int n=0,b=0,c=0;
        for(int i=1; i<a; i++)
    {
        for (int j=1; j<a; j++)
        {
            if (i!=j && i*j==a && prime(i)==1 && prime(j)==1)
            {
                n=i;
                b=j;
                c=1;
                break;
            }
        }
        if (c==1)
        {
            break;
        }
    }
     if(c==1)
     {
         System.out.println(n+" "+b);
     }
     else
     {
         System.out.println(-1);
     }
    }
}