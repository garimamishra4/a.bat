import java.util.*;

public class ThreeSum
{
     static int Arraycc(int[] nums, int target)
    {
        int n = nums.length;
        for(int i =0; i<n ; i++)
        {
             Set<Integer> st = new HashSet<>();

            for(int j= i+1; j<n ; j++)
            {
               int second = target - arr[i] - arr[j];
               if(st.contains(second))
                return second;

            }
        }
        
    }
        
    public static void main(String[] args){
    int[] arr = {1,4,45,6,10,8};
    int targt = 13;
    int solution = Arraycc(arr,targt);
    System.out.println(solution);
}

}