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
        int[] arr=new int[t];
        int c=0;
        for(int i=0;i<t;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<t;i++)
        {
           int r=pal(arr[i]);
            if(r==2)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}
