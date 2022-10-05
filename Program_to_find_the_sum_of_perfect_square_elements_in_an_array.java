import java.util.*;
class g{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
                //System.out.print(arr[j]);
            }
            int k,sum=0;
            double r;
            for(int i=0;i<n;i++)
            {
             r= Math.sqrt(arr[i]);
              k=(int)r;
             if( k==r)
              {
                sum+=arr[i];
               }
            }
            System.out.println(sum);
    }
}