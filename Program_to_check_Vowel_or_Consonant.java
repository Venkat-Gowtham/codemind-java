import java.util.*;
class g
{
    public static void main(String args[])
    {
        Scanner a = new Scanner(System.in);
        char b=a.next().charAt(0);
        if(b=='A' || b=='E'||b=='I'||b=='O'||b=='U'||b=='a'||b=='e'||b=='i'||b=='o'||b=='u')
        {
            System.out.println("Vowel");
        }
        else
        {
          System.out.println("Consonant");   
        }
    }
}