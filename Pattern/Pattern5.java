package Pattern;
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
public class Pattern5
{
    public static void main(String[] args)
    {
      pattern5(5);
    }
    static void pattern5(int n)
    {
        for (int row = 0; row <n ; row++)
        {
            for (int col = 0; col<row ; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 1; row <n ; row++)
        {
            for (int col = n-1; col>row ; col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
