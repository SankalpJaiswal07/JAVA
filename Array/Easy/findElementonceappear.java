package Array.Easy;

public class findElementonceappear
{
    public static void main(String[] args)
    {
    int[] arr={1,1,2,3,3,4,4};
    int ans=findelement(arr);
        System.out.println(ans);
    }

   static int findelement(int[] arr)
   {

       for (int num : arr) {
           int count = 0;
           for (int i : arr) {
               if (i == num) {
                   count++;
               }
           }
           if (count == 1)
               return num;
       }
       return -1;
    }
    /*optimal approach

    int n=nums.length;
    int xorr=0;
       for (int i = 0; i <n ; i++)
    {
        xorr=xorr^nums[i];
    }

       return xorr;

     */
}
