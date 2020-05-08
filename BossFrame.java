package sample;

import javax.swing.*;
import java.awt.*;

public class BossFrame extends JFrame {
    public static MakeContainer makeContainer;
    public static EmployeeContainer employeeContainer;
    public  static LoginContainer loginContainer;
    public  static RegistrationContainer registrationContainer;
    public  static  OrderHistory orderHistorycont;
    public  static LoginClientContainer loginClientContainer;
    public static RegistrationClient registrationClient;
    public static Delivery delivery;
    public static ClassLast classLast;
    public BossFrame(){
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        employeeContainer = new EmployeeContainer();
        add(employeeContainer);

        loginContainer = new LoginContainer();
        loginContainer.setVisible(false);
        add(loginContainer);

        registrationContainer = new RegistrationContainer();
        registrationContainer.setVisible(false);
        add(registrationContainer);

        orderHistorycont = new OrderHistory();
        orderHistorycont.setVisible(false);
        add(orderHistorycont);

        loginClientContainer = new LoginClientContainer();
        loginClientContainer.setVisible(false);
        add(loginClientContainer);

registrationClient = new RegistrationClient();
registrationClient.setVisible(false);
add(registrationClient);

delivery = new Delivery();
delivery.setVisible(false);
add(delivery);

classLast = new ClassLast();
classLast.setVisible(false);
add(classLast);

makeContainer = new MakeContainer();
makeContainer.setVisible(false);
add(makeContainer);

    }

}
