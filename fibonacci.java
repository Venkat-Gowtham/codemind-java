import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int x=0,y=1,z=0;
        System.out.print(0+" "+1+" ");
        a=a-2;
        int c=0;
        while(c<a)
        {
            z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;
            c+=1;
        }
        
        
        
        
    }
    
}