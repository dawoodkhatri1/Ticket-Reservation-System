package gui.portal;

import javax.swing.*;

import gui.ticket.RailwayTicket;

import java.awt.*;
import java.awt.event.*;

import reservation.customer.RailwayCustomers;

public class RailwayPortal extends JFrame {
    private JPanel mainPanel;
    private JLabel fnameLabel;
    private JLabel lnameLabel;
    private JLabel phoneLabel;
    private JLabel emailLabel;
    private JLabel priceLabel;
    private JLabel ageLabel;
    private JTextField fnameField;
    private JTextField lnameField;
    private JTextField phoneField;
    private JTextField emailField;
    private JTextField priceField;
    private JTextField ageField;

    private JComboBox comboBox; // TODO implement JComboBox
    private JButton submit;

    public RailwayPortal() {
        setTitle("Railway Portal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        fnameLabel = new JLabel("First Name");
        lnameLabel = new JLabel("Last Name");
        phoneLabel = new JLabel("Phone No");
        emailLabel = new JLabel("Email");
        priceLabel = new JLabel("Price");
        ageLabel = new JLabel("Age");
        fnameField = new JTextField();
        lnameField = new JTextField();
        phoneField = new JTextField();
        emailField = new JTextField();
        priceField = new JTextField();
        ageField = new JTextField();
        submit = new JButton("Submit");

        fnameField.setBounds(0, 0, 10, 10);
        lnameField.setBounds(0, 0, 10, 10);
        phoneField.setBounds(0, 0, 10, 10);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RailwayCustomers customers = new RailwayCustomers();

                customers.addToList(fnameField.getText(), lnameField.getText(), phoneField.getText(),
                        emailField.getText(), Integer.parseInt(ageField.getText()),
                        Integer.parseInt(priceField.getText()));

                dispose();
                new RailwayTicket(customers);
            }
        });

        mainPanel.add(fnameLabel);
        mainPanel.add(fnameField);
        mainPanel.add(lnameLabel);
        mainPanel.add(lnameField);
        mainPanel.add(phoneLabel);
        mainPanel.add(phoneField);
        mainPanel.add(submit);

        setContentPane(mainPanel);

        addStyle();

        setSize(500, 500);
        setVisible(true);
        setFocusable(true);
        setLocationRelativeTo(null);

    }

    private void addStyle() {

    }
}
