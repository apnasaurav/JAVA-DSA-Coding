package Strings;
import java.util.*;
public class CheckAnarams {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Strig 1 : ");
            String str1 = sc.nextLine();
            System.out.print("Enter the String 2 : ");
            String str2 = sc.nextLine();
            System.out.println(CheckAnagramsornot(str1, str2));
        }
        
    }
    public static boolean CheckAnagramsornot(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    
}
