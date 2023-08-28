public class Sting
{
    static public boolean check(String str)
    {
        boolean HasUppercase=false;
        boolean Haslowercase=false;
        boolean HasDigit=false;
        boolean Hasspecialsymbol=false;
String Specialchar="!@#$%&";

        if(str.contains(" "))
        {
            return false;
        }
        if(str.length()>=8 && str.length()<=15)
            {

            for(char c: str.toCharArray())
            {
                if(Character.isUpperCase(c))
                {
                    HasUppercase=true;
                }
                else if(Character.isLowerCase(c))
                {
                    Haslowercase=true;
                } else if (Character.isDigit(c))
                {
                 HasDigit=true;
                } else if (Specialchar.contains(String.valueOf(c)))
                {
                 Hasspecialsymbol=true;
                }
            }
            return Hasspecialsymbol && Haslowercase && HasUppercase && HasDigit;
            }
        return false;
        }
    public static void main(String[] args) {
        String s="CodingStudio79$";
        System.out.println(check(s));
    }
}
