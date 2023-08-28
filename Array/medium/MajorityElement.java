package Array.medium;

public class MajorityElement
{
    public static void main(String[] args)
    {
     int[] arr={2, 2, 1, 1, 1, 2, 2};
     int ans=majorityelement(arr);
        System.out.println(ans);
    }

    static int majorityelement(int[] arr)
    {

        int n=arr.length;

        //brute force approach
       /* for (int i = 0; i <n ; i++)
        {
         int count=0;
            for (int j = 0; j <n ; j++)
            {
             if(arr[j]==arr[i])
             {
                 count++;
             }
            }
            if(count>(n/2))
             return arr[i];
        }
        return -1;*/

        //optimal approach by using moore's voting algorthim

        int count=0;
        int el=0;
        for (int i=0;i<n;i++) {
            if (count == 0) {
                count = 1;
                el = arr[i];
            } else if (el == arr[i]) {
                count++;
            } else {
                count--;
            }
        }
              int count1=0;
            for (int i1=0;i1<n;i1++)
            {
            if(el==arr[i1])
                count1++;
            }

         if(count1>(n/2))
         {
             return el;
         }
         return -1;
    }
}
