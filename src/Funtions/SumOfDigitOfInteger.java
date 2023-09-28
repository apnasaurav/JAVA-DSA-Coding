package Funtions;
import java.util.*;
public class SumOfDigitOfInteger {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the Integer of You Want Sum: ");
            int num = s.nextInt();
            System.out.println("The Sum of the Integer is "+IntegerSum(num));
        }     
    }
    public static int IntegerSum(int n)
    {
        int sum =0;
        while(n !=0)
        {
            int remainder = n%10;
            sum = sum+remainder;
            n /= 10;  
        }
        return sum;
    }
    
}
