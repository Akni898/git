package sample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Delivery extends JPanel {

    private JLabel jl1,jl2;
    private JButton jb1,jb2;
    private JTextField jt1,jt2;
    private JLabel l1;

    public Delivery(){
        setSize(400, 250);
        setLayout(null);


        jl1 =new JLabel( "Indicate delivery address");
        jl1.setBounds(50,30,170,20);
        jl1.setBackground(Color.gray);
        jl1.setForeground(Color.red);
        add(jl1);

        jl2=new JLabel("Pickup");
        jl2.setBounds(50,70,170,20);
        add(jl2);

        jt1=new JTextField();
        jt1.setBounds(200,30,140,20);
        add(jt1);

        jt2=new JTextField();
        jt2.setBounds(200,70,140,20);
        add(jt2);

        jb1 = new JButton("Back");
        jb2 = new JButton("Ok");

        jb1.setBounds(50,130,100,50);
        jb2.setBounds( 220,130,100,50);
        add(jb1);
        add(jb2);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              Main.frame.delivery.setVisible(false);
              Main.frame.makeContainer.setVisible(true);

            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.delivery.setVisible(false);
                Main.frame.classLast.setVisible(true);

            }
        });


    }}
