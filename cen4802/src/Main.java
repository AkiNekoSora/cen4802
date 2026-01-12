public class Main {
    /*
     * Accepts a number of times the method will iterate through the fibonacci sequence.
     * @param   int num The number of times the method will iterate through the fibonacci sequence.
     * @return  int     The final results of the fibonacci sequence.
     */
    public static int fibonacci(int num) {
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum = 0;

        for (int i = 2; i <= num; i++) {
            thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
        }
        return thirdNum;
    }

    /*
     * Main class that specifies the number of times the fibonacci sequence will iterate. Calls
     * the fibonacci method and prints the results.
     * @param   String[] args
     * @return  none
     */
    public static void main(String[] args) {
        int fibonacciNum = 10;
        System.out.println("The " + fibonacciNum + "th term of the Fibonacci sequence is " + fibonacci(fibonacciNum) + ".");
    }
}