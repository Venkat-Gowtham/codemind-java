import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0,c=0;
         if(a==1)
        {
            a=2;
        }
        for(int i=a;i<=b;i++)
        {
            count=0;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}