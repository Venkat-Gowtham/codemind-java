import java.util.*;
class g{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int m=0;m<t;m++)
        {
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
                //System.out.print(arr[j]);
            }
            int sum=0,c=0,i,j,a,d=0,k,l;
              for (j=0; j<n; j++)
        {
            for (k=0; k<n; k++)
            {
                for (l=0; l<n; l++)
                {
                    if (j!=k && k!=l && j>k && k>l)
                    {
                        if (arr[j]+arr[k]==arr[l])
                        {
                            c++;
                        }
                        if (arr[k]+arr[l]==arr[j])
                        {
                            c++;
                        }
                        if (arr[j]+arr[l]==arr[k])
                        {
                            c++;
                        }
                    }
                }
            }
        }
        if(c>0){
            System.out.println(c);
        }
            else{
                System.out.println(-1);
            }
        }
    }
}