import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,s=0;
        for(i=0;i<n;i++)
        {  s=0;
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if((i*i+j*j)==n)
                    {
                        s=1;
                        break;
                    }
                }
            }
            if(s==1)
            {
                break;
            }
        }
        if(s==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
            
        }
    }
}