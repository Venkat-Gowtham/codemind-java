import java.util.*;
class rain
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int f=0;
        if(num%3==0)
        {
            System.out.print("Pling");
            f=1;
        }
         if(num%5==0)
        {
            System.out.print("Plang");
            f=1;
        }
        if(num%7==0)
        {
            System.out.print("Plong");
            f=1;
        }
        if(f==0)
        {
            System.out.print(num);
        }
    }
}