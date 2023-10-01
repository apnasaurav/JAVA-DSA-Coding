package Strings;
import java.util.*;
public class CountLowerCase {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.println(Countnooflowercase(str));
        }
        
    }

    public static int Countnooflowercase(String str)
    {
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            //char temp = str.charAt(i)
            if(Character.isLowerCase(str.charAt(i)))
            {
                count++;
            }else{
                continue;
            }

        }
        return count;
    }
    
}
