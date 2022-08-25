import java.util.*;
class g
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int v=0,x,r,d;
        for(int i=m;i<=n;i++)
        { 
             x=i;
              v=0;
              d=0;
            while(x>0)
            {
                r=x%10;
                if(r!=0)
                {
                    if(i%r==0)
                    {
                        v+=1;
                    }
                }
                d+=1;
                x=x/10;
            }
            if(v==d)
            {
                System.out.print(i+" ");
            }
        }
        
}
}