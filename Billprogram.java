import java.util.*;

public class Billprogram
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount of three items:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float bill = ((a + (a*0.18)) + (b+(b*0.18))+(c+(c*0.18)));
        System.out.println(bill);

    }
}