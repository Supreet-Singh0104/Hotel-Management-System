package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Dashboard extends JFrame {

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

    public Dashboard() {
        super("HOTEL MANAGEMENT SYSTEM");

        setForeground(Color.CYAN);
        setLayout(null);

        // Set up background image
        ImageIcon backgroundIcon = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image backgroundImage = backgroundIcon.getImage().getScaledInstance(1950, 1000, Image.SCALE_DEFAULT);
        ImageIcon scaledBackgroundIcon = new ImageIcon(backgroundImage);
        JLabel backgroundLabel = new JLabel(scaledBackgroundIcon);
        backgroundLabel.setBounds(0, 0, 1950, 1000);
        add(backgroundLabel);

        // Set up welcome message
        JLabel welcomeLabel = new JLabel("Hotel Management System");
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 46));
        welcomeLabel.setBounds(500, 60, 1000, 85);
        backgroundLabel.add(welcomeLabel);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Hotel management menu
        JMenu hotelManagementMenu = new JMenu("HOTEL MANAGEMENT");
        hotelManagementMenu.setForeground(Color.BLUE);
        menuBar.add(hotelManagementMenu);

        JMenuItem receptionMenuItem = new JMenuItem("RECEPTION");
        hotelManagementMenu.add(receptionMenuItem);

        // Admin menu
        JMenu adminMenu = new JMenu("ADMIN");
        adminMenu.setForeground(Color.RED);
        menuBar.add(adminMenu);

        JMenuItem addEmployeeMenuItem = new JMenuItem("ADD EMPLOYEE");
        adminMenu.add(addEmployeeMenuItem);

        addEmployeeMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddEmployee().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        JMenuItem addRoomMenuItem = new JMenuItem("ADD ROOMS");
        adminMenu.add(addRoomMenuItem);

        addRoomMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddRoom().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        receptionMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                new Reception();
            }
        });

        JMenuItem addDriversMenuItem = new JMenuItem("ADD DRIVERS");
        adminMenu.add(addDriversMenuItem);

        addDriversMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    new AddDrivers().setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        // Set the size of the frame and make it visible
        setSize(1950, 1090);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
