package Lab.problem3;
import javax.swing.JOptionPane;
public class sum {
     public static void main(String [] args){
        int num,even = 0;
        String number;
        number = JOptionPane.showInputDialog("Enter Number !");
        num = Integer.parseInt(number);
        for(int i = 1; i <= num; i++){
            if (i % 2 == 0) {
                even = even + i;
            } }

          JOptionPane.showMessageDialog(null,"sum of all even numbers " + even);
          
        }}
        

