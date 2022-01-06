/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package indovinachi;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author User
 */
public class Messaggio {

    DatagramPacket packet;
    int lastPort;
    InetAddress lastIP;
    Condivisa c;
    UtilPacchetto up;
    String last;

    public Messaggio(DatagramPacket p) throws SocketException, UnknownHostException {
        packet = p;
        lastPort = 12345;
        lastIP =packet.getAddress();
        last=lastIP.toString();
        c=Condivisa.getInstance();
        up=c.getSocket();
    }

    public void send(String str) throws IOException {
        
        up.UDP_send(str);
    }
}
