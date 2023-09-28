package Conditionals_Statement;
import java.util.*;
public class WeekDaysPrediction {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int x = s.nextInt();//Taking input as Number to predict week days
            switch (x) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter Value Something between 1-7");
                    break;
            }
        }
    }
    
}
