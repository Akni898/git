package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationClient extends JPanel {
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;

    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JButton b2;
private JButton bu1;
    public RegistrationClient(){
setSize(400,250);
setLayout(null);

l1 = new JLabel("Name and Surname");
l1.setBounds(50,20,120,20);
add(l1);

l2 = new JLabel("Email");
l2.setBounds(50,50,120,20);
add(l2);

l3 = new JLabel("Phone number");
l3.setBounds(50,80,120,20);
add(l3);

t1 = new JTextField();
t1.setBounds(190,20,140,20);
add(t1);

        t2 = new JTextField();
        t2.setBounds(190,50,140,20);
        add(t2);

        t3 = new JTextField();
        t3.setBounds(190,80,140,20);
        add(t3);
        bu1 = new JButton("Ok");
        bu1.setBounds(50,130,100,50);
        add(bu1);
        bu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.registrationClient.setVisible(false);
                Main.frame.makeContainer.setVisible(true);
            }
        });

        b2 = new JButton("Back");
        b2.setBounds(220,130,100,50);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.registrationClient.setVisible(false);
                Main.frame.employeeContainer.setVisible(true);
            }
        });

}}
