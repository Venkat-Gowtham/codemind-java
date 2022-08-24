import java.util.*;
class corona
{
    static void pandemic(int num)
    {
        if(num<=1)
        {
            System.out.println("0");
        }
        else if(num==2)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("2");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        pandemic(a);
    }
}