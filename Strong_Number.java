import java.util.*;
class g
{
    public static void main(String Args[]){
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int p=x,r,v=0,i,s;
        while(p>0)
        {
            r=p%10;
            s=1;
            for(i=r;i>=1;i--)
            {
                s*=i;
            }
            v+=s;
            p=p/10;
        }
        if(x==v)
        {
            System.out.println("The number "+x+" is a strong number");
        }
        else
        {
            System.out.println("The number "+x+" is not a strong number");
        }
    }
}