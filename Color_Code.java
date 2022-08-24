import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        char b=a.next().charAt(0);
      int r=b;
      if (r>65 && r<90)
      {
          if(b=='V')
          {
              System.out.println("Violet");
          }
          else if(b=='I')
          {
              System.out.println("Indigo");
          }
          else if(b=='B')
          {
              System.out.println("Blue");
          }
          else if(b=='G')
          {
              System.out.println("Green");
          }
          else if(b=='Y')
          {
              System.out.println("Yellow");
          }
          else if(b=='O')
          {
              System.out.println("Orange");
          }
          else if(b=='R')
          {
              System.out.println("Red");
          }
          else
          {
             System.out.println("-1");
          }
        }
        else
        {
            r=r-32;
            if(r=='V')
          {
              System.out.println("Violet");
          }
          else if(r=='I')
          {
              System.out.println("Indigo");
          }
          else if(r=='B')
          {
              System.out.println("Blue");
          }
          else if(r=='G')
          {
              System.out.println("Green");
          }
          else if(r=='Y')
          {
              System.out.println("Yellow");
          }
          else if(r=='O')
          {
              System.out.println("Orange");
          }
          else if(r=='R')
          {
              System.out.println("Red");
          }
          else
          {
             System.out.println("-1");
          }
      }
    }
}