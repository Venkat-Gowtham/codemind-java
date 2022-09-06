import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=0,b=a,c=a,r,s=0;
        while(b!=0)
        {
            f++;
            b=b/10;
        }
        while(c!=0)
        {
            r=c%10;
            s+=Math.pow(r,f);
            f--;
            c=c/10;
        }
        if(s==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
    }
    
}