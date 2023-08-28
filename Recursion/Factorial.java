package Recursion;

public class Factorial
{
    public static int calculate_fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int fact_nm1=calculate_fact(n-1);
        int fact_n=n*fact_nm1;
        return fact_n;
    }
    public static void main(String[] args)
    {
         int ans= calculate_fact(5);
        System.out.println(ans);
    }
}
