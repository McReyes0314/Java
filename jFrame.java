import javax.swing.*;
import java.awt.*;

public class jFrame extends JFrame{
    public jFrame(String frameTitle){
        JLabel label1 = new JLabel("Label1");
        JLabel label2 = new JLabel("Label2");
        Container con = getContentPane();
        con.add(label1);
        con.add(label2);
        con.setLayout(new FlowLayout());
        setSize(200, 200);
    }  
}
