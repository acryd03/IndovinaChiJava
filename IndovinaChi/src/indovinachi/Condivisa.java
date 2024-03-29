/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indovinachi;

import java.net.SocketException;
import java.net.UnknownHostException;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class Condivisa {

    UtilPacchetto socketC;
    static boolean connesso = false;
    String destinatario;
    JFrame frame;
    MainFrame mainframe;
    String nome;
    String messaggio;
    static Condivisa instance=null;
    boolean pronto=false;
    boolean prontoDest=false;

    private Condivisa() throws SocketException, UnknownHostException {
        socketC = new UtilPacchetto(12345, "localhost"); //socket per ascolto
        destinatario = "";
        nome = "";
        messaggio = "";
    }

    public static Condivisa getInstance() throws SocketException, UnknownHostException {
        if (instance == null) {
            synchronized (Condivisa.class) {
                if (instance == null) {
                    instance = new Condivisa();
                }
            }
        }
        return instance;
    }

    public UtilPacchetto getSocket() {
        return socketC;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

}
