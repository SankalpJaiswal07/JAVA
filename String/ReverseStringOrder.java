package String;

class ReverseStringOrder {
    public static void main(String[] args) {
     String s="the sky is blue";
     reverse(s);
        String res=reverseWords(s);
        System.out.println(res);
    }
    public static String reverseWords(String s)
    {
        String[] str=s.trim().split("\\s+");
        String out="";
        for (int i = str.length-1; i >0; i--)
        {
         out+=str[i]+" ";
        }
        return out+str[0];
    }
    public static void reverse(String s)
    {
        for (int i =s.length()-1; i >= 0 ; i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}
