/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indovinachi;

import java.net.DatagramPacket;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author User
 */
public class MPassTurno extends Messaggio{
    
    public MPassTurno(DatagramPacket p) throws SocketException, UnknownHostException {
        super(p);
    }
    
        
    public void execute() {
        String[] csv = new String(packet.getData()).split(";");
        String action=csv[0];
        if(action.equals("g")){
             String g = csv[1];
             c.mainframe.rimozioneGiuAvversario=g;
        }else{
            String s = csv[1];
            c.mainframe.rimozioneSuAvversario=s;
        }
     
    }
}
