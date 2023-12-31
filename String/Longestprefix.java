package String;

import java.util.Arrays;

public class Longestprefix
{
    public static String longprefix(String[] str)
    {
        String s="";
        Arrays.sort(str);
        int end=Math.min(str[0].length(),str[str.length-1].length());

        int i=0;
      while (i<end && str[0].charAt(i)==str[str.length-1].charAt(i))
      {
          i++;
          s=str[0].substring(0,i);
      }

        return s;
    }
    public static void main(String[] args) {
          String[] str={"geeksforgeeks","geeks","geek","geezer"};
        System.out.println(longprefix(str));
    }
}
