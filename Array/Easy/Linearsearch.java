package Array.Easy;

public class Linearsearch
{
    public static void main(String[] args)
    {
    int[] arr={1,2,3,4,5,6,7};
    int num=4;
   int ans=linearsearch(arr,num);
        System.out.println("Element found at index:"+ans);

    }

     static int linearsearch(int[] arr,int num)
    {

        for ( int i = 0; i <arr.length ; i++)
        {
            if(arr[i] == num)
            {
                return i;
            }

        }
        return -1;
    }
}
