/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class MPronto extends Messaggio {

    String nomeMittente;
    String[] opt = {"SI", "NO"};

    public MPronto(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
        nomeMittente = "";
    }

    public void execute() {
        String[] csv = new String(packet.getData()).split(";");
        String risp = csv[0];
        if (risp == "p" && c.pronto) {
            c.pronto = true;
            JOptionPane.showOptionDialog(c.frame, "Il gioco ha inizio \n" + csv[1], null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[1]);
        } else if (risp == "p" && !c.pronto) {
            c.pronto = true;
            JOptionPane.showOptionDialog(c.frame, "Il tuo avversario è pronto \n" + csv[1], null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[1]);
        }
    }

}
