import java.util.*;
class g{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        int ma=0;
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==1)
            {
                c+=1;
            }
            else{
                if(ma<c){
                    ma=c;
                }
                c=0;
            }
            
        }
        if (ma<c)ma=c;
        System.out.println(ma);
    }
}