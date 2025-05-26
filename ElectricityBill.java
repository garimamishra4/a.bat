/* cal electricity bill if unit of electricity are upto 100 the per unit charge it 3 rs. if units are upto 400 then perunit 
charge is 6.5 else per unit charge is 8 rs. */
import java.util.*;
public class ElectricityBill
{
   public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter unit of electricity used: ");
        int n = sc.nextInt();
        float bill=0f;
        if(n<=100){
            bill = (float)(n*3);
        }
       else if(n>100 && n<=400){
            bill = (float)(3*100 + (n-100)*6.5);
        }
        else {
            bill = (float)((3*100) +(300*6.5) + (n-400)*8);        
            }
           System.out.println(bill);

           System.out.println(bill);

    }

}