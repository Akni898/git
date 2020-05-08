package sample;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginContainer extends JPanel {

    private JLabel label, label2;
    private JTextField text1;
    private JTextField text2;
    private JButton b1, b2;


    public LoginContainer() {
        setSize(400, 250);
        //setTitle("Qazaq Mining Granit");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBackground(Color.yellow);

        label = new JLabel("Login");
        label.setBounds(50, 20, 70, 20);
        add(label);

        label2 = new JLabel("Password");
        label2.setBounds(50, 59, 70, 20);
        add(label2);

        text1 = new JTextField();
        text1.setBounds(120, 20, 120, 20);
        add(text1);

        text2 = new JTextField();
        text2.setBounds(120, 60, 120, 20);
        add(text2);

        b1 = new JButton("Register");
        b1.setBounds(50, 100, 100, 50);
        add(b1);

        b2 = new JButton("OK");
        b2.setBounds(230, 100, 100, 50);
        add(b2);
b1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

        Main.frame.loginContainer.setVisible(false);
        Main.frame.registrationContainer.setVisible(true);

    }

});
b2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.frame.loginContainer.setVisible(false);
        Main.frame.orderHistorycont.setVisible(true);
    }
});
    }
}
