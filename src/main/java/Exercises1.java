public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public static long factorial(int n) {
        long FactorialAns = 1;
        if (n>1)
        {
            for(int i=n;i>1;i--)
            {
                FactorialAns *= i;
            }
        }
        return FactorialAns;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public static long fibonacci(int n) {
        long FirstNum = 1;
        long SecondNum = 1;
        long NextNum = 0;

        if(n>2) {
            for (int i = 1; i <= n-2; i++) {
                NextNum = FirstNum + SecondNum;
                FirstNum = SecondNum;
                SecondNum = NextNum;
            }
        }else NextNum = 1;

        return NextNum;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        // TODO
        return null;
    }


    public static void main(String[] args) {
        int input = 20;
        System.out.println(factorial(input));
        System.out.println(fibonacci(input));
    }

}