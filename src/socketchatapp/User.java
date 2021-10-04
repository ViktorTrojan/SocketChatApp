package socketchatapp;

import java.awt.Color;
import java.net.Socket;

public class User extends Network {

    public int userID;
    public String name;
    public Color color;
    
    public User(Socket socket, String name) {
        this.name = name;
        initSocket(socket);
    }
}
