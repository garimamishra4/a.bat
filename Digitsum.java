import java.util.*;

public class Digitsum
{
    public static void main(String args[])
    {
        System.out.println("enter number: ");
        int n = sc.nextInt();
        int r =0;
        while(n!=0)
        {
            int num = n%10;
            r+=num;
            n=n/10;
        }
        System.out.println("sum of digits:" + r);
    }
}