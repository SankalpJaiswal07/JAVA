package Recursion;

public class BS
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int target=6;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e)
    {
        int m=s+(e-s)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(target<arr[m])
        {
            return search(arr,target,s,e-1);
        }
        return search(arr,target,m+1,e);
    }
}
