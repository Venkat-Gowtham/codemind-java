import java.util.*;
class g
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int v=0,r;
        while(n!=0)
        {
         r=n%10;
         v+=r;
         n=n/10;
         if(n==0 && v<=9)
         {
             System.out.println(v);
             break;
         }
         else if(n==0 && v>9)
         {
             n=v;
             v=0;
         }
        }
}
}