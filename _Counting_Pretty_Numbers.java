import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=0,r;
            for(int j=a;j<=b;j++)
            {
                r=j%10;
                if(r==2||r==3||r==9)
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
