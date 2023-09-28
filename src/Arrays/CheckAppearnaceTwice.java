package Arrays;
import java.util.*;
public class CheckAppearnaceTwice {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the length of the Array : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<arr.length;i++)
            {
                System.out.print("Enter the Number "+(i+1)+" : ");
                arr[i] = sc.nextInt();
            }
            System.out.println(CheckArrayTwice(arr));
        } 
         
    }
    public static boolean CheckArrayTwice(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            int temp = arr[i];
            for(int j=0;j<arr.length;j++)
            {
                if(j!=i)
                {
                    if(temp == arr[j])
                    {
                        return true;
                    }
                }

            }
        }
        return false;
    }
    
}
