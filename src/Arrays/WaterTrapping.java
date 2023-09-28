package Arrays;
import java.util.*;
public class WaterTrapping {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Number of Heights : ");
            int N = sc.nextInt();
            int heights[] = new int[N];
            for(int i=0;i<N;i++)
            {
                System.out.print("Enter Height for Day"+(i+1)+" : ");
                heights[i] = sc.nextInt();
            }
            System.out.println(GetTrappedWater(heights));
        }
        
    }
    public static int GetTrappedWater(int[] arr)
    {
        //Assuming the width of each bar is 1 unit.
        //int area = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[i+1])
            {
                //area =
                
            }
        }

        return 0;
    }
    
}
