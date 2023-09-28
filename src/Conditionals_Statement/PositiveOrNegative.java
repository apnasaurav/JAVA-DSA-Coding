package Conditionals_Statement;
import java.util.*;
public class PositiveOrNegative {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            if(num>0)
            {
                System.out.println("Positive");
            }else if(num == 0)
            {
                System.out.println("Neutral Number");
            }else
            {
                System.out.println("Negative");
            }
        }
        
    }
    
}
