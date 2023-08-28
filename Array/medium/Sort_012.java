package Array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort_012
{
    public static void main(String[] args)
    {
    ArrayList<Integer> arr =new ArrayList<>(Arrays.asList( new Integer[]{0,0,0,1,1,2,2,0,1,2,0,0}));
    sortarray(arr);
        for (int i = 0; i <arr.size() ; i++)
        {
            System.out.print(arr.get(i));
        }
        System.out.println();

    }

    static void sortarray(ArrayList<Integer> arr)
    {
        int count0=0 ,count1=0,count2=0;

        for (int i = 0; i <arr.size() ; i++)
        {
         if(arr.get(i)==0) {
             count0++;
         }
         else if (arr.get(i)==1)
         {
             count1++;

         }
         else count2++;
         }
        System.out.println(count1);

        for (int i = 0; i <count0 ; i++)
        {
           arr.set(i,0);
        }
        for (int i = count0; i <count0+count1 ; i++)
        {
            arr.set(i,1);
    }
        for (int i = count0+count1; i <arr.size() ; i++)
         {
        arr.set(i,2);
         }
        }
    }

