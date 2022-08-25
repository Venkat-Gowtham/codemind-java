import java.util.*;
class g
{
    public static int pal(int num)
    {
         int r=num,res=0,re;
        if(num<=9)
        {
            return 2;
        }
        else
        {
            while(r>0)
            {
               re=r%10;
               res=(res*10)+re;
               r=r/10;
            }
            if(res==num)
            {
                return 2;
            }
            else
            {
                 return 1;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t>25000)
        {
            System.out.println("-1");
        }
        else
        {
        System.out.println(pal(t));
        }
    }
}
