package gui.ticket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import reservation.customer.RailwayCustomers;

public class RailwayTicket extends JFrame {

    private RailwayCustomers railwayCustomers;

    public RailwayTicket(RailwayCustomers railwayCustomers) {
        this.railwayCustomers = railwayCustomers;
    }
}
