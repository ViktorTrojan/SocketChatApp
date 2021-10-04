package socketchatapp;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server extends Network {

    public ArrayList<User> clients = new ArrayList<>();

    public Server(int port) {
        this.port = port;
        openServerSocket();
        new Thread(() -> {
            run();
        }).start();
    }

    public void sendMSG(String msg, User user) {
        for (User client : clients) {
            if (client.equals(user)) {
                continue;
            }
            client.out.println(user.name + ": " + msg);
        }
    }
    
    public void sendMSG(String msg) {
        for (User client : clients) {
            client.out.println("GODLESSFATHER: " + msg);
        }
    }

    public void broadcastMSGALL(String msg, User user) {
        for (User client : clients) {
            client.out.println(user.name + ": " + msg);
        }
    }

    public void broadcastMSG(String msg, User user) {
        for (User client : clients) {
            if (client.equals(user)) {
                continue;
            }
            client.out.println(msg);
        }
    }

    public void run() {
        while (true) {
            try {
                openSocket();
                initStreams();
                String userName = in.readLine();
                User user = new User(socket, userName);
                clients.add(user);

                broadcastMSG("User Joined: " + userName, user);

                new Thread(new UserManager(this, user)).start();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
