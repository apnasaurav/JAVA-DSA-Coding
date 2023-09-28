package Arrays;
import java.util.*;
public class CheckSpecificNumberinArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Length of the Array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0;i<arr.length;i++)
            {
                System.out.println("Enter the Number "+(i+1)+" : ");
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter the Target Number : ");
            int target = sc.nextInt();
            System.out.println(FindTarget(target, arr));
        }
        
    }
    public static boolean FindTarget(int target, int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(target == arr[i])
            {
                return true;
            }
        }
        return false;
    }
    
}
