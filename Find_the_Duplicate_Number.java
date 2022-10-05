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
            int sum=0,c=0,i,j,a,d=0,k,l,x=0,y=0;
            for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    {
                        System.out.println(arr[i]);
                        c=1;
                        break;
                        
                    }
                }
            }
            if(c==1)
            {
                break;
            }
        }
    }
}