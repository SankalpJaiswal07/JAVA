import java.util.Stack;

public class Reverse
{
    public static void main(String[] args) {
        String s="My name is Sankalp";
        Stack<String> st=new Stack<>();
        String str="";
        for (int i = 0; i <s.length(); i++)
        {
            if(s.charAt(i)==' ')
            {
             st.push(str);
             str="";
            }
            else
            {
            str+=s.charAt(i);
            }
        }
        String ans="";
        while(st.size()!=1)
        {
            ans+=st.peek();
            st.pop();
        }

        System.out.println(ans);
    }
}
