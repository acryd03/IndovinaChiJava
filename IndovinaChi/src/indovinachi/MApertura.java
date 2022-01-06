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
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MApertura extends Messaggio {

    String nomeMittente;
    String[] opt = {"SI", "NO"};

    public MApertura(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
        nomeMittente = "";
    }
    
    public void execute() {
        c.connesso = true;
        String[] csv = new String(packet.getData()).split(";");
        c.destinatario = csv[1];
        JOptionPane.showOptionDialog(c.frame, "Vuoi giocare con con: \n" + csv[1], null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[1]);
        String str = ("y;" + c.nome + ";");
        try {
            send(str);
        } catch (IOException ex) {
            Logger.getLogger(MApertura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
