import javax.swing.*; 
import java.awt.event.*;
import java.awt.*; 
import java.util.Random;

public class guessTheNumber extends JFrame implements ActionListener{
    JLabel label = new JLabel("Guess The Number");
    JTextField tField = new JTextField();
    JButton button = new JButton("Guess");
    Random randNum = new Random();
    
    int num = 0, max = 2, generatedNum = 0; 

    guessTheNumber(){
        //frame 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setResizable(false);
        this.setLayout(null);

        //label
        label.setBounds(100,50, 200, 20);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        this.add(label);
        this.setVisible(true);

        //textfield 
        tField.setBounds(93, 100, 200, 40);
        tField.setFont(new Font("Arial", Font.PLAIN, 20));
        this.add(tField);

        //button
        button.setBounds(140, 175, 100, 40);
        button.setFocusable(false);
        button.addActionListener(this);
        this.add(button);
    }

    public static void main(String[] args) {
        new MainFrame();
        //new guessTheNumber();    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){ 
            num = Integer.parseInt(tField.getText());
            generatedNum = randNum.nextInt(max);
            boolean test = (num == generatedNum);
            if(test){
                JOptionPane.showMessageDialog(null, "Your got it right, congratulation!");
                int input = JOptionPane.showConfirmDialog(null, "You want to guess again?", "Confirm", JOptionPane.YES_NO_OPTION);
                if(input == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, "You can now guess again");
                    tField.setText("");
                }
                else if(input == JOptionPane.NO_OPTION){
                    JOptionPane.showMessageDialog(null, "Thank you for playing");   
                    dispose();
                    new MainFrame();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Sorry your guess is wrong, try again!");
                tField.setText("");
            }
        }
    }     
}