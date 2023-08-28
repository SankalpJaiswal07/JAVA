package String;

class MergeString {
    public static String mergeAlternately(String word1, String word2)
    {
        StringBuilder s=new StringBuilder();
        int i=0;
         while(i<word1.length() || i<word2.length())
         {
          if(i<word1.length())
          {
              s.append(word1.charAt(i));
          }
          if(i<word2.length())
          {
                 s.append(word2.charAt(i));
          }
          i++;
         }

        return s.toString();
         //Input:abc,xyz
         //Output:axbycz
    }

    public static void main(String[] args) {
        String result=mergeAlternately("abc","xyz");
        System.out.println(result);
    }
}