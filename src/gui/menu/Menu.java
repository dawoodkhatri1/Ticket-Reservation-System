package gui.menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import gui.portal.*;

public class Menu extends JFrame {

    private JPanel mainPanel;
    private JButton raliwayButton, airlineButton, busButton;

    public Menu() {

        setTitle("Menu");
        mainPanel = new JPanel();
        raliwayButton = new JButton("Railway Ticket System");
        airlineButton = new JButton("Airline Ticket System");
        busButton = new JButton("Bus Ticket System");

        raliwayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new RailwayPortal();
            }
        });

        airlineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new AirlinePortal();
            }
        });

        busButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new BusPortal();
            }
        });

        mainPanel.add(raliwayButton);
        mainPanel.add(airlineButton);
        mainPanel.add(busButton);

        setContentPane(mainPanel);

        addStyle();

        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addStyle() {

    }
}
