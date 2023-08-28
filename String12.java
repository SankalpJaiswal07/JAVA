public class String12
{
   static void string(String name,char target) {
       int i;
       for (i = 0; i < name.length()-1; i++) {

       }
       if (name.charAt(i) == target)
       {
           System.out.println("found at index"+i);
       }
       else
       {
           System.out.println("not found");
       }


   }
    static void reversestring(String s)
    {

       StringBuilder sb=new StringBuilder();
        for (int i =s.length()-1; i>=0; i--)
        {
        sb.append(s.charAt(i));
        }

        System.out.println(sb);
   }
    public static void main(String[] args)
    {
     //   string("SANKALP",'P');
        reversestring("sankalp");
    }
}
