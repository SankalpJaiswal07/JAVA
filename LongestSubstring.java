import java.util.Arrays;
public class LongestSubstring {
    public static String replaceCharacter(String str,char c1,char c2)
    {
      StringBuilder s=new StringBuilder();
        for (int i = 0; i <str.length(); i++)
        {
         if(str.charAt(i)==c1)
         {
             s.append(c2);
         } else if (str.charAt(i)==c2)
         {
          s.append(c1);
         }
         else{
          s.append(str.charAt(i));
         }
        }
        return s.toString();
    }
    public static void main(String[] args)
    {
        System.out.println(replaceCharacter("apples",'a','p'));
    }
}
