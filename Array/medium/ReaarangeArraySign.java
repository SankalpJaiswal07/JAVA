package Array.medium;

import java.util.ArrayList;

public class ReaarangeArraySign {
    public static void main(String[] args) {
        int[] arr = {9, 4, -2, -1, 5, 0, -5, -3, 2};
        int[] ans = rearrangearray(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");

        }

    }

    static int[] rearrangearray(int[] arr) {
        //brute force approach when postive values = negative values

     /*  ArrayList<Integer>pos =new ArrayList<>();
       ArrayList<Integer>neg =new ArrayList<>();

       for (int i = 0; i <arr.length ; i++)
       {
           //separting postive and negative
        if(arr[i]>0)
        {
            pos.add(arr[i]);
        }
        else
        {
            neg.add(arr[i]);
        }
       }
       //postive on even index and negative on odd
       for (int i = 0; i <arr.length/2; i++)
       {
        arr[2*i]=pos.get(i);
        arr[2*i+1]=neg.get(i);
       }
       return arr;*/

        //optimal approach when pos!=neg
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) { //separting postive and negative
            if (arr[i] > 0)
                pos.add(arr[i]);
            else if(arr[i]==0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        if (pos.size() < neg.size()) {
            for (int i = 0; i < pos.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr[index] = neg.get(i);
                index++;
            }
        } else {
            for (int i = 0; i < neg.size(); i++) {
                arr[2 * i] = pos.get(i);
                arr[2 * i + 1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr[index] = pos.get(i);
                index++;

            }
        }
        return arr;
    }
}