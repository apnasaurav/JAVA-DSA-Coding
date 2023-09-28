package Funtions;
import java.util.*;
public class Avg3Nums {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            //Taking the Number as Input.
            System.out.print("Enter the Num1 : ");
            int num1 = sc.nextInt();
            System.out.print("Enter the Num2 : ");
            int num2 = sc.nextInt();
            System.out.print("Enter the Num3 : ");
            int num3 = sc.nextInt();
            
            System.out.println(AverageofThreeNumbers(num1, num2, num3));
        }
    }
    public static double AverageofThreeNumbers(int num1, int num2, int num3)//Function to Calculate Average of Three Numbers
        {
            int sum = num1 + num2 + num3;
            int avg = sum/3;
            return avg;
        }
    
}
