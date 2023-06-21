import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
    JRadioButton male,female,married,unmarried;
    JDateChooser dateChooser;
    SignupOne() {
        setLayout(null);
         random = Math.abs((long) (Math.random() * 9000L) + 1000L);

        JLabel formno = new JLabel("Application Form No: " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 400, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

         male = new JRadioButton("Male");
        male.setBounds(300, 290, 80, 30);
        male.setBackground(Color.WHITE);
        add(male);

         female = new JRadioButton("Female");
        female.setBounds(400, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JLabel email = new JLabel("E-mail:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);

         emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 400, 30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);

         married = new JRadioButton("Married");
        married.setBounds(300, 390, 80, 30);
        married.setBackground(Color.WHITE);
        add(married);

         unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(400, 390, 120, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

         addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 440, 400, 30);
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

         cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 490, 400, 30);
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

         stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 540, 400, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);

         pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 590, 400, 30);
        add(pincodeTextField);
        
        JButton next = new JButton("Next");
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
                

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }
public void actionPerformed(ActionEvent ae){
    String formno = ""+random;
    String name=nameTextField.getText();
    String fname = fnameTextField.getText();
    String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
    String gender = null;
    if(male.isSelected()){
        gender = "male";
    }else{
        gender="Female";
    }
    String email = emailTextField.getText();
    String maritial = null;
    if(married.isSelected()){
        maritial ="Married";
    }else{
        maritial = "Unmarried";
    }
    String address = addressTextField.getText();
    String city = cityTextField.getText();
    String state = stateTextField.getText();
    String pin = pincodeTextField.getText();
    
    try {
    if (name.equals("")) {
        JOptionPane.showMessageDialog(null, "Name is required");
    } else {
        Conn c = new Conn();
        String query = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + maritial + "','" + address + "','" + city + "','" + pin + "','" + state + "')";
        c.s.executeUpdate(query);
        
        setVisible(false);
        new SignupTwo(formno).setVisible(true);
    }
} catch (Exception e) {
    System.out.print(e);
}

    
}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SignupOne();
        });
    }
}
