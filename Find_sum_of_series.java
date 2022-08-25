import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        float r=0;
        for(int i=1;i<=t;i++)
        {
            r+=(float)1/i;
        }
        System.out.println(String.format("%.2f",r));
    }
}
