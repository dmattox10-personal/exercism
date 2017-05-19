public final class Calculator {
    
    public static int computeSquareOfSumTo (int n)
    {

        int x = n * (n + 1) / 2;
        return x * x;

    }

    public static int computeSumOfSquaresTo (int n)
    {

        return n * (n + 1) * (n + n + 1) / 6;

    }


    public static int betweenSquareOfSumAndSumOfSquaresTo (int n)
    {

        return computeSquareOfSumTo(n) - computeSumOfSquaresTo(n);

    }

}
