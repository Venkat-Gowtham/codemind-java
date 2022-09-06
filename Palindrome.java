import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0,r,b=a,f=0;
        while(b!=0)
        {
            r=b%10;
            rev=rev*10+r;
            b=b/10;
        }
        
        if(rev==a)
        {
            System.out.println("True");
        }
        else
        {
           System.out.println("False");
        }
    }
    
}