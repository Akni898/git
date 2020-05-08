package sample;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegistrationContainer extends JPanel {
private JLabel labelr,labelr2;
private JTextField textr;
private JTextField textr2;
private JButton b1r,b2r2;


public RegistrationContainer() {
setSize(400, 250);
//setTitle("Qazaq Mining Granit");
  //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);

labelr = new JLabel("Login");
 labelr.setBounds(50, 20, 70, 20);
   add(labelr);

labelr2 = new JLabel("Create a password");
  labelr2.setBounds(50, 59, 130, 20);
    add(labelr2);

textr = new JTextField();
textr.setBounds(180, 20, 120, 20);
  add(textr);

    textr2 = new JTextField();
textr2.setBounds(180, 60, 120, 20);
add(textr2);

  b1r = new JButton("Back");
    b1r.setBounds(50, 100, 100, 50);
  add(b1r);

    b2r2 = new JButton("OK");
b2r2.setBounds(230, 100, 100, 50);
  add(b2r2);
  b1r.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

      Main.frame.loginContainer.setVisible(true);
      Main.frame.registrationContainer.setVisible(false);
    }
  });
  b2r2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

      Main.frame.registrationContainer.setVisible(false);
      Main.frame.orderHistorycont.setVisible(true);
    }
  });

}
}