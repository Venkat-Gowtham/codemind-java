import java.util.*;
class f
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        if(p<=2)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println((p*(p-3)/2));
        }
        
    }
}