import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField pan, aadhar;
    JComboBox<String> religion, category, occupation, education, income;
    JRadioButton syes, sno, eyes, eno;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religionLabel = new JLabel("Religion:");
        religionLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        religionLabel.setBounds(100, 140, 100, 30);
        add(religionLabel);

        String[] valReligion = {"Hindu", "Muslim", "Christian", "Others"};
        religion = new JComboBox<>(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        categoryLabel.setBounds(100, 190, 200, 30);
        add(categoryLabel);

        String[] valCategory = {"General", "OBC", "SC", "ST", "Others"};
        category = new JComboBox<>(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel incomeLabel = new JLabel("Income:");
        incomeLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        incomeLabel.setBounds(100, 240, 200, 30);
        add(incomeLabel);

        String[] incomeCategory = {"Null", "<150000", "<250000", "<500000", "UPTO 1000000"};
        income = new JComboBox<>(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel educationLabel = new JLabel("Educational:");
        educationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationLabel.setBounds(100, 290, 200, 30);
        add(educationLabel);

        String[] educationalValues = {"Non Graduation", "Graduation", "Post Graduation", "Doctrate", "Others"};
        education = new JComboBox<>(educationalValues);
        education.setBounds(300, 290, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel occupationLabel = new JLabel("Occupation:");
        occupationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        occupationLabel.setBounds(100, 340, 200, 30);
        add(occupationLabel);

        String[] occupationalValues = {"Salaried", "Self-Employed", "Business Man", "Student", "Retired", "Others"};
        occupation = new JComboBox<>(occupationalValues);
        occupation.setBounds(300, 340, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel panLabel = new JLabel("PAN NO:");
        panLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        panLabel.setBounds(100, 390, 200, 30);
        add(panLabel);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.BOLD, 14));
        pan.setBounds(300, 390, 400, 30);
        add(pan);

        JLabel aadharLabel = new JLabel("AADHAR NO:");
        aadharLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharLabel.setBounds(100, 440, 200, 30);
        add(aadharLabel);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        aadhar.setBounds(300, 440, 400, 30);
        add(aadhar);

        JLabel seniorCitizenLabel = new JLabel("Senior Citizen:");
        seniorCitizenLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizenLabel.setBounds(100, 490, 200, 30);
        add(seniorCitizenLabel);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 490, 80, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(400, 490, 120, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorCitizenGroup = new ButtonGroup();
        seniorCitizenGroup.add(syes);
        seniorCitizenGroup.add(sno);

        JLabel existingAccountLabel = new JLabel("Existing Account:");
        existingAccountLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAccountLabel.setBounds(100, 540, 200, 30);
        add(existingAccountLabel);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 540, 80, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(400, 540, 120, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existingAccountGroup = new ButtonGroup();
        existingAccountGroup.add(eyes);
        existingAccountGroup.add(eno);

        JButton nextButton = new JButton("Next");
        nextButton.setBackground(Color.BLUE);
        nextButton.setForeground(Color.WHITE);
        nextButton.setBounds(620, 660, 80, 30);
        nextButton.addActionListener(this);
        add(nextButton);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = syes.isSelected() ? "Yes" : "No";
        String existingaccount = eyes.isSelected() ? "Yes" : "No";
        String panNo = pan.getText();
        String aadharNo = aadhar.getText();

        try {
            Conn c = new Conn();
            String query = "INSERT INTO signuptwo (formno, religion, category, income, education, occupation, pan, aadhar, seniorcitizen, existingaccount) VALUES ('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome + "','" + seducation + "','" + soccupation + "','" + panNo + "','" + aadharNo + "','" + seniorcitizen + "','" + existingaccount + "')";
            c.s.executeUpdate(query);
            
            setVisible(false);
            JOptionPane.showMessageDialog(this, "Form Submitted Successfully!");
            new SignupTwo(formno).setVisible(true);
            setVisible(false);
            new SignupThree(formno).setvisible(true);
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SignupTwo("");
        });
    }
}
