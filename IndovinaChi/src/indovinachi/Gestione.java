/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package indovinachi;


import indovinachi.Condivisa;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Gestione extends Thread {

    static InetAddress connectedIP = null;
    Condivisa c;
    static Gestione instance = null;

    Gestione() throws SocketException, UnknownHostException {
        c=Condivisa.getInstance();
    }

    public void execute(DatagramPacket p) throws UnknownHostException, SocketException {
        byte[] buffer = p.getData();
        String action = new String(buffer).split(";")[0];
        if (action.equals("a")) {
            connectedIP = p.getAddress();
            MApertura ma = new MApertura(p);
            ma.execute();
        } else {
            switch (action) {               
                case "c": {
                    MChiusura mc = new MChiusura(p);
                    mc.execute();
                    connectedIP = null;
                    break;
                }
                case "m": {
                    MBase mb = new MBase(p);
                    mb.execute();
                    break;
                }
                case "y": {
                    try {
                        connectedIP = p.getAddress();
                        MRispApertura mar = new MRispApertura(p);
                        mar.execute();
                    } catch (SocketException ex) {
                        Logger.getLogger(Gestione.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case "n": {
                    connectedIP = null;
                    break;
                }
                case "p":{
                    MPronto mp=new MPronto(p);
                    mp.execute();
                }

            }
        }
    }
}
