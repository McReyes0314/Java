import javax.swing.JOptionPane;
public class Sum {
   public static void main(String[] args) {
      String num1 = JOptionPane.showInputDialog("Enter firs number");
      String num2 = JOptionPane.showInputDialog("Enter second number");
      int add = Integer.parseInt(num1) + Integer.parseInt(num2);
      JOptionPane.showMessageDialog(null, "Sum: " + add, "Result", JOptionPane.INFORMATION_MESSAGE);
   }
}
