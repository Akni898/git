package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginClientContainer extends JPanel {
    private JLabel la1;
    private JTextField text1;
    private JButton b2;
    private JLabel l2;
    private JTextField t1;
private  JButton b1;
    public LoginClientContainer(){
        setSize(400,250);
        setLayout(null);


        la1 = new JLabel("Enter your email");
        la1.setBounds(50,20,140,20);
        add(la1);

        l2 = new JLabel("Enter your password");
        l2.setBounds(50,70,140,20);
        add(l2);

        t1 = new JTextField();
        t1.setBounds(190,70,120,20);
        add(t1);

        text1 = new JTextField();
        text1.setBounds(190, 20, 120, 20);
        add(text1);

        b1 = new JButton("Ok");
        b1.setBounds(50, 130, 100, 50);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Main.frame.loginClientContainer.setVisible(false);
               Main.frame.makeContainer.setVisible(true);
            }
        });

        b2 = new JButton("To register");
        b2.setBounds(220,130,100,50);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.loginClientContainer.setVisible(false);
                Main.frame.registrationClient.setVisible(true);
            }
        });


    }

}
