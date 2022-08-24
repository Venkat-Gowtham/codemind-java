import java.util.*;
class g
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
    for(int i=0;i<t;i++)
    {
        int n=s.nextInt();
        int[] arr=new int[n];
        int c=0,temp;
        for(int j=0;j<n;j++)
        {
            arr[j]=s.nextInt();
        }
        for(int j=0;j<n;++j)
        {
            for(int k=j+1;k<n;++k)
            {
                if(arr[j]>arr[k])
                {
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                    c+=1;
                }
            }
        }
        if(c==0)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(arr[n-1]-arr[0]);
        }
    }
}
}