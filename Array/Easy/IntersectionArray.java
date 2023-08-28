package Array.Easy;

import java.util.Arrays;

public class IntersectionArray
{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,7,6};
        int[] arr2 = {2,3,4,5,6,7};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        intersection(arr1,arr2);
    }

    static void intersection(int[] arr1, int[] arr2)
    {
        int i=0 ,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]>arr2[j])
            {
                j++;
            } else if (arr1[i]<arr2[j])
            {
            i++;
            }
            else
            {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
}
