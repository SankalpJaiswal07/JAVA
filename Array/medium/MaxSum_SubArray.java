package Array.medium;

public class MaxSum_SubArray
{
    public static void main(String[] args)
    {
        int[] arr={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans=maxsubarray(arr);
        System.out.println(ans);
    }

    static int maxsubarray(int[] arr)
    {
        //Better approach

        /*int n=arr.length;
        int maxi=Integer.MIN_VALUE;

        for (int i = 0; i <n; i++)
        {
         int sum=0;
            for (int j = i; j <n; j++)
            {
              sum+=arr[j];
              maxi=Math.max(maxi,sum);
            }
        }
        return maxi;*/
       //optimal approach kadane's algo
        int n=arr.length;
        Long maxi=Long.MIN_VALUE;
        Long sum= 0L;
        for (int i = 0; i <n ; i++)
        {
         sum+=arr[i];
         if(sum>maxi)
         {
             maxi=sum;
         }
         if(sum<0)
             sum=0L;
        }
        return Math.toIntExact(maxi);

    }
}
