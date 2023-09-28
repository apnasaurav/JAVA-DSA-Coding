package Arrays;
import java.util.*;
public class MaxStockProfit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the No. of Days for Entering Price Value : ");
            int N = sc.nextInt();
            int arr[] = new int[N];
            for(int i=0;i<arr.length;i++)
            {
                System.out.print("Enter Price for Day "+(i+1)+" : ");
                arr[i] = sc.nextInt();
            }
            System.out.println(Getprofit(arr));
        }   
    }

    public static int Getprofit(int arr[])
    {
        int buy = arr[0];
        int profit = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(buy<arr[i])
            {
                profit = Math.max(arr[i]-buy, profit);
            }
            else
            {
                buy=arr[i];
            }
        }
        return profit;
    }
}