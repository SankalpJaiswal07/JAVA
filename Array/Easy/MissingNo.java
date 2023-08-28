package Array.Easy;

public class MissingNo
{
    public static void main(String[] args)
    {
    int[] arr={1,0,2};
    int ans= missingnumber(arr);
    System.out.println(ans);
    }

    static int missingnumber(int[] arr)
    {
     int n=arr.length;
     int sum=(n*(n+1))/2;

     int s2=0;
        for (int i = 0; i <n-1 ; i++)
        {
       s2+=arr[i];
        }
        int missingNum=sum-s2;
        return missingNum;
    }

}
