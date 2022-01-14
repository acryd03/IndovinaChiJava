/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package indovinachi;

import java.awt.Graphics;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author User
 */
public class MBase extends Messaggio {

    String messaggio;

    public MBase(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
        messaggio = "";
    }
    
    public void execute() {
        String[] csv = new String(packet.getData()).split(";");
        messaggio = csv[1];
        c.messaggio = messaggio;
        c.mainframe.repaint();
    }

}
