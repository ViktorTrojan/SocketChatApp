package socketchatapp;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client extends Network {

    public Client(String ip, int port) {
        this.port = port;
        this.ip = ip;
        init();
    }
    
    public void init() {
        try {
            initSocket(new Socket(ip, port));
            out.println(Main.instance.getNAME());
            new Thread(() -> {
                run();
            }).start();

        } catch (IOException ex) {
            Main.instance.addMessage("[!] Failed to connect to Server!");
            Main.instance.switchAll(true);
        }
    }
    
    public void run() {
        String res;
        Scanner sc = new Scanner(in);
        while (sc.hasNextLine()) {
            res = sc.nextLine();
            receivedMSG(res);
        }
        // end of Thread
        sc.close();
        Main.instance.addMessage("Disconnected!");
        Main.instance.switchAll(true);
    }

    public void sendMSG(String msg) {
        out.println(msg);
        out.flush();
    }

    public void receivedMSG(String msg) {
        Main.instance.addMessage("> " + msg);
    }
}