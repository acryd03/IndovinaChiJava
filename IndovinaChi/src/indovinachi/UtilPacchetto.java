
package indovinachi;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author User
 */
public class UtilPacchetto {
    
    private DatagramSocket socket;
    private DatagramPacket pack_Client; //pacchetti che arrivano dal client
    private DatagramPacket data_Server;
    private byte buffer[] = new byte[8192];
    private int PORTclient;
    private InetAddress IPclient;

    public UtilPacchetto(int PORT,String ip) throws SocketException, UnknownHostException {

        socket = new DatagramSocket(PORT);
        this.IPclient = InetAddress.getByName(ip);
        this.PORTclient=12345;

    }

    public void setIPclient(String ip) throws UnknownHostException {
        this.IPclient = InetAddress.getByName(ip);
    }

    public void UDP_datagram_packet() {

        data_Server = new DatagramPacket(buffer, buffer.length);
    }

    public void UDP_receive() throws IOException {

        pack_Client = new DatagramPacket(buffer, buffer.length);
        socket.receive(pack_Client);
        Gestione g=new Gestione();
        IPclient=pack_Client.getAddress();
        g.execute(pack_Client);

    }

    public void UDP_send(String message) throws IOException {

        data_Server = new DatagramPacket(message.getBytes(), message.length(), IPclient, PORTclient);
        socket.send(data_Server);
    }

    public String UDP_getData() {

        int numByte = pack_Client.getLength();
        PORTclient = pack_Client.getPort();
        IPclient = pack_Client.getAddress();
        String Message= new String(pack_Client.getData()).trim();

        return Message;
    }

}