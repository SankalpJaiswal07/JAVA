package Recursion;
//Time Complexity O(n)
public class ReverseString
{
    public static void rev(String str,int index)
    {
        if(index==0)
        {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        rev(str,index-1);
    }

    public static void main(String[] args)
    {
    String str="abcd";
    int index=str.length()-1;
    rev(str,index);
    }
}
