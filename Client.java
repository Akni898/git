package sample;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[]args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Socket socket = new Socket("127.0.0.1",21111);
        ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
        while (true) {
            String text = reader.readLine();
            outputStream.writeObject(text);
        }
}
