import java.util.*;
class gowtham{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int r=0,val=-1;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(i!=j && arr[i]==arr[j])
                {
                    c+=1;
                }
            }
            if(c>r){
                r=c;
                val=arr[i];
            }
            else if(c==r){
                if (val>arr[i]){
                    val=arr[i];
                }
            }
        }
        System.out.println(val);
       // return 0;
    }
}