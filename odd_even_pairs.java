import java.util.*;
class g
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int[] odd=new int[n];
        int []eve=new int[n];
        int c=0,temp,k=0,l=0;
        for(int j=0;j<n;j++)
        {
            arr[j]=s.nextInt();
        }
        for(int j=0;j<n;++j)
        {
            if(arr[j]%2!=0)
            {
                odd[k++]=arr[j];
            }
        }
         for(int j=0;j<n;++j)
        {
            if(arr[j]%2==0)
            {
                eve[l++]=arr[j];
            }
        }
       int i=0,j=0;
       while(i<k && j<l)
       {
           System.out.print(odd[i]+" "+eve[j]+" ");
           i++;
           j++;
       }
       while(i<k)
       {
           System.out.print(odd[i]+" ");
           i++;
       }
       while(j<l)
       {
           System.out.print(eve[j]+" ");
           j++;
       }
       if(n%2!=0)
       {
           System.out.print(0);
       }
}
}