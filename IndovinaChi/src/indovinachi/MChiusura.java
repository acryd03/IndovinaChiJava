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
public class MChiusura extends Messaggio{

    public MChiusura(DatagramPacket p) throws SocketException, UnknownHostException {
      super(p);
    }
    
    public void execute() {
        c.connesso = false;        
    }
    
    
}
