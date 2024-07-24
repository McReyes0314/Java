import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener{
    JButton addButton = new JButton("Add");
    JButton subButton = new JButton("Subtract");
    JButton mulButton = new JButton("Multiply");
    JButton divButton = new JButton("Divide");

    Frame(String titleFrame){
        login();
        addButton.setBounds(200, 55, 100, 50);
        addButton.setFocusable(false);
        addButton.addActionListener(this);

        subButton.setBounds(200, 125, 100, 50);
        subButton.setFocusable(false);
        subButton.addActionListener(this);

        mulButton.setBounds(200, 200, 100, 50);
        mulButton.setFocusable(false);
        mulButton.addActionListener(this);

        divButton.setBounds(200, 275, 100, 50);
        divButton.setFocusable(false);
        divButton.addActionListener(this);
        
        this.setTitle(titleFrame);
        this.setSize(500, 450);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(addButton);
        this.add(subButton);
        this.add(mulButton);
        this.add(divButton);
    }   
    
    public void login(){
        String input, defUserName = "User";
        do{
            input = JOptionPane.showInputDialog("Username: ");
            if(input.equals(defUserName)){
                break; 
            }
            else{
                JOptionPane.showMessageDialog(null, "Error: Invalid username");
            }
        }while(true);

        password();
    }

    public void password(){
        String input, defPassword = "12345";
        do{
            input = JOptionPane.showInputDialog("Password: ");
            if(input.equals(defPassword)){
                break;
            }
            else{
                JOptionPane.showMessageDialog(null, "Error: Invalid Password");
            }
        }while(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == addButton){
            add();
        }
        else if(e.getSource() == subButton){
            sub();
        }
        else if(e.getSource() == mulButton){
            mul();
        }
        else if(e.getSource() == divButton){
            div();
        }
    }

    public int num1(){
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your first Number: "));
        return n; 
    }

    public int num2(){
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your first Number: "));
        return n; 
    }

    public void add(){
        int add = num1() + num2();
        JOptionPane.showMessageDialog(null, "Sum: " + add);
    }

    public void sub(){
        int sub = num1() - num2();
        JOptionPane.showMessageDialog(null, "Difference: " + sub);
    }

    public void mul(){
        int mul = num1() * num2();
        JOptionPane.showMessageDialog(null, "Product: " + mul);
    }

    public void div(){
        int div = num1() / num2();
        JOptionPane.showMessageDialog(null, "Quotient: " + div);
    }
}
