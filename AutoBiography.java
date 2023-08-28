public class AutoBiography
{
    public static int isAutobio(String number)
    {
       if(number==null)
       {
           return 0;
       }
       int[] count=new int[number.length()];
        for (int i = 0; i <number.length() ; i++)
        {
         int digit=Character.getNumericValue(number.charAt(i));
         count[digit]++;
        }
        for (int i = 0; i <count.length; i++)
        {
         if(count[i]!=Character.getNumericValue(number.charAt(i)))
            {
                return 0;
            }
        }
        int distinctcount=0;
        for (int digitcount : count)
        {
            if(digitcount>0)
            {
                distinctcount++;
            }
        }
        return  distinctcount;
    }
    public static void main(String[] args)
    {
    String number="1210";
    int res=isAutobio(number);
    System.out.println(res);
    }
}
