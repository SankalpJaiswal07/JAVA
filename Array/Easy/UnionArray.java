package Array.Easy;

import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 5, 6, 7};
        getunion(arr1, arr2);
    }

    static void getunion(int[] arr1, int[] arr2)
    {
      HashSet<Integer> s=new HashSet<Integer>();
        for (int i = 0; i <arr1.length; i++)
        {
        s.add(arr1[i]);
        }
        for (int j = 0; j <arr2.length; j++)
        {
        s.add(arr2[j]);
        }
        System.out.println(s.toString());
    }
}