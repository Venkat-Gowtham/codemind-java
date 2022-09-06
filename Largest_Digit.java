import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=0,z=0;
        while(a!=0)
        {
            x=a%10;
            if(x>z)
            {
                z=x;
            }
            a=a/10;
        }
        System.out.println(z);
    }
    
}