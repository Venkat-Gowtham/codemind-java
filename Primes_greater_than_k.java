import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int s=0,d=0,c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=1 && arr[i]!=0)
            {  c=0;
                for(int j=2;j<(arr[i]);j++)
                {
                    if(arr[i]%j==0)
                    {
                        c=1;
                        break;
                    }
                }
                if(c==0)
                {
                    if(arr[i]>=k)
                    {
                        d+=1;
                    }
                }
            }
        }
        System.out.print(d);
    }
}