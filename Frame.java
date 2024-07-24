import java.awt.Color;
import java.awt.Font;
import javax.swing.*; 

public class Frame extends JFrame{
    JLabel label = new JLabel();
   
    Frame(){
        // JFrame
        this.setTitle("Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(500, 500);
        this.getContentPane().setBackground(Color.BLACK);

        // JLabel 
        label.setText("Bro Do you even Code?");
        label.setForeground(Color.GREEN);
        label.setFont(new Font("Arial", Font.PLAIN, 20));
        // this.label.setHorizontalAlignment(JLabel.CENTER);
        // this.label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(100, 100, 20, 20);
        this.add(label);

        this.pack();
        this.setVisible(true);
    }   
}
