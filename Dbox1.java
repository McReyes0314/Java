import javax.swing.JOptionPane;

public class Dbox1{
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: "); 
        JOptionPane.showMessageDialog(null, "Hello " + name, "Welcome!", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}