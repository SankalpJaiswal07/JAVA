package String;

import java.util.HashMap;
import java.util.Map;

public class FreqencyOfCharacter
{
    public static void countoccurence(String s)
    {
        HashMap<Character,Integer> map=new HashMap<>();

            char[] c=s.toCharArray();
            for(char ch:c)
            {
                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                }
                else
                {
                 map.put(ch,1);
                }
            }
            for(Map.Entry<Character, Integer> entry: map.entrySet())
            {
                System.out.println("key="+entry.getKey()+",value="+entry.getValue());
            }
    }
    public static void main(String[] args)
    {
      String name ="sankalp";
     countoccurence(name);
    }
}
