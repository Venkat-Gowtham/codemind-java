import java.util.*;
import java.util.Arrays;
class prime
{
    public static int pri (int num)
    {
        if(num<=1){
            return 0;
        }
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int x=0,y=0,d=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==min)
            {
                x=i;
                break;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]==max)
            {
                y=i;
                break;
            }
        }
        int s=0,c=0;
        for(int i=0;i<n;i++)
        {
        if(i>=x && i<=y||i<=x && i>=y)
        {
            c=pri(arr[i]);
            if(c==1)
            {
                d+=1;
            }
        }
        }
        System.out.print(d);
    }
}