package Loops;
import java.util.*;
public class MultiplicationOfN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number of which You wnat Table : ");
            int N = sc.nextInt();//Taking Number as input
            for(int i=1;i<=10;i++)//Initiating a for loop to print the Multiplication of the Number
            {
                System.out.println(N + " X " + i + " = " + N*i);
            }
        }
        
    }
    
}
