import java.util.*;
class g
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int r=sc.nextInt();
            float k=(float)Math.sqrt(r);
            int s=(int) k;
            if(k==s)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}