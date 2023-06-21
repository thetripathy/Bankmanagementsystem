import javax.swing.*;
import java.awt.*;
import java .awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    
    JButton Submit,Cancel;
    String formno;
    SignupThree( String formno) {
        this.formno=formno;
        setLayout(null);
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        //setLayout(null);
        JLabel type = new JLabel("Page 3: Account Details");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);
        
          r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
          r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        
          r4 = new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
       ButtonGroup groupcount = new ButtonGroup();
       groupcount.add(r1);
       groupcount.add(r2);
       groupcount.add(r3);
       groupcount.add(r4);
       
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
         JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
          JLabel carddetail = new JLabel("Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,330,300,30);
        add(carddetail);
       
        JLabel pin = new JLabel("Pin");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
         JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
         JLabel pindetail = new JLabel("Your PIN Number");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,300,30);
        add(pindetail);
        
        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway",Font.BOLD,18));
        services.setBounds(100,450,200,30);
        add(services);
        
        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100, 500,200 ,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350, 500,200 ,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100, 550,200 ,30);
        add(c3);
        
        c4 = new JCheckBox("E mail and SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350, 550,200 ,30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100, 600,200 ,30);
        add(c5);
        
        c6 = new JCheckBox("E- Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350, 600,200 ,30);
        add(c6);
        
        c7 = new JCheckBox("I here By Declare above enetr details are correct ");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100, 680,600 ,30);
        add(c7);
        
        Submit = new JButton("Submit");
        Submit.setBackground(Color.blue);
        Submit.setForeground(Color.WHITE);
        Submit.setBounds(250,720,100,30);
        Submit.addActionListener(this);
        add(Submit);
        
        Cancel = new JButton("Cancel");
        Cancel.setBackground(Color.red);
        Cancel.setForeground(Color.WHITE);
        Cancel.setBounds(420,720,100,30);
        Cancel.addActionListener(this);
        add(Cancel);
        
        Cancel = new JButton("Cancel");
        
        getContentPane().setBackground(Color.WHITE);
        
                
        setLocation(350,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == Submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType = "Saving Account";
            }else if(r2.isSelected()){
                accountType = "Fixed Deposite Account";
            }else if(r3.isSelected()){
                accountType = "Current Account";
            }else if(r4.isSelected()){
                accountType = "Recurring Account";
            }
            Random random = new Random();
            String cardnumber = ""+Math.abs(random.nextLong() % 900000000L)+504093600000000L;
            String pinnumber = ""+Math.abs((random.nextLong()%9000L)+1000L);
            
            String facility = "";
            if(c1.isSelected()){
                facility+="ATM Card";
            }else if(c2.isSelected()){
                facility+="Internet Banking";
            }else if(c3.isSelected()){
                facility+="Mobile Banking";
            }else if(c4.isSelected()){
                facility+="E mail and SMS Alert";
            }else if(c5.isSelected()){
                facility+="cheque Book";
            }else if(c6.isSelected()){
                facility+="E- Statement";
            }
            
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Account Type Required");
                }else{
                    Conn con = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"',)";
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    con.s.executeUpdate(query1);
                    con.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null,"Card Number"+cardnumber+"\n PIN :"+pinnumber);
                }
            }catch(Exception e){
                System.out.print(e);
            }
        }else if(ae.getSource() == Cancel){
            
        }
    }
    
    public static void main(String[] args){
        
        new SignupThree("");
    }
}
