/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package indovinachi;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class MRispApertura extends Messaggio {

    String nomeDest;

    public MRispApertura(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
    }
    
    public void execute() {
        String[] csv = new String(packet.getData()).split(";");
        String risp = csv[0];
        if (risp.equals("y")) {
            c.connesso = true;
            c.destinatario = csv[1];
            String str = "y;";
            try {
                send(str);
            } catch (IOException ex) {
                Logger.getLogger(MRispApertura.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (risp.equals("y")) {         
            c.connesso = true;
        } else if (risp.equals("n")) {

        }
    }

}
