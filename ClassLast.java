package sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassLast extends JPanel {

        private JLabel jl1,jl2;
        private JButton jb1;

        public ClassLast(){
            setSize(400,250);
            setLayout(null);
            setBackground(Color.white);

            jl1 = new JLabel("Thanks for your order ! ");
            jl1.setBounds(50,20,230,50);
            add(jl1);

           jl2 = new JLabel("Our staff will contact you within one business day");
           jl2.setBounds(10,40,230,50);
           add(jl2);

            jb1=new JButton("Сделать еще один заказ");
            jb1.setBounds(80,100,200,50);
            add(jb1);

            jb1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Main.frame.classLast.setVisible(false);
                    Main.frame.makeContainer.setVisible(true);
                }
            });



        }

    }

