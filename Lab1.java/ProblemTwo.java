// Write a java program to determine the area of a rectangle.
import javax.swing.JOptionPane;
public class ProblemTwo {
    public static void main(String[] arge) {
        String leangth;
        String width;

        leangth = JOptionPane.showInputDialog("Enter Leangth : ");
        width = JOptionPane.showInputDialog("Enter Width : ");

        double area = Integer.parseInt(leangth) * Integer.parseInt(width);
        JOptionPane.showMessageDialog(null, "Area of Rectangle is:" + area);
        System.exit(0);
    }
}