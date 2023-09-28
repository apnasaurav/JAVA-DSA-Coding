package Conditionals_Statement;
import java.util.*;
public class FeverPredictor {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Your Temperature Reading : ");
            double temperature = s.nextDouble();//Taking Temperature Input
            if(temperature>100)
            {
                System.out.println("You've Fever You must Consult a Physician:");
            }else
            {
                System.out.println("You don't have any Fever");
            }
        }
    }
    
}
