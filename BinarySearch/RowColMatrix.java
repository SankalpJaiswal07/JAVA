package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class RowColMatrix
{
    public static void main(String[] args)
    {
       int[][] arr={
               {10,20,30,40},
               {15,25,35,45},
               {22,28,37,47},
               {32,34,39,50}
       };
        System.out.println(Arrays.toString(search(arr,47)));
    }
    static  int[] search(int[][] matrix,int target)
    {
        int row=0;
        int col= matrix.length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==target)
            {
                return new int[]{row,col};
            }
            if(matrix[row][col]< target)
            {
                row++;
            }
            else
            {
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
