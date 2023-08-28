package Sorting;

import java.util.Arrays;

public class Bubblesort
{
    public static void main(String[] args)
    {
     int[] arr={3,1,5,4,2};
     bubblesort(arr);
     System.out.println(Arrays.toString(arr));
    }
    public static void bubblesort(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++)
        {
            boolean swapped=false;
            for (int j = 1; j <arr.length-i ; j++)
            {
              if(arr[j]<arr[j-1])
              {
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;
                  swapped=true;
              }
            }
            if(!swapped)
            {
                break;
            }
        }
    }
}
