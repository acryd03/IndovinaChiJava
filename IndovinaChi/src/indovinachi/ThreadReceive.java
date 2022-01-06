/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package indovinachi;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ThreadReceive extends Thread {

    Condivisa cond;
    public ThreadReceive(Condivisa c) throws SocketException, UnknownHostException {
        this.cond=c;
    }

    @Override
    public void run() {
        while (true) {
            try {
                cond.getSocket().UDP_receive();
                System.out.println(cond.getSocket().UDP_getData());
            } catch (IOException ex) {
                Logger.getLogger(ThreadReceive.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(150);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadReceive.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
