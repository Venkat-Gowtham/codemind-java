import java.util.*;
class g
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int v=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                v+=i;
            }
        }
        if(v==n)
        {
            System.out.println("True");
        }
        else
        {
         System.out.println("False");   
        }
        
}
}