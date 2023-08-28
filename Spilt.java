public class Spilt
{
    public static void main(String[] args) {
        String str="saveChangesInEditor";
        String[] str1=str.split("(?=\\p{javaUpperCase})");

       for (int i = 0; i <str1.length; i++)
            {
                String word=str1[i];
                if(i!=0)
                {
                    System.out.println(word.substring(0,1).toLowerCase()+word.substring(1).toUpperCase());
                }
                else
                {
                    System.out.println(word.substring(0,1).toLowerCase()+word.substring(1).toUpperCase());
                }
            }
        }

}
