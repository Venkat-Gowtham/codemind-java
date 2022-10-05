import java.util.*;
class g{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
            //System.out.print(arr[j]);
        }
        int sum=0,c=0,i,j;
        for(i=0;i<n;i++)
        { sum=0;
            for(j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}