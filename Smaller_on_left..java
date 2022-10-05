import java.util.*;
class g{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int [] arr=new int[n];
        int [] brr=new int[n];
        for(int j=0;j<n;j++)
        {
            arr[j]=sc.nextInt();
            //System.out.print(arr[j]);
        }
        for(int i=0;i<n;i++)
        {   int f=0;
            int r=arr[i];
            for(int j=i-1;j>=0;j--)
            {
                 if (arr[j]<r){
                     r=arr[j];
                     f=1;
                     break;
                 }  
                 
            }
            if(f==0)
            {
                brr[k++]=-1;
            }
            else{
                brr[k++]=r;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(brr[i]+" ");
        }
    }
}