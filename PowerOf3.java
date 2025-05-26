import java.util.*;
public class PowerOf3
{
    public static boolean IsTrue(int num)
    {
        for(int i= 0; i<30; i++){
            if(Math.pow(3,i) == num){
                return true;
            }
        }
        return false; 
    }

    public static void main(String[] args)
    {
        if(IsTrue(9))
        {
            System.out.print("is true");
        }
        


    }
}