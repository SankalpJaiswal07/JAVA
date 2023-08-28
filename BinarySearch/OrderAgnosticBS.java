package BinarySearch;

public class OrderAgnosticBS
{
    public static void main(String[] args)
    {
     int [] arr={99,87,76,65,52,45,36,25,15,10,5};
     int target=10;
     int ans=bianrysearch(arr,target);
        System.out.println(ans);
    }
    static int bianrysearch(int[] arr,int target)
    {
    int start=0;
    int end=arr.length-1;

    boolean isAsc=arr[start]<arr[end];
       while(start<=end)
    {
        int mid=start+(end-start)/2;

        if(arr[mid]==target)
        {
            return mid;
        }

        if(isAsc) {
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        else
        {
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        }
       return -1;
    }
}

