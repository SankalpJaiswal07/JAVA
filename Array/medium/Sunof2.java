package Array.medium;

public class Sunof2 {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        int[] ans = twosum(arr, target);
        System.out.println("target is sum of two: index[" + ans[0] + "," + arr[1] + "]");
    }

    static int[] twosum(int[] arr, int target) {
        //Brute force approach
         /*
         for (int i = 0; i <arr.length ; i++)
         {
             for (int j = 0; j <arr.length ; j++)
             {
              if(arr[i]+arr[j]==target)
              {
                  return "Yes";
              }
             }

         }
         return "No";*/

        //optimal approach
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
}