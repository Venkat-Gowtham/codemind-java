import java.util.*;
class g{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++)
        {
            int n=sc.nextInt();
            int se=sc.nextInt();
            int [] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
                //System.out.print(arr[j]);
            }
            int sum=0,c=0,i,j,a,d=0,k,l,x=0,y=0;
                for(i=0;i<n;i++)
            {   sum=0;
                    for(j=i;j<n;j++)
                    {
                        sum+=arr[j];
                        if(sum==se)
                        {
                            x=i;
                            y=j;
                            c=1;
                            break;
                        }
                    }
                if(c==1)
                {
                    break;
                }
            }
            
             if(m<=t-1)
        {
             if(c==1)
            {
                System.out.print(x+1+" ");
                System.out.println(y+1);
            }
            else
            {
                System.out.println(-1);
            }
        }
         else
        {
            if(c==1)
          {
              System.out.print(x+1+" ");
            System.out.println(y+1);
          }
          else
          {
               System.out.println(-1);
          }
        }
            
        }

    }
}