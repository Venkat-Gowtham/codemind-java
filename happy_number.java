import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int z=0,f=0,r;
            while(n>0)
        {
             r=n%10;
             int s=(int)Math.pow(r,2); 
             z+=s;
            n=n/10;
         if(n==0)
         {
           
           if(z>0&& z<=9)
           {
             break;
           }
           else 
           {
             n=z;
             z=0;
            }
         }
        }
  if(z==1||z==7)
    {
       System.out.println("True");
    }
   else
    {
     System.out.println("False"); 
    }
    }
}