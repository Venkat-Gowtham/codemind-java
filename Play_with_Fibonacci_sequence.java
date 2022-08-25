import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        System.out.printf("0 1 ");
        int a=0,b=1,c=0;
        t=t-2;
        while(t>0)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            t--;
        }
    }
}
