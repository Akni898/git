package sample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MakeContainer extends JPanel {
    private JLabel l1;
    private JLabel l2;
    private JComboBox comboBox;
    private JTextField textField;
    private JButton b1;
    private JTextField jTextField;
    private JButton button;
    private Granit[] granits = {
            new Granit("Zheltau-5",8000,"sq.m"),
            new Granit("Nadezhda",8300,"sq.m"),
            new Granit("Zhalgyz",8300,"sq.m"),
            new Granit("Zheltau-2",6500, "linear meter "),
            new Granit("Granite paving stones",9000,"sq.m"),
            new Granit("Zheltau-5 red",6500,"sq.m"),
            new Granit("Block",90000,"cub.m")


    };
    public MakeContainer(){
        setSize(400,250);
        setLayout(null);

        l2 = new JLabel("Enter your Name and Surname");
        l2.setBounds(20,20,220,20);
        add(l2);

        textField = new JTextField();
        textField.setBounds(200,20,170,20);
        add(textField);

        l1 = new JLabel("Choose the type of granite");
        l1.setBounds(20,50,220,20);
        add(l1);

        b1 = new JButton("Send");
        b1.setBounds(50, 160, 100, 50);
        add(b1);


        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
Granit granit = (Granit)comboBox.getSelectedItem();
jTextField.setText("You choosed:" + " " + granit.getName());
            }
        });

        jTextField = new JTextField();
        jTextField.setBounds(20,100,350,50);
        add(jTextField);

        comboBox = new JComboBox(granits);
        comboBox.setBounds(190,50,200,30);
        add(comboBox);

        button = new JButton("Next");
        button.setBounds(230,160,100,50);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.makeContainer.setVisible(false);
                Main.frame.delivery.setVisible(true);
            }
        });
}}
