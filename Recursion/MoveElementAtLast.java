package Recursion;
//Time Complexity O(n)
public class MoveElementAtLast
{
    public static void movextolast(String str,int idx,int count,String newString)
    {
        if(idx==str.length())
        {
            for (int i = 0; i <count; i++)
            {
            newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        if(currchar=='x')
        {
            count++;
            movextolast(str,idx+1,count,newString);
        }
        else {
            newString+=currchar;
            movextolast(str,idx+1,count,newString);
        }

    }

    public static void main(String[] args)
    {
     String str="axbcxxd";
     movextolast(str,0,0,"");
    }
}

