import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
          if(b==4 || b==5 || b== 6)
          {
              System.out.println("Summer");
          }
          else if(b==7 || b==8 || b==9 || b==10)
          {
              System.out.println("Rainy");
          }
          else if(b==11 || b==12 || b==1)
          {
              System.out.println("Winter");
          }
          else if(b==2 || b==3)
          {
              System.out.println("Spring");
          }
          else
          {
             System.out.println("-1");
          }
    }
}