

// Write a java program to determine the area of a circle.
import javax.swing.JOptionPane;
public class Problem4 {
    public static void main(String[] args) {
        String radius;
        radius = JOptionPane.showInputDialog("Enter Radius");
        double area = Math.PI * (Integer.parseInt(radius) * Integer.parseInt(radius));
        double circumference = Math.PI * 2 * Integer.parseInt(radius);

        JOptionPane.showMessageDialog(null,
                "The area of circle is: " + area + "\nThe circumference of the circle is: " + circumference);

        System.exit(0);
    }
}