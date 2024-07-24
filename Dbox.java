import javax.swing.JOptionPane;
import java.util.Scanner;
public class Dbox {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Input a message: ");
        String messages = sc.nextLine();
        JOptionPane.showMessageDialog(null, messages);
    }
}
