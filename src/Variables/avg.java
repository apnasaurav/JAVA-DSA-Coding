package Variables;
import java.util.*;

public class avg {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter 1st Number : ");
            int a = s.nextInt();
            System.out.print("Enter 2nd Number : ");
            int b = s.nextInt();
            System.out.print("Enter 3rd Number : ");
            int c = s.nextInt();
            int sum = a+b+c;
            int average = (sum)/3;
            System.out.print("The Average of the given Number is : ");
            System.out.println(average);
        }
        
        
    }
    
}
