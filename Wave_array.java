import java.util.*;
class g
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
         int flag=0;
         int d=arr[0]-arr[1];
         if (d<0)
            {
                for (int i=0; i<n-1; i+=2)
                {
                    if (arr[i+1]>arr[i])
                    {
                        flag=1;
                    }
                    else
                    {
                        flag=0;
                        break;
                    }
                }
            }
            else
            {
                for (int i=0; i<n-1; i+=2)
                {
                    if (arr[i+1]<arr[i])
                    {
                        flag=1;
                    }
                    else
                    {
                        flag=0;
                        break;
                    }
                }
            }
            if (flag==1)
                {
                    System.out.println("yes");
                }
            else
                {
                    System.out.println("no");
                }
    }
}
























  
    
    
    
    