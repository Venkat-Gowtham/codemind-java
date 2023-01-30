import java.util.*;
class gowtham{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int [] arr = new int[n];
        for( int i=0;i<n;i++){
            int x= sc.nextInt();
            arr[i]=x;
        }
        int e=0,o=0;
        for( int i=0;i<n;i++){
            if(arr[i]%2==0){
                e++;
            }
            else{
                o++;
            }
        }
        System.out.println(e+" "+o);
        
    }
}