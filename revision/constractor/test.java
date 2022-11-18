package revision.constractor;

import java.util.Scanner;

public class test {
   public static void main(String [] agrs){
    int num1,num2;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    num1 = sc.nextInt();

    Scanner sc2 = new Scanner(System.in);
    System.out.println("Enter the second number : ");
    num2 = sc2.nextInt();

    add obj = new add(num1, num2);
    add obj2 = new add(num1, num2, num1);
    // System.out.println(obj.addation);
   }
}
