package Recursion;
//Time Complexity O(n)
public class CheckSorted
{
    public static boolean isSorted(int[] arr,int index)
    {
        if(arr[index]==arr.length-1)
        {
            return true;
        }
        if(arr[index]< arr[index+1])
        {
           return isSorted(arr,index+1);
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
     int[] arr={1,3,5,7};
        System.out.println(isSorted(arr,0));
    }
}
