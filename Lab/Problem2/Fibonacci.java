package Lab.Problem2;
// Write a java program to display Fibonacci using static method.
public class Fibonacci {
    static void fibonaccii(int n){
        int firstNumber = 0;
        int secondNumber = 1;
        int counter = 0;

        while(counter < n){
            System.out.println(firstNumber + " ");
            int fibo = secondNumber + firstNumber;
            firstNumber = secondNumber;
            secondNumber = fibo;
            counter++;
           
        }
    }

    public static void main(String [] args){
        Fibonacci.fibonaccii(5);
    }
}
