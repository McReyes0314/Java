import javax.swing.JOptionPane;
public class InputDialog {
    public static void main(String[] args) {
        String name; 
        name = JOptionPane.showInputDialog("Enter your name");
        System.out.println(name);
        System.exit(0);
    }
}