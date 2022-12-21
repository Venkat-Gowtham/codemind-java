import java.util.*;
class g
{
     public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int [] arr = new int[n];
            int s=0;
            for( int j=0;j<n-1;j++){
                arr[j]=sc.nextInt();
                s+=arr[j];
            }
            int r= (n*(n+1))/2;
            System.out.println(r-s);
        }
        
    }
}
