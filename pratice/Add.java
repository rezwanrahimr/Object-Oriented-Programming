import java.util.Scanner;

public class Add{
    int addation;
    Add(int number1, int number2){
        addation = number1 + number2;
    }


    public static void main(String[] args) {
        System.out.println("Enter the first number: ");
        Scanner num1 = new Scanner(System.in);
        int numberOne = num1.nextInt();

        System.out.println("Enter the second number:");
        Scanner num2 = new Scanner(System.in);
        int numberTwo = num2.nextInt();

        Add sum = new Add(numberOne,numberTwo);
        System.out.println("The Sum is : " + sum.addation);

    }

}
