
// Addition program that displays the sum of two numbers.
import javax.swing.JOptionPane;

public class problemOne {
    public static void main(String[] args) {
        String numberOne;
        String numberTwo;

        numberOne = JOptionPane.showInputDialog("Enter First Number !");
        numberTwo = JOptionPane.showInputDialog("Enter Second Number !");
        int sum = Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);

        JOptionPane.showMessageDialog(null, "The Sum is :" + sum);
        System.exit(0);

    }
}