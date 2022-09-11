import java.util.*;
class g
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int s=0,r=1,f;
        while(t>0)
        {
            s+=t%10;
            r*=t%10;
            t=t/10;
        }
        System.out.println(r-s);
    }
}