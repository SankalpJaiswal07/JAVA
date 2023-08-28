package Array;

import java.util.Stack;

public class CheckValidParentheses
{
   static Stack<Character> s1=new Stack<Character>();

    public static boolean isValid(String s)
    {
        for (char c:s.toCharArray())
        {
         if(c=='(' || c=='{' || c=='[')
         {
         s1.push(c);
         }
         else
         {
             if(s1.isEmpty())
             {
                 return false;
             }
         }
         char top=s1.peek();
            if(c==')' && top=='(' || c=='}' && top=='{' || c==']' && top=='[')
            {
                s1.pop();
            }
            else
            {
                if(s1.isEmpty())
                {
                    return false;
                }
            }
        }
     return s1.isEmpty();
    }
    public static void main(String[] args) {
       String s="(])";
       boolean res=isValid(s);
        System.out.println(res);
    }
}
