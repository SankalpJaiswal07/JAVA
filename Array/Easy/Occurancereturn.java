package Array.Easy;
import java.util.*;
public class Occurancereturn
{
        public  static int repeatedNTimes(int[] nums)
        {
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                int temp=nums[i];
                if(map.containsKey(temp))
                {
                    map.put(temp,map.get(temp)+1);
                }
                else
                {
                    map.put(temp,1);
                }
            }
            int maxelement=0;
            int maxcount=0;

            for(Map.Entry<Integer,Integer> entry : map.entrySet())
            {
                if(maxcount < entry.getValue())
                {
                    maxelement=entry.getKey();
                    maxcount=entry.getValue();
                }
            }
            return maxcount+1;
        }

    public static void main(String[] args) {
        int[] arr={2,1,2,5,3,2};
       int res= repeatedNTimes(arr);
        System.out.println(res);

    }
    }

