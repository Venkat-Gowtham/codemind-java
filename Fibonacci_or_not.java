import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=0,y=1,z=0;
        int c=0;
        if(a==0 || a==1)
        {
            System.out.println("True"); 
        }
        else
        {
        while(true)
        {
            z=x+y;
            if(z==a)
            {
               System.out.println("True"); 
               break;
            }
            else if(z>a)
            {
             System.out.println("False");
             break;
            }
            x=y;
            y=z;
        }
        }
    }
    
}