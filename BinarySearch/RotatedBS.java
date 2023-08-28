package BinarySearch;

public class RotatedBS
{
    public static void main(String[] args)
    {
        int[] arr = {4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target)
    {
        int pivot=findpivot(arr);

        if(pivot==-1)
        {
            return binarySearch(arr,target,0,arr.length-1);

        }

        if(arr[pivot]==target)
        {
            return pivot;
        }
        if(target>=arr[0])
        {
            return binarySearch(arr,target,0,pivot-1);
        }

        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {
            // find the middle element
           // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }
    static  int findpivot(int[] arr)
    {
        int start=0;
        int end=arr.length-1;

        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(mid <end && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid]<=arr[start])
            {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
