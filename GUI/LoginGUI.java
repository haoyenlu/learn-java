package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginGUI extends JFrame implements ActionListener{
    
    private JLabel userLabel;
    private JLabel passLabel;
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    public LoginGUI()
    {
        setTitle("Login");

        userLabel = new JLabel("Username:");
        userLabel.setBounds(10,20,80,25);
        userField = new JTextField(20);

        passLabel = new JLabel("Password:");
        passField = new JPasswordField(20);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(3, 2));

        contentPane.add(userLabel);
        contentPane.add(userField);
        contentPane.add(passLabel);
        contentPane.add(passField);
        contentPane.add(new JLabel(""));
        contentPane.add(loginButton);

        setSize(300,150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evt)
    {
        String username = userField.getText();
        String password = new String(passField.getPassword());

        if (username.equals("admin") && password.equals("password"))
        {
            JOptionPane.showMessageDialog(this, "Login Successful");
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Invalid username or password.");
        }   
    }

    public static void main(String[] args)
    {
        new LoginGUI();
    }
}
