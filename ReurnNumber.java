public class ReurnNumber
{
    public static void main(String[] args) {
        int arr[]={-2,3,0,3,3,1,2,3,6};
        int count=0,max=0,num=0;
        for (int i = 0; i <arr.length ; i++)
        {
            for (int j = i; j <arr.length ; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    if(count>max)
                    {
                        num= arr[i];
                    }
                }
            }
            if (count>=max)
            {
                max=count;
                count=0;
            }
        }
        System.out.println(max);
        System.out.println(num);
    }
}
