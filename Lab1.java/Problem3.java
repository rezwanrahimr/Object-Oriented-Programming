
// Write a java program to determine a number whether it is even or odd.
import javax.swing.JOptionPane;
public class Problem3 {
    public static void main(String[] args) {
        String number;
        number = JOptionPane.showInputDialog("Enter Number !");
        if (Integer.parseInt(number) % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Event Number : " + number);
        } else {
            JOptionPane.showMessageDialog(null, "Odd Number : " + number);
        }
        System.exit(0);

    }
}
