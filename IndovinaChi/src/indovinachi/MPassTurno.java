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
    
}
