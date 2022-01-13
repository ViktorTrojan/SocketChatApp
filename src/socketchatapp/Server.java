package socketchatapp;

import java.io.IOException;
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

    public void removeUser(User user) {
        Main.instance.addMessage("User Left: " + user.name);
        
        for (User client : clients) {
            if (client.equals(user)) {
                continue;
            }
            client.out.println("User Left: " + user.name);
        }
        
        clients.remove(user);
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
            client.out.println("SERVER: " + msg);
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

                Main.instance.addMessage("User Joined: " + userName);
                broadcastMSG("User Joined: " + userName, user);

                new Thread(new UserManager(this, user)).start();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
