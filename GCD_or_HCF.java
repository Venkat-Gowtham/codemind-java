import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
                while(a!=b)
           {
             if(a<b)
              { 
                b=b-a;
              }
             if(a>b)
               {
                 a=a-b;
               }
           }
             System.out.println(a);
    }
}