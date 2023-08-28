import java.util.*;

public class SumofSecondLastNumber
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int ans=Sum(arr);
        System.out.println(ans);
    }

    static int Sum(int[] arr)
    {
        int n=arr.length;
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        int result=0;

        for (int i = 0; i <n; i++)
        {
         if(i%2==0)
         {
             even.add(arr[i]);
         }
         else
         {
             odd.add(arr[i]);
         }
        }
       Collections.sort(even);
        Collections.sort(odd);
        result=even.get(even.size()-2)+odd.get(odd.size()-2);
        return result;
    }
}
