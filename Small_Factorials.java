import java.util.*;
class g
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=0;
        for(int i=0;i<t;i++)
        {
            int r=sc.nextInt();
            int s=1;
            for(int j=1;j<=r;j++)
            {
                s*=j;
            }
            System.out.println(s);
        }
        
    }
}