import java.util.*;
class g
{
    public static void prime(int m,int n)
    {
        int i,j,c;
        if(m<=1)
        {
            m=2;
        }
        for(i=m;i<=n;i++)
        {   c=0;
            for( j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println(i);
            }
        }
    }
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
        int m=s.nextInt();
       int n=s.nextInt();
       prime(m,n);
}
}