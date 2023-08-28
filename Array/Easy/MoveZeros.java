package Array.Easy;

public class MoveZeros
{
    public static void main(String[] args)
    {
     int[] arr={1,0,2,3,4,0,5,0,6,1,0,1};
     zerotoend(arr);

        for (int i = 0; i <arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void zerotoend(int[] arr) {
        int k = 0;
        for (int i = 0; i <arr.length ; i++)
        {
        if(arr[i]!=0)
        {
            arr[k++]=arr[i];
        }
        }
        while(k<arr.length)
        {
            arr[k++]=0;
        }
    }
}
