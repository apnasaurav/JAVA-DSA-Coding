package Variables;
import java.util.*;
public class AreaOfSquare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the side of the Square : ");
            int side = sc.nextInt();
            System.out.print("The Area of the Square is : "+ side*side);
        }
        
    }
    
}
