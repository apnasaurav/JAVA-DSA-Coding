package Variables;
import java.util.*;
public class Billing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the price of Pen : ");
            float pen = sc.nextInt();
            System.out.print("Enter the price of Pencil : ");
            float pencil = sc.nextInt();
            System.out.print("Enter the price of Eraser : ");
            float eraser = sc.nextInt();
            float totalcost = (pen+pencil+eraser);//Calculating Total Cost
            System.out.println("Total cost (Excluding GST) : "+totalcost);
            float GSTonTotalcost = (.18f * totalcost);//GST Calculation
            System.out.println("GST : "+GSTonTotalcost);
            float total = totalcost+GSTonTotalcost;//Calculating total Cost with GST
            System.out.println("Total Cost Including GST will be : "+total);
        }
    }
    
}
