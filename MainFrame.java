import javax.swing.*; 
import java.awt.event.*;  

public class MainFrame extends JFrame implements ActionListener{

    JButton playButton = new JButton("Play"); 
    JButton exitButton = new JButton("Exit");

    MainFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setTitle("GuessMe");
        this.setResizable(false);
        this.setLayout(null);

        //Play button
        playButton.setBounds(90, 75, 100, 40);
        playButton.setFocusable(false);
        playButton.addActionListener(this);
        this.add(playButton);

        //Exit button 
        exitButton.setBounds(90, 125, 100, 40);
        exitButton.setFocusable(false);
        exitButton.addActionListener(this);
        this.add(exitButton);

        
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == playButton){
          dispose();
          JOptionPane.showMessageDialog(null, "Welcome to GuessMe! Your Task is to guess a number from 0 to 3. \nThere is no time limit so take your time to GuessMe right! Have fun ^_^");
          new guessTheNumber();
       }
       else if(e.getSource() == exitButton){
          System.exit(0);
       }
    }
    
}
