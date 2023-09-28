package Funtions;
import java.util.*;
public class NumberPalindromeCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number to Check Whether the Number is Palindrome or Not : ");
            int num = sc.nextInt();
            Checkpalindrome(num);
            if(Checkpalindrome(num))
            {
                System.out.println("This is Valid Palindrome");
            }else{
                System.out.println("This is not a Valid Palindrome");
            }
        }

        
    }
    public static boolean Checkpalindrome(int n)
    {
        int palindrome=n;
        int reverse = 0;
        while(palindrome != 0)
        {
            int remainder = palindrome%10;
            reverse = reverse*10+remainder;
            palindrome /= 10;
        }
        if(n==reverse)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
}
