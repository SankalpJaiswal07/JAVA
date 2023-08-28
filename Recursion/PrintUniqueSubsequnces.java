package Recursion;
import java.util.HashSet;
//time complexity O(2^n)
// https://practice.geeksforgeeks.org/problems/subset-sums2234/1

public class PrintUniqueSubsequnces
{
  public static void findSubsequnce(String str, int idx, String newString, HashSet<String> set)
  {
      if(idx==str.length()) {
          if (set.contains(newString)) {
              return;
          }
          else {
               System.out.println(newString);
               set.add(newString);
               return;
          }
      }
      char currchar=str.charAt(idx);
      //To be
      findSubsequnce(str,idx+1,newString+currchar,set);
      //Not to be
      findSubsequnce(str, idx+1, newString, set);
  }
    public static void main(String[] args) {
      String str="aaa";
       HashSet<String> set=new HashSet<>();
       findSubsequnce(str,0,"",set);
    }
}
