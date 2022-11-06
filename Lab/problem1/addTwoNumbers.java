package Lab.problem1;
// Write a java program to add two numbers using class, object, and contractor.
public class addTwoNumbers {
    int numberOne,numberTwo,sum;
    addTwoNumbers(int NumberOne, int NumberTwo){
        this.numberOne = NumberOne;
        this.numberTwo = NumberTwo;
        sum = this.numberOne + this.numberTwo;
        System.out.println("sum is : " + sum);
        
    }

    public static void main(String [] args){
        addTwoNumbers obj = new addTwoNumbers(50, 40);
        
    }
}
