package sample;

import com.sun.deploy.panel.RuleSetViewerDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeContainer extends JPanel {
private JButton b1;
private JButton b2;




    public EmployeeContainer() {
        setSize(400, 250);
        //setTitle("Qazaq Mining Granit");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBackground(Color.black);

        b1 = new JButton("Employee");
        b1.setBounds(120, 100, 150, 50);
        add(b1);
        b1.setBackground(Color.white);
        b1.setForeground(Color.red);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.employeeContainer.setVisible(false);
                Main.frame.loginContainer.setVisible(true);


            }

        }
        );
        b2=new JButton("Client");
        b2.setBounds(120,30,150,50);
        add(b2);
        b2.setBackground(Color.white);
        b2.setForeground(Color.red);

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  Main.frame.employeeContainer.setVisible(false);
                  Main.frame.loginClientContainer.setVisible(true);
            }
        });
    }}









