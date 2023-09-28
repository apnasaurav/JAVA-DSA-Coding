package Loops;
import java.util.*;
public class SumOfOddandEven {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int SumofEven = 0;
            int SumofOdd = 0;
            for(int i=0;i<=num;i++)//Initiating for loop for getting the sum of the 
            {
                if(i%2==0)
                {
                    SumofEven += i;
                }else{
                    SumofOdd+=i;
                }
            } 
            System.out.println("The of Even Number between set of Integers is : "+ SumofEven);
            System.out.printf("The of Odd Number between set of Integers is : "+ SumofOdd); 
        }
        
    }
    
}
