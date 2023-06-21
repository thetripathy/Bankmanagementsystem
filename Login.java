import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    
    JButton login,signup,clear;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
    Login(){
        setTitle("Model Payment Gateway");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("logo/images.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcome To The ModpayG");
        text.setFont(new Font("osward",Font.BOLD,38));
        text.setBounds(200, 40, 800, 50);
        add(text);
        
        JLabel cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120, 150, 150, 40);
        add(cardno);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,150,250,30);
        add(cardTextField);
        
        JLabel pin = new JLabel("PIN :");
        pin.setFont(new Font("Raleway",Font.BOLD,28));
        pin.setBounds(120, 220, 250, 30);
        add(pin);
        
         pinTextField= new JPasswordField();
        pinTextField.setBounds(300,220,250,30);
        add(pinTextField);
        
        login  = new JButton("Login");
        login.setBounds(300, 300, 100,30);
        login.addActionListener(this);
        add(login);
        
         clear  = new JButton("Clear");
        clear.setBounds(430, 300, 100,30);
       // clear.setBackground(Color.red);
       clear.addActionListener(this);
        add(clear);
        
          signup  = new JButton("Sign Up");
        signup.setBounds(300, 350, 230,30);
       // clear.setBackground(Color.red);
       signup.addActionListener(this);
        add(signup);
        
        getContentPane().setBackground(Color.white);
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == clear){
            cardTextField.setText("");
            pinTextField.setText("");
        }else if(ae.getSource()== login){
            
        }else if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String[] args){
        new Login();
    }
}
