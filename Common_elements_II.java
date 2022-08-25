import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[m];
        int [] brr=new int[n];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++)
        {
            brr[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    {
                        if(arr[i]!=-1000)
                        {
                            arr[j]=-1000;
                        }
                    }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(brr[i]==brr[j])
                    {
                        if(brr[i]!=-100)
                        {
                            brr[j]=-100;
                        }
                    }
                }
            }
        }
        int c=0,x=0;
        for(int i=0;i<m;i++)
        {
            if(arr[i]!=-1000)
            {  c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==brr[j])
                {
                    c=1;
                    break;
                }
            }
            if(c==0 && arr[i]!=-1000)
            {
                System.out.print(arr[i]+" ");
            }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(brr[i]!=-100)
            {  c=0;
            for(int j=0;j<m;j++)
            {
                if(brr[i]==arr[j])
                {
                    c=1;
                    break;
                }
            }
            if(c==0 && brr[i]!=-100)
            {
             System.out.print(brr[i]+" ");  
            }
            }
        }
    }
}

    
    
    