package Funtions;
import java.util.*;
public class IsEvenOrNot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Num : ");
            int num = sc.nextInt();
            System.out.println(Checkevenodd(num));
        } 
    }
    static boolean Checkevenodd(int n)
    {
        if(n%2==0)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
}
