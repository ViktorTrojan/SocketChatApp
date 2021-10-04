package socketchatapp;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserManager implements Runnable {

    private Server server;
    private User user;

    public UserManager(Server server, User user) {
        this.server = server;
        this.user = user;
        //this.server.broadcastAllUsers();
    }

    public void receivedMSG(String msg) {
        Main.instance.addMessage(user.name + ": " + msg);
        server.sendMSG(msg, user);
    }

    public void run() {
        try {
            String res;
            while ((res = user.in.readLine()) != null) {
                receivedMSG(res);
            }
        } catch (IOException ex) {
            Logger.getLogger(Network.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
