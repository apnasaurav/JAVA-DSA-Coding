package Conditionals_Statement;
import java.util.*;
public class LeapYearPredictor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner (System.in)) {
            int year = sc.nextInt();
            if(year%4==0)
            {
                System.out.println("This is a Leap Year");
            }else if(year%100==0)
            {
                System.out.println("This is a Leap Year");
            }else if(year%400==0)
            {
                System.out.println("This is a Leap Year");
            }else
            {
                System.out.println("Not a Leap Year");
            }
        }

        
    }
    
}
