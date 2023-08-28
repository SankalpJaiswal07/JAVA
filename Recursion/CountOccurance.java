package Recursion;
//Time Complexity O(n)
public class CountOccurance
{
    public static int first=-1;
    public static int last=-1;
    public static void findocurance(String str,int index,char element) {
        if (index == str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentchar=str.charAt(index);

        if(currentchar==element)
        {
            if(first==-1)
            {
                first=index;
            }
            else
            {
                last=index;
            }
        }
        findocurance(str,index+1,element);
    }

    public static void main(String[] args)
    {
      String str="abaacdaefaah";
      findocurance(str,0,'a');
    }
}

