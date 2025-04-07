package gui.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import gui.menu.Menu;

public class Login extends JFrame {

    private static String[] DATAUSER = { "Saif", "Dawood", "Usama" };
    private static String[] DATAPASS = { "232", "242", "229" };

    private JPanel mainPanel;
    private JLabel userLabel;
    private JTextField userField;
    private JLabel passLabel;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel confirmLabel;

    public Login() {
        super("Login Portal");
        setSize(350, 200);

        mainPanel = new JPanel();
        userLabel = new JLabel("Username:");
        userLabel.setBounds(10, 20, 80, 25);
        userField = new JTextField(20);
        userField.setBounds(100, 20, 165, 25);
        passLabel = new JLabel("Password:");
        passLabel.setBounds(10, 50, 80, 25);
        passField = new JPasswordField(20);
        passField.setBounds(100, 50, 165, 25);

        confirmLabel = new JLabel("");
        confirmLabel.setBounds(10, 110, 300, 25);

        loginButton = new JButton("Log in");
        loginButton.setBounds(100, 100, 70, 30);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String password = new String(passField.getPassword());
                String confLogin = "Login Failed!!!";
                boolean successful = false;

                // * Verify
                for (int i = 0; i < DATAUSER.length; i++) {
                    if (DATAUSER[i].equals(user) && DATAPASS[i].equals(password)) {
                        successful = true;
                        confLogin = "Login Successful!!!";
                    }
                }

                confirmLabel.setText(confLogin);

                // * If login successful goto menu
                if (successful) {
                    dispose();
                    new Menu();
                }
            }
        });

        mainPanel.add(userLabel);
        mainPanel.add(userField);
        mainPanel.add(passLabel);
        mainPanel.add(passField);
        mainPanel.add(loginButton);
        mainPanel.add(confirmLabel);
        setContentPane(mainPanel);

        addStyle();

        setFocusable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        // Centers JFrame on screen
        setLocationRelativeTo(null);
    }

    private void addStyle() {

    }
}
