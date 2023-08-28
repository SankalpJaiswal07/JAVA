import java.util.Arrays;

public class MissingNumber
{

   static public int missingnumber(int[] arr)
    {
        Arrays.sort(arr);

        for (int index = 0; index <arr.length ; index++)
        {
         if(arr[index]!=index)
         {
             return index;
         }
        }
        return arr.length;
    }
    public static void main(String[] args) {
        int[] arr={4,0,2,1};
        int ans=missingnumber(arr);
        System.out.println(ans);
    }
}
