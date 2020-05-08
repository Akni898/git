package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main extends Application {

    public Main() throws IOException {
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
public static BossFrame frame;

    public static void main(String[] args) {
     frame = new BossFrame();

   }
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ServerSocket serverSocket = new ServerSocket(21111);
        System.out.println("Writing client");
    Socket socket =  serverSocket.accept();
        System.out.println("Client is connection");
    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
    ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
    while ()
}
}
}
