package socketchatapp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client extends Network {

    public Client(String ip, int port) {
        this.port = port;
        this.ip = ip;
        run();
    }
    
    public void sendMSG(String msg) {
        out.println(msg);
        out.flush();
    }

    public void receivedMSG(String msg) {
        Main.instance.addMessage("> " + msg);
    }

    public void run() {
        try {
            initSocket(new Socket(ip, port));
            out.println(Main.instance.getNAME());
            new Thread(() -> {
                listener();
            }).start();

        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
