import java.util.*;
class f
{
    public static int gcd(int a,int b)
    {
        if(a%b==0)
        {
            return b;
        }
        return gcd(b,(a%b));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int hcf=a[0];
        for(int i=1;i<n;i++)
        {
            hcf=gcd(hcf,a[i]);
        }
        System.out.println(hcf);
    }
}