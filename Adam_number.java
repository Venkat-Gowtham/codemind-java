import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int s=1,r,t=1,k=0,u,v=0;
        s=num*num;
        while(num!=0)
        {
            r = num%10;
            k = k*10+r;
            num = num/10;
        }
         t = k*k;
        while(t!=0)
        {
            u = t%10;
            v = v*10+u;
            t = t/10;
        }
        if(s== v)
         {
            System.out.println("True");
         }
        else
         {
             System.out.println("False");
         }
    }
}