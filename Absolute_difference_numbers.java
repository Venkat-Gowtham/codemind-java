import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int f=(int)Math.pow(10,b);
           int r=(int)a%f;
        while(a>f)
        {
            a=a/10;
        }
        System.out.println(Math.abs(r-a));
    }
    
}