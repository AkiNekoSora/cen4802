public class Main {
    public static int fibonachi(int num) {
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

    public static void main(String[] args) {
        int fibonachiNum = 10;
        System.out.println("The " + fibonachiNum + "th term of the Fibonacci sequence is " + fibonachi(fibonachiNum) + ".");
    }
}