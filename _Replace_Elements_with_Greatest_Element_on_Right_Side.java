import java.util.*;
class g{
    public static void main(String args[] ){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        int i,j;
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            int f=0;
            arr[i]=-9;
            for(j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    arr[i]=arr[j];
                    f=1;
                }
            }
            if(f==0){
                arr[i]=-1;
            }
        }
        for( i=0;i<n;i++){
            System.out.print(arr[i]);
            if(i!=n-1){
                System.out.print(" ");
            }
        }
    }
}