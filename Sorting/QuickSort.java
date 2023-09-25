package Sorting;


import java.util.Arrays;

public class QuickSort
{
    static void Sort(int[] nums,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int start=low;
        int end=high;
        int m=start+(end-start)/2;
        int pivot=nums[m];

        while (start<=end)
        {
            while (nums[start]< pivot)
            {
                start++;
            }
            while (nums[end]> pivot)
            {
                end--;
            }
            if(start<=end)
            {
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        Sort(nums,low,end);
        Sort(nums,start,high);
    }
    public static void main(String[] args)
    {
        int [] arr={5,4,3,2,1};
        Sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
