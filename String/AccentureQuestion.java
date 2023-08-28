package String;

import java.util.Scanner;

public class AccentureQuestion
{
    public static  int returnint(String[] str,String check)
    {
        System.out.println(check);
        for (int i = 0; i < str.length; i++)
        {
            if (str[i].equals(check)) {
                return i+1;
            }
        }
        return 0;
    }
    public static void main(String[] args)
    {
        String[] str={"A","B","C","D","E","AB","AC","AD","AE","BA"};
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        System.out.println(returnint(str,str1));
    }
}
