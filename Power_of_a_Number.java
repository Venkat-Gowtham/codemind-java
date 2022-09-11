import java.util.*;
class g
{
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int r=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
            int s=(int)Math.pow(t,r);
            System.out.println(s%m);
        
    }
}