package Recursion;

public class Fibonacci_series
{

    public static void main(String[] args) {
    int a=0,b=1;
    int n=8;
        System.out.print(a+" ");
        System.out.print(b+" ");
        printFibo(a,b,n-2);
    }

    static void printFibo(int a, int b, int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        printFibo(b,c,n-1);
    }
}
