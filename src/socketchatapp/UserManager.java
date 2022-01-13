package socketchatapp;

import java.util.Scanner;

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
        String res;
        Scanner sc = new Scanner(user.in);
        while (sc.hasNextLine()) {
            res = sc.nextLine();
            receivedMSG(res);
        }

        // end of Thread
        server.removeUser(user);
        //server.broadcastAllUsers();
        sc.close();
    }
}
