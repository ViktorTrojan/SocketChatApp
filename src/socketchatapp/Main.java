package socketchatapp;

import javax.swing.JFrame;

public class Main extends javax.swing.JFrame {

    Server server;
    Client client;
    public static Main instance;
    boolean isServer = false;

    public Main() {
        instance = this;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NAMELABEL = new javax.swing.JLabel();
        NAME = new javax.swing.JTextField();
        IP = new javax.swing.JTextField();
        PORT = new javax.swing.JTextField();
        JOIN = new javax.swing.JButton();
        STARTSERVER = new javax.swing.JButton();
        IPPORTLABEL = new javax.swing.JLabel();
        CHATAREA = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        SEND = new javax.swing.JButton();
        SENDMSG = new javax.swing.JTextField();
        USERNAMELIST = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NAMELABEL.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        NAMELABEL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NAMELABEL.setText("NAME:");

        NAME.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        NAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        IP.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        IP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        IP.setText("127.0.0.1");

        PORT.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        PORT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PORT.setText("6666");

        JOIN.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        JOIN.setText("JOIN");
        JOIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOINActionPerformed(evt);
            }
        });

        STARTSERVER.setFont(new java.awt.Font("Calibri", 0, 23)); // NOI18N
        STARTSERVER.setText("START SERVER");
        STARTSERVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTSERVERActionPerformed(evt);
            }
        });

        IPPORTLABEL.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        IPPORTLABEL.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        IPPORTLABEL.setText("IP/PORT:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        CHATAREA.setViewportView(jTextArea1);

        SEND.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        SEND.setText("SEND");
        SEND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SENDActionPerformed(evt);
            }
        });

        SENDMSG.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        SENDMSG.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        USERNAMELIST.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(SENDMSG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SEND))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IPPORTLABEL)
                                    .addComponent(NAMELABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NAME)
                                    .addComponent(IP, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
                            .addComponent(CHATAREA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(STARTSERVER, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PORT)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(JOIN))
                                .addComponent(USERNAMELIST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(STARTSERVER)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PORT, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JOIN)
                            .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IPPORTLABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NAMELABEL, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CHATAREA, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                    .addComponent(USERNAMELIST))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SEND)
                    .addComponent(SENDMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void switchAll(boolean flag) {
        NAME.setEnabled(flag);
        IP.setEnabled(flag);
        PORT.setEnabled(flag);
        JOIN.setEnabled(flag);
        STARTSERVER.setEnabled(flag);
    }

    public void addMessage(String msg) {
        jTextArea1.append(msg + "\n");
    }
    
    public String getNAME() {
        return NAME.getText();
    }

    private void JOINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JOINActionPerformed
        if(getNAME().isEmpty()){
            addMessage("[!] Please Enter a Name!");
            return;
        }
        switchAll(false);
        client = new Client(IP.getText(), Integer.parseInt(PORT.getText()));
    }//GEN-LAST:event_JOINActionPerformed

    private void STARTSERVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTSERVERActionPerformed
        switchAll(false);
        isServer = true;
        server = new Server(Integer.parseInt(PORT.getText()));
        //PLAYERCOUNT.setText("1/10");
    }//GEN-LAST:event_STARTSERVERActionPerformed

    private void SENDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SENDActionPerformed
        if (SENDMSG.getText().isEmpty()) {
            return;
        }
        if (isServer) {
            server.sendMSG(SENDMSG.getText());
        } else {
            addMessage("You: " + SENDMSG.getText());
            client.sendMSG(SENDMSG.getText());
        }
        SENDMSG.setText("");
    }//GEN-LAST:event_SENDActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame jf = new Main();
                jf.setLocationRelativeTo(null);
                jf.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane CHATAREA;
    private javax.swing.JTextField IP;
    private javax.swing.JLabel IPPORTLABEL;
    private javax.swing.JButton JOIN;
    private javax.swing.JTextField NAME;
    private javax.swing.JLabel NAMELABEL;
    private javax.swing.JTextField PORT;
    private javax.swing.JButton SEND;
    private javax.swing.JTextField SENDMSG;
    private javax.swing.JButton STARTSERVER;
    private javax.swing.JScrollPane USERNAMELIST;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
