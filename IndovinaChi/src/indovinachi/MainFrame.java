/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package indovinachi;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import static java.awt.PageAttributes.ColorType.COLOR;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.colorchooser.AbstractColorChooserPanel;

/**
 *
 * @author User
 */
public class MainFrame extends javax.swing.JFrame {
    public String rimozioneSu="s;";
    public String rimozioneGiu="g;";
    public String rimozioneSuAvversario="";
    public String rimozioneGiuAvversario="";
    List listaImmagini=new ArrayList();
    public boolean check1 = true;
    public boolean check2 = true;
    public boolean check3 = true;
    public boolean check4 = true;
    public boolean check5 = true;
    public boolean check6 = true;
    public boolean check7 = true;
    public boolean check8 = true;
    public boolean check9 = true;
    public boolean check10 = true;
    public boolean check11 = true;
    public boolean check12 = true;
    public boolean check13 = true;
    public boolean check14 = true;
    public boolean check15 = true;
    public boolean check16 = true;
    public boolean check17 = true;
    public boolean check18 = true;
    public boolean check19 = true;
    public boolean check20 = true;
    public boolean check21 = true;
    public boolean check22 = true;
    public boolean check23 = true;
    public boolean check24 = true;
    public boolean checkMain = true;
    ImageIcon immagine1 = new ImageIcon("src\\Images\\1.png");
    ImageIcon immagine2 = new ImageIcon("src\\Images\\2.png");
    ImageIcon immagine3 = new ImageIcon("src\\Images\\3.png");
    ImageIcon immagine4 = new ImageIcon("src\\Images\\4.png");
    ImageIcon immagine5 = new ImageIcon("src\\Images\\5.png");
    ImageIcon immagine6 = new ImageIcon("src\\Images\\6.png");
    ImageIcon immagine7 = new ImageIcon("src\\Images\\7.png");
    ImageIcon immagine8 = new ImageIcon("src\\Images\\8.png");
    ImageIcon immagine9 = new ImageIcon("src\\Images\\9.png");
    ImageIcon immagine10 = new ImageIcon("src\\Images\\10.png");
    ImageIcon immagine11 = new ImageIcon("src\\Images\\11.png");
    ImageIcon immagine12 = new ImageIcon("src\\Images\\12.png");
    ImageIcon immagine13 = new ImageIcon("src\\Images\\13.png");
    ImageIcon immagine14 = new ImageIcon("src\\Images\\14.png");
    ImageIcon immagine15 = new ImageIcon("src\\Images\\15.png");
    ImageIcon immagine16 = new ImageIcon("src\\Images\\16.png");
    ImageIcon immagine17 = new ImageIcon("src\\Images\\17.png");
    ImageIcon immagine18 = new ImageIcon("src\\Images\\18.png");
    ImageIcon immagine19 = new ImageIcon("src\\Images\\19.png");
    ImageIcon immagine20 = new ImageIcon("src\\Images\\20.png");
    ImageIcon immagine21 = new ImageIcon("src\\Images\\21.png");
    ImageIcon immagine22 = new ImageIcon("src\\Images\\22.png");
    ImageIcon immagine23 = new ImageIcon("src\\Images\\23.png");
    ImageIcon immagine24 = new ImageIcon("src\\Images\\24.png");

    ImageIcon immagine1x = new ImageIcon("src\\Imageswithx\\1.png");
    ImageIcon immagine2x = new ImageIcon("src\\Imageswithx\\2.png");
    ImageIcon immagine3x = new ImageIcon("src\\Imageswithx\\3.png");
    ImageIcon immagine4x = new ImageIcon("src\\Imageswithx\\4.png");
    ImageIcon immagine5x = new ImageIcon("src\\Imageswithx\\5.png");
    ImageIcon immagine6x = new ImageIcon("src\\Imageswithx\\6.png");
    ImageIcon immagine7x = new ImageIcon("src\\Imageswithx\\7.png");
    ImageIcon immagine8x = new ImageIcon("src\\Imageswithx\\8.png");
    ImageIcon immagine9x = new ImageIcon("src\\Imageswithx\\9.png");
    ImageIcon immagine10x = new ImageIcon("src\\Imageswithx\\10.png");
    ImageIcon immagine11x = new ImageIcon("src\\Imageswithx\\11.png");
    ImageIcon immagine12x = new ImageIcon("src\\Imageswithx\\12.png");
    ImageIcon immagine13x = new ImageIcon("src\\Imageswithx\\13.png");
    ImageIcon immagine14x = new ImageIcon("src\\Imageswithx\\14.png");
    ImageIcon immagine15x = new ImageIcon("src\\Imageswithx\\15.png");
    ImageIcon immagine16x = new ImageIcon("src\\Imageswithx\\16.png");
    ImageIcon immagine17x = new ImageIcon("src\\Imageswithx\\17.png");
    ImageIcon immagine18x = new ImageIcon("src\\Imageswithx\\18.png");
    ImageIcon immagine19x = new ImageIcon("src\\Imageswithx\\19.png");
    ImageIcon immagine20x = new ImageIcon("src\\Imageswithx\\20.png");
    ImageIcon immagine21x = new ImageIcon("src\\Imageswithx\\21.png");
    ImageIcon immagine22x = new ImageIcon("src\\Imageswithx\\22.png");
    ImageIcon immagine23x = new ImageIcon("src\\Imageswithx\\23.png");
    ImageIcon immagine24x = new ImageIcon("src\\Imageswithx\\24.png");
    
    ImageIcon avversario = new ImageIcon("src\\imageAvversario\\avversario.png");
    ImageIcon avversarioRimosso = new ImageIcon("src\\imageAvversario\\avversarioRimosso.png");
    
    ImageIcon randomButton = new ImageIcon("src\\ImageRandom\\randomButton.png");

    /**
     * Creates new form MainFrame
     */
    
    int y = 0;
    Condivisa c;
    UtilPacchetto up;

    public MainFrame() throws SocketException, UnknownHostException {
        String s = (String) JOptionPane.showInputDialog(
                this,
                "Inserire username giocatore\n",
                "Login Dialog",
                JOptionPane.PLAIN_MESSAGE
        );
            listaImmagini.add(immagine1);
            listaImmagini.add(immagine2);
            listaImmagini.add(immagine3);
            listaImmagini.add(immagine4);
            listaImmagini.add(immagine5);
            listaImmagini.add(immagine6);
            listaImmagini.add(immagine7);
            listaImmagini.add(immagine8);
            listaImmagini.add(immagine9);
            listaImmagini.add(immagine10);
            listaImmagini.add(immagine11);
            listaImmagini.add(immagine12);
            listaImmagini.add(immagine13);
            listaImmagini.add(immagine14);
            listaImmagini.add(immagine15);
            listaImmagini.add(immagine16);
            listaImmagini.add(immagine17);
            listaImmagini.add(immagine18);
            listaImmagini.add(immagine19);
            listaImmagini.add(immagine20);
            listaImmagini.add(immagine21);
            listaImmagini.add(immagine22);
            listaImmagini.add(immagine23);
            listaImmagini.add(immagine24);
            Collections.shuffle(listaImmagini);
        if (s != null && !s.equals("")) {
            initComponents();
            image1.setIcon((Icon) listaImmagini.get(0));
            image2.setIcon((Icon) listaImmagini.get(1));
            image3.setIcon((Icon) listaImmagini.get(2));
            image4.setIcon((Icon) listaImmagini.get(3));
            image5.setIcon((Icon) listaImmagini.get(4));
            image6.setIcon((Icon) listaImmagini.get(5));
            image7.setIcon((Icon) listaImmagini.get(6));
            image8.setIcon((Icon) listaImmagini.get(7));
            image9.setIcon((Icon) listaImmagini.get(8));
            image10.setIcon((Icon) listaImmagini.get(9));
            image11.setIcon((Icon) listaImmagini.get(10));
            image12.setIcon((Icon) listaImmagini.get(11));
            image13.setIcon((Icon) listaImmagini.get(12));
            image14.setIcon((Icon) listaImmagini.get(13));
            image15.setIcon((Icon) listaImmagini.get(14));
            image16.setIcon((Icon) listaImmagini.get(15));
            image17.setIcon((Icon) listaImmagini.get(16));
            image18.setIcon((Icon) listaImmagini.get(17));
            image19.setIcon((Icon) listaImmagini.get(18));
            image20.setIcon((Icon) listaImmagini.get(19));
            image21.setIcon((Icon) listaImmagini.get(20));
            image22.setIcon((Icon) listaImmagini.get(21));
            image23.setIcon((Icon) listaImmagini.get(22));
            image24.setIcon((Icon) listaImmagini.get(23));
            image1.setText("");
            image2.setText("");
            image3.setText("");
            image4.setText("");
            image5.setText("");
            image6.setText("");
            image7.setText("");
            image8.setText("");
            image9.setText("");
            image10.setText("");
            image11.setText("");
            image12.setText("");
            image13.setText("");
            image14.setText("");
            image15.setText("");
            image16.setText("");
            image17.setText("");
            image18.setText("");
            image19.setText("");
            image20.setText("");
            image21.setText("");
            image22.setText("");
            image23.setText("");
            image24.setText("");
            
            imageMain.setText("");
            imageMain.setIcon(randomButton);
            
            avversario1.setIcon(avversario);
            avversario2.setIcon(avversario);
            avversario3.setIcon(avversario);
            avversario4.setIcon(avversario);
            avversario5.setIcon(avversario);
            avversario6.setIcon(avversario);
            avversario7.setIcon(avversario);
            avversario8.setIcon(avversario);
            avversario9.setIcon(avversario);
            avversario10.setIcon(avversario);
            avversario11.setIcon(avversario);
            avversario12.setIcon(avversario);
            avversario13.setIcon(avversario);
            avversario14.setIcon(avversario);
            avversario15.setIcon(avversario);
            avversario16.setIcon(avversario);
            avversario17.setIcon(avversario);
            avversario18.setIcon(avversario);
            avversario19.setIcon(avversario);
            avversario20.setIcon(avversario);
            avversario21.setIcon(avversario);
            avversario22.setIcon(avversario);
            avversario23.setIcon(avversario);
            avversario24.setIcon(avversario);
            avversario1.setText("");
            avversario2.setText("");
            avversario3.setText("");
            avversario4.setText("");
            avversario5.setText("");
            avversario6.setText("");
            avversario7.setText("");
            avversario8.setText("");
            avversario9.setText("");
            avversario10.setText("");
            avversario11.setText("");
            avversario12.setText("");
            avversario13.setText("");
            avversario14.setText("");
            avversario15.setText("");
            avversario16.setText("");
            avversario17.setText("");
            avversario18.setText("");
            avversario19.setText("");
            avversario20.setText("");
            avversario21.setText("");
            avversario22.setText("");
            avversario23.setText("");
            avversario24.setText("");
            
            
            
            c = Condivisa.getInstance();
            c.setFrame(this);
            this.setTitle("INDOVINA CHI");

            c.nome = s;
            System.out.println("NOME: " + s);
            panel.setLayout(new GridBagLayout());
            panel.setDoubleBuffered(true);
            getContentPane().setBackground(Color.YELLOW);
        } else {
            System.exit(0);
        }

            
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        image1 = new javax.swing.JLabel();
        image3 = new javax.swing.JLabel();
        image2 = new javax.swing.JLabel();
        image4 = new javax.swing.JLabel();
        image5 = new javax.swing.JLabel();
        image6 = new javax.swing.JLabel();
        image7 = new javax.swing.JLabel();
        image8 = new javax.swing.JLabel();
        image9 = new javax.swing.JLabel();
        image10 = new javax.swing.JLabel();
        image11 = new javax.swing.JLabel();
        image12 = new javax.swing.JLabel();
        image13 = new javax.swing.JLabel();
        image14 = new javax.swing.JLabel();
        image15 = new javax.swing.JLabel();
        image16 = new javax.swing.JLabel();
        image17 = new javax.swing.JLabel();
        image18 = new javax.swing.JLabel();
        image19 = new javax.swing.JLabel();
        image20 = new javax.swing.JLabel();
        image21 = new javax.swing.JLabel();
        image22 = new javax.swing.JLabel();
        image23 = new javax.swing.JLabel();
        image24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        imageMain = new javax.swing.JLabel();
        avversario12 = new javax.swing.JLabel();
        avversario13 = new javax.swing.JLabel();
        avversario14 = new javax.swing.JLabel();
        avversario15 = new javax.swing.JLabel();
        avversario16 = new javax.swing.JLabel();
        avversario17 = new javax.swing.JLabel();
        avversario18 = new javax.swing.JLabel();
        avversario19 = new javax.swing.JLabel();
        avversario20 = new javax.swing.JLabel();
        avversario21 = new javax.swing.JLabel();
        avversario22 = new javax.swing.JLabel();
        avversario1 = new javax.swing.JLabel();
        avversario23 = new javax.swing.JLabel();
        avversario3 = new javax.swing.JLabel();
        avversario24 = new javax.swing.JLabel();
        avversario2 = new javax.swing.JLabel();
        avversario4 = new javax.swing.JLabel();
        avversario5 = new javax.swing.JLabel();
        avversario6 = new javax.swing.JLabel();
        avversario7 = new javax.swing.JLabel();
        avversario8 = new javax.swing.JLabel();
        avversario9 = new javax.swing.JLabel();
        avversario10 = new javax.swing.JLabel();
        avversario11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 245));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setToolTipText("");
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setDoubleBuffered(true);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 204, 0));
        jButton1.setText("GIOCA CON:");
        jButton1.setToolTipText("");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 0), 2, true));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 204, 0));
        jTextField1.setAutoscrolls(false);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 0), 2, true));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255), 2));
        jScrollPane2.setViewportView(jTextArea1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 102, 255));
        jButton2.setText("INVIA");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/disconnetto.png"))); // NOI18N
        jButton3.setText("ESCI");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 2, true));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 102, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/next tourn.png"))); // NOI18N
        jButton4.setText("PASSA TURNO");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 102, 255), 2, true));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        image1.setText("jLabel1");
        image1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image1MouseClicked(evt);
            }
        });

        image3.setText("jLabel2");
        image3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image3MouseClicked(evt);
            }
        });

        image2.setText("jLabel3");
        image2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image2MouseClicked(evt);
            }
        });

        image4.setText("jLabel4");
        image4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image4MouseClicked(evt);
            }
        });

        image5.setText("jLabel5");
        image5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image5MouseClicked(evt);
            }
        });

        image6.setText("jLabel6");
        image6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image6MouseClicked(evt);
            }
        });

        image7.setText("jLabel7");
        image7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image7MouseClicked(evt);
            }
        });

        image8.setText("jLabel8");
        image8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image8MouseClicked(evt);
            }
        });

        image9.setText("jLabel9");
        image9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image9MouseClicked(evt);
            }
        });

        image10.setText("jLabel10");
        image10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image10MouseClicked(evt);
            }
        });

        image11.setText("jLabel11");
        image11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image11MouseClicked(evt);
            }
        });

        image12.setText("jLabel12");
        image12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image12MouseClicked(evt);
            }
        });

        image13.setText("jLabel13");
        image13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image13MouseClicked(evt);
            }
        });

        image14.setText("jLabel14");
        image14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image14MouseClicked(evt);
            }
        });

        image15.setText("jLabel15");
        image15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image15MouseClicked(evt);
            }
        });

        image16.setText("jLabel16");
        image16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image16MouseClicked(evt);
            }
        });

        image17.setText("jLabel17");
        image17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image17MouseClicked(evt);
            }
        });

        image18.setText("jLabel18");
        image18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image18MouseClicked(evt);
            }
        });

        image19.setText("jLabel19");
        image19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image19MouseClicked(evt);
            }
        });

        image20.setText("jLabel20");
        image20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image20MouseClicked(evt);
            }
        });

        image21.setText("jLabel21");
        image21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image21MouseClicked(evt);
            }
        });

        image22.setText("jLabel22");
        image22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image22MouseClicked(evt);
            }
        });

        image23.setText("jLabel23");
        image23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image23MouseClicked(evt);
            }
        });

        image24.setText("jLabel24");
        image24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image24MouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guesswho.png"))); // NOI18N

        jButton5.setForeground(new java.awt.Color(102, 204, 0));
        jButton5.setText("PRONTO");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 0), 2, true));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        imageMain.setText("jLabel2");
        imageMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMainMouseClicked(evt);
            }
        });

        avversario12.setText("jLabel12");
        avversario12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario12MouseClicked(evt);
            }
        });

        avversario13.setText("jLabel13");
        avversario13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario13MouseClicked(evt);
            }
        });

        avversario14.setText("jLabel14");
        avversario14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario14MouseClicked(evt);
            }
        });

        avversario15.setText("jLabel15");
        avversario15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario15MouseClicked(evt);
            }
        });

        avversario16.setText("jLabel16");
        avversario16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario16MouseClicked(evt);
            }
        });

        avversario17.setText("jLabel17");
        avversario17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario17MouseClicked(evt);
            }
        });

        avversario18.setText("jLabel18");
        avversario18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario18MouseClicked(evt);
            }
        });

        avversario19.setText("jLabel19");
        avversario19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario19MouseClicked(evt);
            }
        });

        avversario20.setText("jLabel20");
        avversario20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario20MouseClicked(evt);
            }
        });

        avversario21.setText("jLabel21");
        avversario21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario21MouseClicked(evt);
            }
        });

        avversario22.setText("jLabel22");
        avversario22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario22MouseClicked(evt);
            }
        });

        avversario1.setText("jLabel1");
        avversario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario1MouseClicked(evt);
            }
        });

        avversario23.setText("jLabel23");
        avversario23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario23MouseClicked(evt);
            }
        });

        avversario3.setText("jLabel2");
        avversario3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario3MouseClicked(evt);
            }
        });

        avversario24.setText("jLabel24");
        avversario24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario24MouseClicked(evt);
            }
        });

        avversario2.setText("jLabel3");
        avversario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario2MouseClicked(evt);
            }
        });

        avversario4.setText("jLabel4");
        avversario4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario4MouseClicked(evt);
            }
        });

        avversario5.setText("jLabel5");
        avversario5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario5MouseClicked(evt);
            }
        });

        avversario6.setText("jLabel6");
        avversario6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario6MouseClicked(evt);
            }
        });

        avversario7.setText("jLabel7");
        avversario7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario7MouseClicked(evt);
            }
        });

        avversario8.setText("jLabel8");
        avversario8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario8MouseClicked(evt);
            }
        });

        avversario9.setText("jLabel9");
        avversario9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario9MouseClicked(evt);
            }
        });

        avversario10.setText("jLabel10");
        avversario10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario10MouseClicked(evt);
            }
        });

        avversario11.setText("jLabel11");
        avversario11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                avversario11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(image13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(image14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(image15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(image16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(image19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(image20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(image21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(image22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(image7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(image8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(image9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(image10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(image2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(image3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(image4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(image17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(image18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(image11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(image5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(image12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(image6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(image23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(image24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(imageMain, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(avversario13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avversario14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avversario15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(avversario16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(avversario19, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(avversario20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(avversario21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(avversario22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(avversario7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(avversario8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(avversario9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(avversario10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(avversario1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(avversario2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(avversario3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(avversario4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(avversario17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(avversario18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(avversario11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(avversario5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(avversario12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(avversario6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(avversario23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(avversario24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(36, 36, 36)
                .addComponent(Logo))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avversario6)
                            .addComponent(avversario5)
                            .addComponent(avversario4)
                            .addComponent(avversario3)
                            .addComponent(avversario2)
                            .addComponent(avversario1))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avversario7)
                            .addComponent(avversario8)
                            .addComponent(avversario9)
                            .addComponent(avversario10)
                            .addComponent(avversario11)
                            .addComponent(avversario12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avversario13)
                            .addComponent(avversario14)
                            .addComponent(avversario15)
                            .addComponent(avversario16)
                            .addComponent(avversario17)
                            .addComponent(avversario18))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(avversario19)
                            .addComponent(avversario20)
                            .addComponent(avversario21)
                            .addComponent(avversario22)
                            .addComponent(avversario23)
                            .addComponent(avversario24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(image6)
                            .addComponent(image5)
                            .addComponent(image4)
                            .addComponent(image3)
                            .addComponent(image2)
                            .addComponent(image1))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(image7)
                            .addComponent(image8)
                            .addComponent(image9)
                            .addComponent(image10)
                            .addComponent(image11)
                            .addComponent(image12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(image13)
                            .addComponent(image14)
                            .addComponent(image15)
                            .addComponent(image16)
                            .addComponent(image17)
                            .addComponent(image18))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(image19)
                            .addComponent(image20)
                            .addComponent(image21)
                            .addComponent(image22)
                            .addComponent(image23)
                            .addComponent(image24)
                            .addComponent(imageMain))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );

        jScrollPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        String ipname = jTextField1.getText();
        if (!ipname.equals("")) {
            try {
                System.out.println("P inviato\n");
                c = Condivisa.getInstance();
                String str = "a;" + c.nome + ";";
                up.setIPclient(ipname);
                up.UDP_send(str);
            } catch (SocketException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            String[] opt = {"OK", "ANNULLA"};
            int choice = JOptionPane.showOptionDialog(this, "Invito partita spedito", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[1]);

            if (choice == 1) {
                try {
                    c = Condivisa.getInstance();
                    Gestione gp = new Gestione();
                    String str = "n;" + c.nome + ";";
                    gp.connectedIP = null;
                    up.setIPclient(ipname);
                    up.UDP_send(str);
                } catch (SocketException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this, "Partita annullata");
            }

        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        if (Condivisa.connesso) {
            try {
                Condivisa.connesso = false;
                Gestione gp = new Gestione();
                String ipname = Gestione.connectedIP.getHostAddress();
                String str = "c;";
                up.setIPclient(ipname);
                up.UDP_send(str);
                gp.connectedIP = null;
            } catch (SocketException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnknownHostException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Connettersi con un giocatore");
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        //qua bisogna inviargli la stringa rimozioneSu e rimozioneGiu allavversario e rimetterle come erano prima
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void image1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image1MouseClicked
        
        if(listaImmagini.get(0)==immagine1)
        {
            if (check1 == true) {
            image1.setIcon(immagine1x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine1);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine2)
        {
            if (check1 == true) {
            image1.setIcon(immagine2x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine2);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine3)
        {
            if (check1 == true) {
            image1.setIcon(immagine3x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine3);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine4)
        {
            if (check1 == true) {
            image1.setIcon(immagine4x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine4);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine5)
        {
            if (check1 == true) {
            image1.setIcon(immagine5x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine5);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine6)
        {
            if (check1 == true) {
            image1.setIcon(immagine6x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine6);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine7)
        {
            if (check1 == true) {
            image1.setIcon(immagine7x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine7);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine8)
        {
            if (check1 == true) {
            image1.setIcon(immagine8x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine8);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine9)
        {
            if (check1 == true) {
            image1.setIcon(immagine9x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine9);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine10)
        {
            if (check1 == true) {
            image1.setIcon(immagine10x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine10);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine11)
        {
            if (check1 == true) {
            image1.setIcon(immagine11x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine11);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine12)
        {
            if (check1 == true) {
            image1.setIcon(immagine12x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine12);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine13)
        {
            if (check1 == true) {
            image1.setIcon(immagine13x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine13);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine14)
        {
            if (check1 == true) {
            image1.setIcon(immagine14x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine14);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine15)
        {
            if (check1 == true) {
            image1.setIcon(immagine15x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine15);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine16)
        {
            if (check1 == true) {
            image1.setIcon(immagine16x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine16);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine17)
        {
            if (check1 == true) {
            image1.setIcon(immagine17x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine17);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine18)
        {
            if (check1 == true) {
            image1.setIcon(immagine18x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine18);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine19)
        {
            if (check1 == true) {
            image1.setIcon(immagine19x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine19);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine20)
        {
            if (check1 == true) {
            image1.setIcon(immagine20x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine20);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine21)
        {
            if (check1 == true) {
            image1.setIcon(immagine21x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine21);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine22)
        {
            if (check1 == true) {
            image1.setIcon(immagine22x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine22);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine23)
        {
            if (check1 == true) {
            image1.setIcon(immagine23x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine23);
            check1 = true;
        }
        }
        if(listaImmagini.get(0)==immagine24)
        {
            if (check1 == true) {
            image1.setIcon(immagine24x);
            check1 = false;
        } else if (check1 == false) {
            image1.setIcon(immagine24);
            check1 = true;
        }
        }
        
        if(check1==true)
        {
            rimozioneSu+="a1,";
                    }else{
            rimozioneGiu+="a1,";
        }
    }//GEN-LAST:event_image1MouseClicked

    private void image2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image2MouseClicked
       
        if(listaImmagini.get(1)==immagine1)
        {
            if (check2 == true) {
            image2.setIcon(immagine1x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine1);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine2)
        {
            if (check2 == true) {
            image2.setIcon(immagine2x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine2);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine3)
        {
            if (check2 == true) {
            image2.setIcon(immagine3x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine3);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine4)
        {
            if (check2 == true) {
            image2.setIcon(immagine4x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine4);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine5)
        {
            if (check2 == true) {
            image2.setIcon(immagine5x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine5);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine6)
        {
            if (check2 == true) {
            image2.setIcon(immagine6x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine6);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine7)
        {
            if (check2 == true) {
            image2.setIcon(immagine7x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine7);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine8)
        {
            if (check2 == true) {
            image2.setIcon(immagine8x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine8);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine9)
        {
            if (check2 == true) {
            image2.setIcon(immagine9x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine9);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine10)
        {
            if (check2 == true) {
            image2.setIcon(immagine10x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine10);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine11)
        {
            if (check2 == true) {
            image2.setIcon(immagine11x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine11);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine12)
        {
            if (check2 == true) {
            image2.setIcon(immagine12x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine12);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine13)
        {
            if (check2 == true) {
            image2.setIcon(immagine13x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine13);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine14)
        {
            if (check2 == true) {
            image2.setIcon(immagine14x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine14);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine15)
        {
            if (check2 == true) {
            image2.setIcon(immagine15x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine15);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine16)
        {
            if (check2 == true) {
            image2.setIcon(immagine16x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine16);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine17)
        {
            if (check2 == true) {
            image2.setIcon(immagine17x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine17);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine18)
        {
            if (check2 == true) {
            image2.setIcon(immagine18x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine18);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine19)
        {
            if (check2 == true) {
            image2.setIcon(immagine19x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine19);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine20)
        {
            if (check2 == true) {
            image2.setIcon(immagine20x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine20);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine21)
        {
            if (check2 == true) {
            image2.setIcon(immagine21x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine21);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine22)
        {
            if (check2 == true) {
            image2.setIcon(immagine22x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine22);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine23)
        {
            if (check2 == true) {
            image2.setIcon(immagine23x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine23);
            check2 = true;
        }
        }
        if(listaImmagini.get(1)==immagine24)
        {
            if (check2 == true) {
            image2.setIcon(immagine24x);
            check2 = false;
        } else if (check2 == false) {
            image2.setIcon(immagine24);
            check2 = true;
        }
        }
        if(check2==true)
        {
            rimozioneSu+="a2,";
                    }else{
            rimozioneGiu+="a2,";
        }
    }//GEN-LAST:event_image2MouseClicked

    private void image3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image3MouseClicked
        
        if(listaImmagini.get(2)==immagine1)
        {
            if (check3 == true) {
            image3.setIcon(immagine1x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine1);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine2)
        {
            if (check3 == true) {
            image3.setIcon(immagine2x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine2);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine3)
        {
            if (check3 == true) {
            image3.setIcon(immagine3x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine3);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine4)
        {
            if (check3 == true) {
            image3.setIcon(immagine4x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine4);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine5)
        {
            if (check3 == true) {
            image3.setIcon(immagine5x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine5);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine6)
        {
            if (check3 == true) {
            image3.setIcon(immagine6x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine6);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine7)
        {
            if (check3 == true) {
            image3.setIcon(immagine7x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine7);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine8)
        {
            if (check3 == true) {
            image3.setIcon(immagine8x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine8);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine9)
        {
            if (check3 == true) {
            image3.setIcon(immagine9x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine9);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine10)
        {
            if (check3 == true) {
            image3.setIcon(immagine10x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine10);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine11)
        {
            if (check3 == true) {
            image3.setIcon(immagine11x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine11);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine12)
        {
            if (check3 == true) {
            image3.setIcon(immagine12x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine12);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine13)
        {
            if (check3 == true) {
            image3.setIcon(immagine13x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine13);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine14)
        {
            if (check3 == true) {
            image3.setIcon(immagine14x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine14);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine15)
        {
            if (check3 == true) {
            image3.setIcon(immagine15x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine15);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine16)
        {
            if (check3 == true) {
            image3.setIcon(immagine16x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine16);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine17)
        {
            if (check3 == true) {
            image3.setIcon(immagine17x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine17);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine18)
        {
            if (check3 == true) {
            image3.setIcon(immagine18x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine18);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine19)
        {
            if (check3 == true) {
            image3.setIcon(immagine19x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine19);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine20)
        {
            if (check3 == true) {
            image3.setIcon(immagine20x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine20);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine21)
        {
            if (check3 == true) {
            image3.setIcon(immagine21x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine21);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine22)
        {
            if (check3 == true) {
            image3.setIcon(immagine22x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine22);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine23)
        {
            if (check3 == true) {
            image3.setIcon(immagine23x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine23);
            check3 = true;
        }
        }
        if(listaImmagini.get(2)==immagine24)
        {
            if (check3 == true) {
            image3.setIcon(immagine24x);
            check3 = false;
        } else if (check3 == false) {
            image3.setIcon(immagine24);
            check3 = true;
        }
        }
        if(check3==true)
        {
            rimozioneSu+="a3,";
                    }else{
            rimozioneGiu+="a3,";
        }
    }//GEN-LAST:event_image3MouseClicked

    private void image4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image4MouseClicked
        
        if(listaImmagini.get(3)==immagine1)
        {
            if (check4 == true) {
            image4.setIcon(immagine1x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine1);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine2)
        {
            if (check4 == true) {
            image4.setIcon(immagine2x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine2);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine3)
        {
            if (check4 == true) {
            image4.setIcon(immagine3x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine3);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine4)
        {
            if (check4 == true) {
            image4.setIcon(immagine4x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine4);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine5)
        {
            if (check4 == true) {
            image4.setIcon(immagine5x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine5);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine6)
        {
            if (check4 == true) {
            image4.setIcon(immagine6x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine6);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine7)
        {
            if (check4 == true) {
            image4.setIcon(immagine7x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine7);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine8)
        {
            if (check4 == true) {
            image4.setIcon(immagine8x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine8);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine9)
        {
            if (check4 == true) {
            image4.setIcon(immagine9x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine9);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine10)
        {
            if (check4 == true) {
            image4.setIcon(immagine10x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine10);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine11)
        {
            if (check4 == true) {
            image4.setIcon(immagine11x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine11);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine12)
        {
            if (check4 == true) {
            image4.setIcon(immagine12x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine12);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine13)
        {
            if (check4 == true) {
            image4.setIcon(immagine13x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine13);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine14)
        {
            if (check4 == true) {
            image4.setIcon(immagine14x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine14);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine15)
        {
            if (check4 == true) {
            image4.setIcon(immagine15x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine15);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine16)
        {
            if (check4 == true) {
            image4.setIcon(immagine16x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine16);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine17)
        {
            if (check4 == true) {
            image4.setIcon(immagine17x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine17);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine18)
        {
            if (check4 == true) {
            image4.setIcon(immagine18x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine18);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine19)
        {
            if (check4 == true) {
            image4.setIcon(immagine19x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine19);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine20)
        {
            if (check4 == true) {
            image4.setIcon(immagine20x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine20);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine21)
        {
            if (check4 == true) {
            image4.setIcon(immagine21x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine21);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine22)
        {
            if (check4 == true) {
            image4.setIcon(immagine22x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine22);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine23)
        {
            if (check4 == true) {
            image4.setIcon(immagine23x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine23);
            check4 = true;
        }
        }
        if(listaImmagini.get(3)==immagine24)
        {
            if (check4 == true) {
            image4.setIcon(immagine24x);
            check4 = false;
        } else if (check4 == false) {
            image4.setIcon(immagine24);
            check4 = true;
        }
        }
        if(check4==true)
        {
            rimozioneSu+="a4,";
                    }else{
            rimozioneGiu+="a4,";
        }
    }//GEN-LAST:event_image4MouseClicked

    private void image5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image5MouseClicked
        
        if(listaImmagini.get(4)==immagine1)
        {
            if (check5 == true) {
            image5.setIcon(immagine1x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine1);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine2)
        {
            if (check5 == true) {
            image5.setIcon(immagine2x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine2);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine3)
        {
            if (check5 == true) {
            image5.setIcon(immagine3x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine3);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine4)
        {
            if (check5 == true) {
            image5.setIcon(immagine4x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine4);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine5)
        {
            if (check5 == true) {
            image5.setIcon(immagine5x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine5);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine6)
        {
            if (check5 == true) {
            image5.setIcon(immagine6x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine6);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine7)
        {
            if (check5 == true) {
            image5.setIcon(immagine7x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine7);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine8)
        {
            if (check5 == true) {
            image5.setIcon(immagine8x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine8);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine9)
        {
            if (check5 == true) {
            image5.setIcon(immagine9x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine9);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine10)
        {
            if (check5 == true) {
            image5.setIcon(immagine10x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine10);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine11)
        {
            if (check5 == true) {
            image5.setIcon(immagine11x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine11);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine12)
        {
            if (check5 == true) {
            image5.setIcon(immagine12x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine12);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine13)
        {
            if (check5 == true) {
            image5.setIcon(immagine13x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine13);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine14)
        {
            if (check5 == true) {
            image5.setIcon(immagine14x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine14);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine15)
        {
            if (check5 == true) {
            image5.setIcon(immagine15x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine15);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine16)
        {
            if (check5 == true) {
            image5.setIcon(immagine16x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine16);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine17)
        {
            if (check5 == true) {
            image5.setIcon(immagine17x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine17);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine18)
        {
            if (check5 == true) {
            image5.setIcon(immagine18x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine18);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine19)
        {
            if (check5 == true) {
            image5.setIcon(immagine19x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine19);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine20)
        {
            if (check5 == true) {
            image5.setIcon(immagine20x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine20);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine21)
        {
            if (check5 == true) {
            image5.setIcon(immagine21x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine21);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine22)
        {
            if (check5 == true) {
            image5.setIcon(immagine22x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine22);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine23)
        {
            if (check5 == true) {
            image5.setIcon(immagine23x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine23);
            check5 = true;
        }
        }
        if(listaImmagini.get(4)==immagine24)
        {
            if (check5 == true) {
            image5.setIcon(immagine24x);
            check5 = false;
        } else if (check5 == false) {
            image5.setIcon(immagine24);
            check5 = true;
        }
        }
        if(check5==true)
        {
            rimozioneSu+="a5,";
                    }else{
            rimozioneGiu+="a5,";
        }
    }//GEN-LAST:event_image5MouseClicked

    private void image6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image6MouseClicked
        
        if(listaImmagini.get(5)==immagine1)
        {
            if (check6 == true) {
            image6.setIcon(immagine1x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine1);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine2)
        {
            if (check6 == true) {
            image6.setIcon(immagine2x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine2);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine3)
        {
            if (check6 == true) {
            image6.setIcon(immagine3x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine3);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine4)
        {
            if (check6 == true) {
            image6.setIcon(immagine4x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine4);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine5)
        {
            if (check6 == true) {
            image6.setIcon(immagine5x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine5);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine6)
        {
            if (check6 == true) {
            image6.setIcon(immagine6x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine6);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine7)
        {
            if (check6 == true) {
            image6.setIcon(immagine7x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine7);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine8)
        {
            if (check6 == true) {
            image6.setIcon(immagine8x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine8);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine9)
        {
            if (check6 == true) {
            image6.setIcon(immagine9x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine9);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine10)
        {
            if (check6 == true) {
            image6.setIcon(immagine10x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine10);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine11)
        {
            if (check6 == true) {
            image6.setIcon(immagine11x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine11);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine12)
        {
            if (check6 == true) {
            image6.setIcon(immagine12x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine12);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine13)
        {
            if (check6 == true) {
            image6.setIcon(immagine13x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine13);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine14)
        {
            if (check6 == true) {
            image6.setIcon(immagine14x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine14);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine15)
        {
            if (check6 == true) {
            image6.setIcon(immagine15x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine15);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine16)
        {
            if (check6 == true) {
            image6.setIcon(immagine16x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine16);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine17)
        {
            if (check6 == true) {
            image6.setIcon(immagine17x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine17);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine18)
        {
            if (check6 == true) {
            image6.setIcon(immagine18x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine18);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine19)
        {
            if (check6 == true) {
            image6.setIcon(immagine19x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine19);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine20)
        {
            if (check6 == true) {
            image6.setIcon(immagine20x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine20);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine21)
        {
            if (check6 == true) {
            image6.setIcon(immagine21x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine21);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine22)
        {
            if (check6 == true) {
            image6.setIcon(immagine22x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine22);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine23)
        {
            if (check6 == true) {
            image6.setIcon(immagine23x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine23);
            check6 = true;
        }
        }
        if(listaImmagini.get(5)==immagine24)
        {
            if (check6 == true) {
            image6.setIcon(immagine24x);
            check6 = false;
        } else if (check6 == false) {
            image6.setIcon(immagine24);
            check6 = true;
        }
        }
        if(check6==true)
        {
            rimozioneSu+="a6,";
                    }else{
            rimozioneGiu+="a6,";
        }
    }//GEN-LAST:event_image6MouseClicked

    private void image7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image7MouseClicked
        
        if(listaImmagini.get(6)==immagine1)
        {
            if (check7 == true) {
            image7.setIcon(immagine1x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine1);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine2)
        {
            if (check7 == true) {
            image7.setIcon(immagine2x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine2);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine3)
        {
            if (check7 == true) {
            image7.setIcon(immagine3x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine3);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine4)
        {
            if (check7 == true) {
            image7.setIcon(immagine4x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine4);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine5)
        {
            if (check7 == true) {
            image7.setIcon(immagine5x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine5);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine6)
        {
            if (check7 == true) {
            image7.setIcon(immagine6x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine6);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine7)
        {
            if (check7 == true) {
            image7.setIcon(immagine7x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine7);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine8)
        {
            if (check7 == true) {
            image7.setIcon(immagine8x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine8);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine9)
        {
            if (check7 == true) {
            image7.setIcon(immagine9x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine9);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine10)
        {
            if (check7 == true) {
            image7.setIcon(immagine10x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine10);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine11)
        {
            if (check7 == true) {
            image7.setIcon(immagine11x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine11);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine12)
        {
            if (check7 == true) {
            image7.setIcon(immagine12x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine12);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine13)
        {
            if (check7 == true) {
            image7.setIcon(immagine13x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine13);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine14)
        {
            if (check7 == true) {
            image7.setIcon(immagine14x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine14);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine15)
        {
            if (check7 == true) {
            image7.setIcon(immagine15x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine15);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine16)
        {
            if (check7 == true) {
            image7.setIcon(immagine16x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine16);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine17)
        {
            if (check7 == true) {
            image7.setIcon(immagine17x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine17);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine18)
        {
            if (check7 == true) {
            image7.setIcon(immagine18x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine18);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine19)
        {
            if (check7 == true) {
            image7.setIcon(immagine19x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine19);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine20)
        {
            if (check7 == true) {
            image7.setIcon(immagine20x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine20);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine21)
        {
            if (check7 == true) {
            image7.setIcon(immagine21x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine21);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine22)
        {
            if (check7 == true) {
            image7.setIcon(immagine22x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine22);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine23)
        {
            if (check7 == true) {
            image7.setIcon(immagine23x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine23);
            check7 = true;
        }
        }
        if(listaImmagini.get(6)==immagine24)
        {
            if (check7 == true) {
            image7.setIcon(immagine24x);
            check7 = false;
        } else if (check7 == false) {
            image7.setIcon(immagine24);
            check7 = true;
        }
        }
        if(check7==true)
        {
            rimozioneSu+="b1,";
                    }else{
            rimozioneGiu+="b1,";
        }
    }//GEN-LAST:event_image7MouseClicked

    private void image8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image8MouseClicked
        
        if(listaImmagini.get(7)==immagine1)
        {
            if (check8 == true) {
            image8.setIcon(immagine1x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine1);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine2)
        {
            if (check8 == true) {
            image8.setIcon(immagine2x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine2);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine3)
        {
            if (check8 == true) {
            image8.setIcon(immagine3x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine3);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine4)
        {
            if (check8 == true) {
            image8.setIcon(immagine4x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine4);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine5)
        {
            if (check8 == true) {
            image8.setIcon(immagine5x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine5);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine6)
        {
            if (check8 == true) {
            image8.setIcon(immagine6x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine6);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine7)
        {
            if (check8 == true) {
            image8.setIcon(immagine7x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine7);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine8)
        {
            if (check8 == true) {
            image8.setIcon(immagine8x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine8);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine9)
        {
            if (check8 == true) {
            image8.setIcon(immagine9x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine9);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine10)
        {
            if (check8 == true) {
            image8.setIcon(immagine10x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine10);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine11)
        {
            if (check8 == true) {
            image8.setIcon(immagine11x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine11);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine12)
        {
            if (check8 == true) {
            image8.setIcon(immagine12x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine12);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine13)
        {
            if (check8 == true) {
            image8.setIcon(immagine13x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine13);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine14)
        {
            if (check8 == true) {
            image8.setIcon(immagine14x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine14);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine15)
        {
            if (check8 == true) {
            image8.setIcon(immagine15x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine15);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine16)
        {
            if (check8 == true) {
            image8.setIcon(immagine16x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine16);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine17)
        {
            if (check8 == true) {
            image8.setIcon(immagine17x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine17);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine18)
        {
            if (check8 == true) {
            image8.setIcon(immagine18x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine18);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine19)
        {
            if (check8 == true) {
            image8.setIcon(immagine19x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine19);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine20)
        {
            if (check8 == true) {
            image8.setIcon(immagine20x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine20);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine21)
        {
            if (check8 == true) {
            image8.setIcon(immagine21x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine21);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine22)
        {
            if (check8 == true) {
            image8.setIcon(immagine22x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine22);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine23)
        {
            if (check8 == true) {
            image8.setIcon(immagine23x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine23);
            check8 = true;
        }
        }
        if(listaImmagini.get(7)==immagine24)
        {
            if (check8 == true) {
            image8.setIcon(immagine24x);
            check8 = false;
        } else if (check8 == false) {
            image8.setIcon(immagine24);
            check8 = true;
        }
        }
        if(check8==true)
        {
            rimozioneSu+="b2,";
                    }else{
            rimozioneGiu+="b2,";
        }
    }//GEN-LAST:event_image8MouseClicked

    private void image9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image9MouseClicked
        
        if(listaImmagini.get(8)==immagine1)
        {
            if (check9 == true) {
            image9.setIcon(immagine1x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine1);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine2)
        {
            if (check9 == true) {
            image9.setIcon(immagine2x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine2);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine3)
        {
            if (check9 == true) {
            image9.setIcon(immagine3x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine3);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine4)
        {
            if (check9 == true) {
            image9.setIcon(immagine4x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine4);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine5)
        {
            if (check9 == true) {
            image9.setIcon(immagine5x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine5);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine6)
        {
            if (check9 == true) {
            image9.setIcon(immagine6x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine6);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine7)
        {
            if (check9 == true) {
            image9.setIcon(immagine7x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine7);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine8)
        {
            if (check9 == true) {
            image9.setIcon(immagine8x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine8);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine9)
        {
            if (check9 == true) {
            image9.setIcon(immagine9x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine9);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine10)
        {
            if (check9 == true) {
            image9.setIcon(immagine10x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine10);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine11)
        {
            if (check9 == true) {
            image9.setIcon(immagine11x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine11);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine12)
        {
            if (check9 == true) {
            image9.setIcon(immagine12x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine12);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine13)
        {
            if (check9 == true) {
            image9.setIcon(immagine13x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine13);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine14)
        {
            if (check9 == true) {
            image9.setIcon(immagine14x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine14);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine15)
        {
            if (check9 == true) {
            image9.setIcon(immagine15x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine15);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine16)
        {
            if (check9 == true) {
            image9.setIcon(immagine16x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine16);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine17)
        {
            if (check9 == true) {
            image9.setIcon(immagine17x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine17);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine18)
        {
            if (check9 == true) {
            image9.setIcon(immagine18x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine18);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine19)
        {
            if (check9 == true) {
            image9.setIcon(immagine19x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine19);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine20)
        {
            if (check9 == true) {
            image9.setIcon(immagine20x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine20);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine21)
        {
            if (check9 == true) {
            image9.setIcon(immagine21x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine21);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine22)
        {
            if (check9 == true) {
            image9.setIcon(immagine22x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine22);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine23)
        {
            if (check9 == true) {
            image9.setIcon(immagine23x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine23);
            check9 = true;
        }
        }
        if(listaImmagini.get(8)==immagine24)
        {
            if (check9 == true) {
            image9.setIcon(immagine24x);
            check9 = false;
        } else if (check9 == false) {
            image9.setIcon(immagine24);
            check9 = true;
        }
        }
        if(check9==true)
        {
            rimozioneSu+="b3,";
                    }else{
            rimozioneGiu+="b3,";
        }
    }//GEN-LAST:event_image9MouseClicked

    private void image10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image10MouseClicked
        
        if(listaImmagini.get(9)==immagine1)
        {
            if (check10 == true) {
            image10.setIcon(immagine1x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine1);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine2)
        {
            if (check10 == true) {
            image10.setIcon(immagine2x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine2);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine3)
        {
            if (check10 == true) {
            image10.setIcon(immagine3x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine3);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine4)
        {
            if (check10 == true) {
            image10.setIcon(immagine4x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine4);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine5)
        {
            if (check10 == true) {
            image10.setIcon(immagine5x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine5);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine6)
        {
            if (check10 == true) {
            image10.setIcon(immagine6x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine6);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine7)
        {
            if (check10 == true) {
            image10.setIcon(immagine7x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine7);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine8)
        {
            if (check10 == true) {
            image10.setIcon(immagine8x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine8);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine9)
        {
            if (check10 == true) {
            image10.setIcon(immagine9x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine9);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine10)
        {
            if (check10 == true) {
            image10.setIcon(immagine10x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine10);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine11)
        {
            if (check10 == true) {
            image10.setIcon(immagine11x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine11);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine12)
        {
            if (check10 == true) {
            image10.setIcon(immagine12x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine12);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine13)
        {
            if (check10 == true) {
            image10.setIcon(immagine13x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine13);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine14)
        {
            if (check10 == true) {
            image10.setIcon(immagine14x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine14);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine15)
        {
            if (check10 == true) {
            image10.setIcon(immagine15x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine15);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine16)
        {
            if (check10 == true) {
            image10.setIcon(immagine16x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine16);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine17)
        {
            if (check10 == true) {
            image10.setIcon(immagine17x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine17);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine18)
        {
            if (check10 == true) {
            image10.setIcon(immagine18x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine18);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine19)
        {
            if (check10 == true) {
            image10.setIcon(immagine19x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine19);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine20)
        {
            if (check10 == true) {
            image10.setIcon(immagine20x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine20);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine21)
        {
            if (check10 == true) {
            image10.setIcon(immagine21x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine21);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine22)
        {
            if (check10 == true) {
            image10.setIcon(immagine22x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine22);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine23)
        {
            if (check10 == true) {
            image10.setIcon(immagine23x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine23);
            check10 = true;
        }
        }
        if(listaImmagini.get(9)==immagine24)
        {
            if (check10 == true) {
            image10.setIcon(immagine24x);
            check10 = false;
        } else if (check10 == false) {
            image10.setIcon(immagine24);
            check10 = true;
        }
        }
        if(check10==true)
        {
            rimozioneSu+="b4,";
                    }else{
            rimozioneGiu+="b4,";
        }
    }//GEN-LAST:event_image10MouseClicked

    private void image11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image11MouseClicked
        
        if(listaImmagini.get(10)==immagine1)
        {
            if (check11 == true) {
            image11.setIcon(immagine1x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine1);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine2)
        {
            if (check11 == true) {
            image11.setIcon(immagine2x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine2);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine3)
        {
            if (check11 == true) {
            image11.setIcon(immagine3x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine3);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine4)
        {
            if (check11 == true) {
            image11.setIcon(immagine4x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine4);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine5)
        {
            if (check11 == true) {
            image11.setIcon(immagine5x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine5);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine6)
        {
            if (check11 == true) {
            image11.setIcon(immagine6x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine6);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine7)
        {
            if (check11 == true) {
            image11.setIcon(immagine7x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine7);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine8)
        {
            if (check11 == true) {
            image11.setIcon(immagine8x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine8);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine9)
        {
            if (check11 == true) {
            image11.setIcon(immagine9x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine9);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine10)
        {
            if (check11 == true) {
            image11.setIcon(immagine10x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine10);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine11)
        {
            if (check11 == true) {
            image11.setIcon(immagine11x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine11);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine12)
        {
            if (check11 == true) {
            image11.setIcon(immagine12x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine12);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine13)
        {
            if (check11 == true) {
            image11.setIcon(immagine13x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine13);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine14)
        {
            if (check11 == true) {
            image11.setIcon(immagine14x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine14);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine15)
        {
            if (check11 == true) {
            image11.setIcon(immagine15x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine15);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine16)
        {
            if (check11 == true) {
            image11.setIcon(immagine16x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine16);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine17)
        {
            if (check11 == true) {
            image11.setIcon(immagine17x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine17);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine18)
        {
            if (check11 == true) {
            image11.setIcon(immagine18x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine18);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine19)
        {
            if (check11 == true) {
            image11.setIcon(immagine19x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine19);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine20)
        {
            if (check11 == true) {
            image11.setIcon(immagine20x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine20);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine21)
        {
            if (check11 == true) {
            image11.setIcon(immagine21x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine21);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine22)
        {
            if (check11 == true) {
            image11.setIcon(immagine22x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine22);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine23)
        {
            if (check11 == true) {
            image11.setIcon(immagine23x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine23);
            check11 = true;
        }
        }
        if(listaImmagini.get(10)==immagine24)
        {
            if (check11 == true) {
            image11.setIcon(immagine24x);
            check11 = false;
        } else if (check11 == false) {
            image11.setIcon(immagine24);
            check11 = true;
        }
        }
        if(check11==true)
        {
            rimozioneSu+="b5,";
                    }else{
            rimozioneGiu+="b5,";
        }
    }//GEN-LAST:event_image11MouseClicked

    private void image12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image12MouseClicked
        
        if(listaImmagini.get(11)==immagine1)
        {
            if (check12 == true) {
            image12.setIcon(immagine1x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine1);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine2)
        {
            if (check12 == true) {
            image12.setIcon(immagine2x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine2);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine3)
        {
            if (check12 == true) {
            image12.setIcon(immagine3x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine3);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine4)
        {
            if (check12 == true) {
            image12.setIcon(immagine4x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine4);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine5)
        {
            if (check12 == true) {
            image12.setIcon(immagine5x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine5);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine6)
        {
            if (check12 == true) {
            image12.setIcon(immagine6x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine6);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine7)
        {
            if (check12 == true) {
            image12.setIcon(immagine7x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine7);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine8)
        {
            if (check12 == true) {
            image12.setIcon(immagine8x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine8);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine9)
        {
            if (check12 == true) {
            image12.setIcon(immagine9x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine9);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine10)
        {
            if (check12 == true) {
            image12.setIcon(immagine10x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine10);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine11)
        {
            if (check12 == true) {
            image12.setIcon(immagine11x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine11);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine12)
        {
            if (check12 == true) {
            image12.setIcon(immagine12x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine12);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine13)
        {
            if (check12 == true) {
            image12.setIcon(immagine13x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine13);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine14)
        {
            if (check12 == true) {
            image12.setIcon(immagine14x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine14);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine15)
        {
            if (check12 == true) {
            image12.setIcon(immagine15x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine15);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine16)
        {
            if (check12 == true) {
            image12.setIcon(immagine16x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine16);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine17)
        {
            if (check12 == true) {
            image12.setIcon(immagine17x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine17);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine18)
        {
            if (check12 == true) {
            image12.setIcon(immagine18x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine18);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine19)
        {
            if (check12 == true) {
            image12.setIcon(immagine19x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine19);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine20)
        {
            if (check12 == true) {
            image12.setIcon(immagine20x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine20);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine21)
        {
            if (check12 == true) {
            image12.setIcon(immagine21x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine21);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine22)
        {
            if (check12 == true) {
            image12.setIcon(immagine22x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine22);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine23)
        {
            if (check12 == true) {
            image12.setIcon(immagine23x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine23);
            check12 = true;
        }
        }
        if(listaImmagini.get(11)==immagine24)
        {
            if (check12 == true) {
            image12.setIcon(immagine24x);
            check12 = false;
        } else if (check12 == false) {
            image12.setIcon(immagine24);
            check12 = true;
        }
        }
        if(check12==true)
        {
            rimozioneSu+="b6,";
                    }else{
            rimozioneGiu+="b6,";
        }
    }//GEN-LAST:event_image12MouseClicked

    private void image13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image13MouseClicked
        
        if(listaImmagini.get(12)==immagine1)
        {
            if (check13 == true) {
            image13.setIcon(immagine1x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine1);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine2)
        {
            if (check13 == true) {
            image13.setIcon(immagine2x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine2);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine3)
        {
            if (check13 == true) {
            image13.setIcon(immagine3x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine3);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine4)
        {
            if (check13 == true) {
            image13.setIcon(immagine4x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine4);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine5)
        {
            if (check13 == true) {
            image13.setIcon(immagine5x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine5);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine6)
        {
            if (check13 == true) {
            image13.setIcon(immagine6x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine6);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine7)
        {
            if (check13 == true) {
            image13.setIcon(immagine7x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine7);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine8)
        {
            if (check13 == true) {
            image13.setIcon(immagine8x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine8);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine9)
        {
            if (check13 == true) {
            image13.setIcon(immagine9x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine9);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine10)
        {
            if (check13 == true) {
            image13.setIcon(immagine10x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine10);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine11)
        {
            if (check13 == true) {
            image13.setIcon(immagine11x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine11);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine12)
        {
            if (check13 == true) {
            image13.setIcon(immagine12x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine12);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine13)
        {
            if (check13 == true) {
            image13.setIcon(immagine13x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine13);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine14)
        {
            if (check13 == true) {
            image13.setIcon(immagine14x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine14);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine15)
        {
            if (check13 == true) {
            image13.setIcon(immagine15x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine15);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine16)
        {
            if (check13 == true) {
            image13.setIcon(immagine16x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine16);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine17)
        {
            if (check13 == true) {
            image13.setIcon(immagine17x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine17);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine18)
        {
            if (check13 == true) {
            image13.setIcon(immagine18x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine18);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine19)
        {
            if (check13 == true) {
            image13.setIcon(immagine19x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine19);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine20)
        {
            if (check13 == true) {
            image13.setIcon(immagine20x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine20);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine21)
        {
            if (check13 == true) {
            image13.setIcon(immagine21x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine21);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine22)
        {
            if (check13 == true) {
            image13.setIcon(immagine22x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine22);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine23)
        {
            if (check13 == true) {
            image13.setIcon(immagine23x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine23);
            check13 = true;
        }
        }
        if(listaImmagini.get(12)==immagine24)
        {
            if (check13 == true) {
            image13.setIcon(immagine24x);
            check13 = false;
        } else if (check13 == false) {
            image13.setIcon(immagine24);
            check13 = true;
        }
        }
        if(check13==true)
        {
            rimozioneSu+="c1,";
                    }else{
            rimozioneGiu+="c1,";
        }
    }//GEN-LAST:event_image13MouseClicked

    private void image14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image14MouseClicked
        
        if(listaImmagini.get(13)==immagine1)
        {
            if (check14 == true) {
            image14.setIcon(immagine1x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine1);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine2)
        {
            if (check14 == true) {
            image14.setIcon(immagine2x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine2);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine3)
        {
            if (check14 == true) {
            image14.setIcon(immagine3x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine3);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine4)
        {
            if (check14 == true) {
            image14.setIcon(immagine4x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine4);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine5)
        {
            if (check14 == true) {
            image14.setIcon(immagine5x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine5);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine6)
        {
            if (check14 == true) {
            image14.setIcon(immagine6x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine6);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine7)
        {
            if (check14 == true) {
            image14.setIcon(immagine7x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine7);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine8)
        {
            if (check14 == true) {
            image14.setIcon(immagine8x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine8);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine9)
        {
            if (check14 == true) {
            image14.setIcon(immagine9x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine9);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine10)
        {
            if (check14 == true) {
            image14.setIcon(immagine10x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine10);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine11)
        {
            if (check14 == true) {
            image14.setIcon(immagine11x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine11);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine12)
        {
            if (check14 == true) {
            image14.setIcon(immagine12x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine12);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine13)
        {
            if (check14 == true) {
            image14.setIcon(immagine13x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine13);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine14)
        {
            if (check14 == true) {
            image14.setIcon(immagine14x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine14);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine15)
        {
            if (check14 == true) {
            image14.setIcon(immagine15x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine15);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine16)
        {
            if (check14 == true) {
            image14.setIcon(immagine16x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine16);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine17)
        {
            if (check14 == true) {
            image14.setIcon(immagine17x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine17);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine18)
        {
            if (check14 == true) {
            image14.setIcon(immagine18x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine18);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine19)
        {
            if (check14 == true) {
            image14.setIcon(immagine19x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine19);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine20)
        {
            if (check14 == true) {
            image14.setIcon(immagine20x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine20);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine21)
        {
            if (check14 == true) {
            image14.setIcon(immagine21x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine21);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine22)
        {
            if (check14 == true) {
            image14.setIcon(immagine22x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine22);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine23)
        {
            if (check14 == true) {
            image14.setIcon(immagine23x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine23);
            check14 = true;
        }
        }
        if(listaImmagini.get(13)==immagine24)
        {
            if (check14 == true) {
            image14.setIcon(immagine24x);
            check14 = false;
        } else if (check14 == false) {
            image14.setIcon(immagine24);
            check14 = true;
        }
        }
        if(check14==true)
        {
            rimozioneSu+="c2,";
                    }else{
            rimozioneGiu+="c2,";
        }
    }//GEN-LAST:event_image14MouseClicked

    private void image15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image15MouseClicked
        
        if(listaImmagini.get(14)==immagine1)
        {
            if (check15 == true) {
            image15.setIcon(immagine1x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine1);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine2)
        {
            if (check15 == true) {
            image15.setIcon(immagine2x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine2);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine3)
        {
            if (check15 == true) {
            image15.setIcon(immagine3x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine3);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine4)
        {
            if (check15 == true) {
            image15.setIcon(immagine4x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine4);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine5)
        {
            if (check15 == true) {
            image15.setIcon(immagine5x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine5);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine6)
        {
            if (check15 == true) {
            image15.setIcon(immagine6x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine6);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine7)
        {
            if (check15 == true) {
            image15.setIcon(immagine7x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine7);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine8)
        {
            if (check15 == true) {
            image15.setIcon(immagine8x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine8);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine9)
        {
            if (check15 == true) {
            image15.setIcon(immagine9x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine9);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine10)
        {
            if (check15 == true) {
            image15.setIcon(immagine10x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine10);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine11)
        {
            if (check15 == true) {
            image15.setIcon(immagine11x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine11);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine12)
        {
            if (check15 == true) {
            image15.setIcon(immagine12x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine12);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine13)
        {
            if (check15 == true) {
            image15.setIcon(immagine13x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine13);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine14)
        {
            if (check15 == true) {
            image15.setIcon(immagine14x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine14);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine15)
        {
            if (check15 == true) {
            image15.setIcon(immagine15x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine15);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine16)
        {
            if (check15 == true) {
            image15.setIcon(immagine16x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine16);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine17)
        {
            if (check15 == true) {
            image15.setIcon(immagine17x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine17);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine18)
        {
            if (check15 == true) {
            image15.setIcon(immagine18x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine18);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine19)
        {
            if (check15 == true) {
            image15.setIcon(immagine19x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine19);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine20)
        {
            if (check15 == true) {
            image15.setIcon(immagine20x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine20);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine21)
        {
            if (check15 == true) {
            image15.setIcon(immagine21x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine21);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine22)
        {
            if (check15 == true) {
            image15.setIcon(immagine22x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine22);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine23)
        {
            if (check15 == true) {
            image15.setIcon(immagine23x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine23);
            check15 = true;
        }
        }
        if(listaImmagini.get(14)==immagine24)
        {
            if (check15 == true) {
            image15.setIcon(immagine24x);
            check15 = false;
        } else if (check15 == false) {
            image15.setIcon(immagine24);
            check15 = true;
        }
        }
        if(check15==true)
        {
            rimozioneSu+="c3,";
                    }else{
            rimozioneGiu+="c3,";
        }
    }//GEN-LAST:event_image15MouseClicked

    private void image16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image16MouseClicked
        
        if(listaImmagini.get(15)==immagine1)
        {
            if (check16 == true) {
            image16.setIcon(immagine1x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine1);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine2)
        {
            if (check16 == true) {
            image16.setIcon(immagine2x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine2);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine3)
        {
            if (check16 == true) {
            image16.setIcon(immagine3x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine3);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine4)
        {
            if (check16 == true) {
            image16.setIcon(immagine4x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine4);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine5)
        {
            if (check16 == true) {
            image16.setIcon(immagine5x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine5);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine6)
        {
            if (check16 == true) {
            image16.setIcon(immagine6x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine6);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine7)
        {
            if (check16 == true) {
            image16.setIcon(immagine7x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine7);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine8)
        {
            if (check16 == true) {
            image16.setIcon(immagine8x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine8);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine9)
        {
            if (check16 == true) {
            image16.setIcon(immagine9x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine9);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine10)
        {
            if (check16 == true) {
            image16.setIcon(immagine10x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine10);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine11)
        {
            if (check16 == true) {
            image16.setIcon(immagine11x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine11);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine12)
        {
            if (check16 == true) {
            image16.setIcon(immagine12x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine12);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine13)
        {
            if (check16 == true) {
            image16.setIcon(immagine13x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine13);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine14)
        {
            if (check16 == true) {
            image16.setIcon(immagine14x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine14);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine15)
        {
            if (check16 == true) {
            image16.setIcon(immagine15x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine15);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine16)
        {
            if (check16 == true) {
            image16.setIcon(immagine16x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine16);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine17)
        {
            if (check16 == true) {
            image16.setIcon(immagine17x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine17);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine18)
        {
            if (check16 == true) {
            image16.setIcon(immagine18x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine18);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine19)
        {
            if (check16 == true) {
            image16.setIcon(immagine19x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine19);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine20)
        {
            if (check16 == true) {
            image16.setIcon(immagine20x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine20);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine21)
        {
            if (check16 == true) {
            image16.setIcon(immagine21x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine21);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine22)
        {
            if (check16 == true) {
            image16.setIcon(immagine22x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine22);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine23)
        {
            if (check16 == true) {
            image16.setIcon(immagine23x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine23);
            check16 = true;
        }
        }
        if(listaImmagini.get(15)==immagine24)
        {
            if (check16 == true) {
            image16.setIcon(immagine24x);
            check16 = false;
        } else if (check16 == false) {
            image16.setIcon(immagine24);
            check16 = true;
        }
        }
        if(check16==true)
        {
            rimozioneSu+="c4,";
                    }else{
            rimozioneGiu+="c4,";
        }
    }//GEN-LAST:event_image16MouseClicked

    private void image17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image17MouseClicked
        
        if(listaImmagini.get(16)==immagine1)
        {
            if (check17 == true) {
            image17.setIcon(immagine1x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine1);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine2)
        {
            if (check17 == true) {
            image17.setIcon(immagine2x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine2);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine3)
        {
            if (check17 == true) {
            image17.setIcon(immagine3x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine3);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine4)
        {
            if (check17 == true) {
            image17.setIcon(immagine4x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine4);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine5)
        {
            if (check17 == true) {
            image17.setIcon(immagine5x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine5);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine6)
        {
            if (check17 == true) {
            image17.setIcon(immagine6x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine6);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine7)
        {
            if (check17 == true) {
            image17.setIcon(immagine7x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine7);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine8)
        {
            if (check17 == true) {
            image17.setIcon(immagine8x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine8);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine9)
        {
            if (check17 == true) {
            image17.setIcon(immagine9x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine9);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine10)
        {
            if (check17 == true) {
            image17.setIcon(immagine10x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine10);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine11)
        {
            if (check17 == true) {
            image17.setIcon(immagine11x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine11);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine12)
        {
            if (check17 == true) {
            image17.setIcon(immagine12x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine12);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine13)
        {
            if (check17 == true) {
            image17.setIcon(immagine13x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine13);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine14)
        {
            if (check17 == true) {
            image17.setIcon(immagine14x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine14);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine15)
        {
            if (check17 == true) {
            image17.setIcon(immagine15x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine15);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine16)
        {
            if (check17 == true) {
            image17.setIcon(immagine16x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine16);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine17)
        {
            if (check17 == true) {
            image17.setIcon(immagine17x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine17);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine18)
        {
            if (check17 == true) {
            image17.setIcon(immagine18x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine18);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine19)
        {
            if (check17 == true) {
            image17.setIcon(immagine19x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine19);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine20)
        {
            if (check17 == true) {
            image17.setIcon(immagine20x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine20);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine21)
        {
            if (check17 == true) {
            image17.setIcon(immagine21x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine21);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine22)
        {
            if (check17 == true) {
            image17.setIcon(immagine22x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine22);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine23)
        {
            if (check17 == true) {
            image17.setIcon(immagine23x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine23);
            check17 = true;
        }
        }
        if(listaImmagini.get(16)==immagine24)
        {
            if (check17 == true) {
            image17.setIcon(immagine24x);
            check17 = false;
        } else if (check17 == false) {
            image17.setIcon(immagine24);
            check17 = true;
        }
        }
        if(check17==true)
        {
            rimozioneSu+="c5,";
                    }else{
            rimozioneGiu+="c5,";
        }
    }//GEN-LAST:event_image17MouseClicked

    private void image18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image18MouseClicked
        
        if(listaImmagini.get(17)==immagine1)
        {
            if (check18 == true) {
            image18.setIcon(immagine1x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine1);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine2)
        {
            if (check18 == true) {
            image18.setIcon(immagine2x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine2);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine3)
        {
            if (check18 == true) {
            image18.setIcon(immagine3x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine3);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine4)
        {
            if (check18 == true) {
            image18.setIcon(immagine4x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine4);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine5)
        {
            if (check18 == true) {
            image18.setIcon(immagine5x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine5);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine6)
        {
            if (check18 == true) {
            image18.setIcon(immagine6x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine6);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine7)
        {
            if (check18 == true) {
            image18.setIcon(immagine7x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine7);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine8)
        {
            if (check18 == true) {
            image18.setIcon(immagine8x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine8);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine9)
        {
            if (check18 == true) {
            image18.setIcon(immagine9x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine9);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine10)
        {
            if (check18 == true) {
            image18.setIcon(immagine10x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine10);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine11)
        {
            if (check18 == true) {
            image18.setIcon(immagine11x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine11);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine12)
        {
            if (check18 == true) {
            image18.setIcon(immagine12x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine12);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine13)
        {
            if (check18 == true) {
            image18.setIcon(immagine13x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine13);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine14)
        {
            if (check18 == true) {
            image18.setIcon(immagine14x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine14);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine15)
        {
            if (check18 == true) {
            image18.setIcon(immagine15x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine15);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine16)
        {
            if (check18 == true) {
            image18.setIcon(immagine16x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine16);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine17)
        {
            if (check18 == true) {
            image18.setIcon(immagine17x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine17);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine18)
        {
            if (check18 == true) {
            image18.setIcon(immagine18x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine18);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine19)
        {
            if (check18 == true) {
            image18.setIcon(immagine19x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine19);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine20)
        {
            if (check18 == true) {
            image18.setIcon(immagine20x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine20);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine21)
        {
            if (check18 == true) {
            image18.setIcon(immagine21x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine21);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine22)
        {
            if (check18 == true) {
            image18.setIcon(immagine22x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine22);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine23)
        {
            if (check18 == true) {
            image18.setIcon(immagine23x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine23);
            check18 = true;
        }
        }
        if(listaImmagini.get(17)==immagine24)
        {
            if (check18 == true) {
            image18.setIcon(immagine24x);
            check18 = false;
        } else if (check18 == false) {
            image18.setIcon(immagine24);
            check18 = true;
        }
        }
        if(check18==true)
        {
            rimozioneSu+="c6,";
                    }else{
            rimozioneGiu+="c6,";
        }
    }//GEN-LAST:event_image18MouseClicked

    private void image19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image19MouseClicked
        
        if(listaImmagini.get(18)==immagine1)
        {
            if (check19 == true) {
            image19.setIcon(immagine1x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine1);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine2)
        {
            if (check19 == true) {
            image19.setIcon(immagine2x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine2);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine3)
        {
            if (check19 == true) {
            image19.setIcon(immagine3x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine3);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine4)
        {
            if (check19 == true) {
            image19.setIcon(immagine4x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine4);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine5)
        {
            if (check19 == true) {
            image19.setIcon(immagine5x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine5);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine6)
        {
            if (check19 == true) {
            image19.setIcon(immagine6x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine6);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine7)
        {
            if (check19 == true) {
            image19.setIcon(immagine7x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine7);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine8)
        {
            if (check19 == true) {
            image19.setIcon(immagine8x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine8);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine9)
        {
            if (check19 == true) {
            image19.setIcon(immagine9x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine9);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine10)
        {
            if (check19 == true) {
            image19.setIcon(immagine10x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine10);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine11)
        {
            if (check19 == true) {
            image19.setIcon(immagine11x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine11);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine12)
        {
            if (check19 == true) {
            image19.setIcon(immagine12x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine12);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine13)
        {
            if (check19 == true) {
            image19.setIcon(immagine13x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine13);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine14)
        {
            if (check19 == true) {
            image19.setIcon(immagine14x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine14);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine15)
        {
            if (check19 == true) {
            image19.setIcon(immagine15x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine15);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine16)
        {
            if (check19 == true) {
            image19.setIcon(immagine16x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine16);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine17)
        {
            if (check19 == true) {
            image19.setIcon(immagine17x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine17);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine18)
        {
            if (check19 == true) {
            image19.setIcon(immagine18x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine18);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine19)
        {
            if (check19 == true) {
            image19.setIcon(immagine19x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine19);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine20)
        {
            if (check19 == true) {
            image19.setIcon(immagine20x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine20);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine21)
        {
            if (check19 == true) {
            image19.setIcon(immagine21x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine21);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine22)
        {
            if (check19 == true) {
            image19.setIcon(immagine22x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine22);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine23)
        {
            if (check19 == true) {
            image19.setIcon(immagine23x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine23);
            check19 = true;
        }
        }
        if(listaImmagini.get(18)==immagine24)
        {
            if (check19 == true) {
            image19.setIcon(immagine24x);
            check19 = false;
        } else if (check19 == false) {
            image19.setIcon(immagine24);
            check19 = true;
        }
        }
        if(check19==true)
        {
            rimozioneSu+="d1,";
                    }else{
            rimozioneGiu+="d1,";
        }
    }//GEN-LAST:event_image19MouseClicked

    private void image20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image20MouseClicked
        
        if(listaImmagini.get(19)==immagine1)
        {
            if (check20 == true) {
            image20.setIcon(immagine1x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine1);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine2)
        {
            if (check20 == true) {
            image20.setIcon(immagine2x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine2);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine3)
        {
            if (check20 == true) {
            image20.setIcon(immagine3x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine3);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine4)
        {
            if (check20 == true) {
            image20.setIcon(immagine4x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine4);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine5)
        {
            if (check20 == true) {
            image20.setIcon(immagine5x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine5);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine6)
        {
            if (check20 == true) {
            image20.setIcon(immagine6x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine6);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine7)
        {
            if (check20 == true) {
            image20.setIcon(immagine7x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine7);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine8)
        {
            if (check20 == true) {
            image20.setIcon(immagine8x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine8);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine9)
        {
            if (check20 == true) {
            image20.setIcon(immagine9x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine9);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine10)
        {
            if (check20 == true) {
            image20.setIcon(immagine10x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine10);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine11)
        {
            if (check20 == true) {
            image20.setIcon(immagine11x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine11);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine12)
        {
            if (check20 == true) {
            image20.setIcon(immagine12x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine12);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine13)
        {
            if (check20 == true) {
            image20.setIcon(immagine13x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine13);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine14)
        {
            if (check20 == true) {
            image20.setIcon(immagine14x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine14);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine15)
        {
            if (check20 == true) {
            image20.setIcon(immagine15x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine15);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine16)
        {
            if (check20 == true) {
            image20.setIcon(immagine16x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine16);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine17)
        {
            if (check20 == true) {
            image20.setIcon(immagine17x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine17);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine18)
        {
            if (check20 == true) {
            image20.setIcon(immagine18x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine18);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine19)
        {
            if (check20 == true) {
            image20.setIcon(immagine19x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine19);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine20)
        {
            if (check20 == true) {
            image20.setIcon(immagine20x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine20);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine21)
        {
            if (check20 == true) {
            image20.setIcon(immagine21x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine21);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine22)
        {
            if (check20 == true) {
            image20.setIcon(immagine22x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine22);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine23)
        {
            if (check20 == true) {
            image20.setIcon(immagine23x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine23);
            check20 = true;
        }
        }
        if(listaImmagini.get(19)==immagine24)
        {
            if (check20 == true) {
            image20.setIcon(immagine24x);
            check20 = false;
        } else if (check20 == false) {
            image20.setIcon(immagine24);
            check20 = true;
        }
        }
        if(check20==true)
        {
            rimozioneSu+="d2,";
                    }else{
            rimozioneGiu+="d2,";
        }
    }//GEN-LAST:event_image20MouseClicked

    private void image21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image21MouseClicked
        
        if(listaImmagini.get(20)==immagine1)
        {
            if (check21 == true) {
            image21.setIcon(immagine1x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine1);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine2)
        {
            if (check21 == true) {
            image21.setIcon(immagine2x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine2);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine3)
        {
            if (check21 == true) {
            image21.setIcon(immagine3x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine3);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine4)
        {
            if (check21 == true) {
            image21.setIcon(immagine4x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine4);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine5)
        {
            if (check21 == true) {
            image21.setIcon(immagine5x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine5);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine6)
        {
            if (check21 == true) {
            image21.setIcon(immagine6x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine6);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine7)
        {
            if (check21 == true) {
            image21.setIcon(immagine7x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine7);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine8)
        {
            if (check21 == true) {
            image21.setIcon(immagine8x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine8);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine9)
        {
            if (check21 == true) {
            image21.setIcon(immagine9x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine9);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine10)
        {
            if (check21 == true) {
            image21.setIcon(immagine10x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine10);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine11)
        {
            if (check21 == true) {
            image21.setIcon(immagine11x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine11);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine12)
        {
            if (check21 == true) {
            image21.setIcon(immagine12x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine12);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine13)
        {
            if (check21 == true) {
            image21.setIcon(immagine13x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine13);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine14)
        {
            if (check21 == true) {
            image21.setIcon(immagine14x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine14);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine15)
        {
            if (check21 == true) {
            image21.setIcon(immagine15x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine15);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine16)
        {
            if (check21 == true) {
            image21.setIcon(immagine16x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine16);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine17)
        {
            if (check21 == true) {
            image21.setIcon(immagine17x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine17);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine18)
        {
            if (check21 == true) {
            image21.setIcon(immagine18x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine18);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine19)
        {
            if (check21 == true) {
            image21.setIcon(immagine19x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine19);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine20)
        {
            if (check21 == true) {
            image21.setIcon(immagine20x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine20);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine21)
        {
            if (check21 == true) {
            image21.setIcon(immagine21x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine21);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine22)
        {
            if (check21 == true) {
            image21.setIcon(immagine22x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine22);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine23)
        {
            if (check21 == true) {
            image21.setIcon(immagine23x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine23);
            check21 = true;
        }
        }
        if(listaImmagini.get(20)==immagine24)
        {
            if (check21 == true) {
            image21.setIcon(immagine24x);
            check21 = false;
        } else if (check21 == false) {
            image21.setIcon(immagine24);
            check21 = true;
        }
        }
        if(check21==true)
        {
            rimozioneSu+="d3,";
                    }else{
            rimozioneGiu+="d3,";
        }
    }//GEN-LAST:event_image21MouseClicked

    private void image22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image22MouseClicked
        
        if(listaImmagini.get(21)==immagine1)
        {
            if (check22 == true) {
            image22.setIcon(immagine1x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine1);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine2)
        {
            if (check22 == true) {
            image22.setIcon(immagine2x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine2);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine3)
        {
            if (check22 == true) {
            image22.setIcon(immagine3x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine3);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine4)
        {
            if (check22 == true) {
            image22.setIcon(immagine4x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine4);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine5)
        {
            if (check22 == true) {
            image22.setIcon(immagine5x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine5);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine6)
        {
            if (check22 == true) {
            image22.setIcon(immagine6x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine6);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine7)
        {
            if (check22 == true) {
            image22.setIcon(immagine7x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine7);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine8)
        {
            if (check22 == true) {
            image22.setIcon(immagine8x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine8);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine9)
        {
            if (check22 == true) {
            image22.setIcon(immagine9x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine9);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine10)
        {
            if (check22 == true) {
            image22.setIcon(immagine10x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine10);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine11)
        {
            if (check22 == true) {
            image22.setIcon(immagine11x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine11);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine12)
        {
            if (check22 == true) {
            image22.setIcon(immagine12x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine12);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine13)
        {
            if (check22 == true) {
            image22.setIcon(immagine13x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine13);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine14)
        {
            if (check22 == true) {
            image22.setIcon(immagine14x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine14);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine15)
        {
            if (check22 == true) {
            image22.setIcon(immagine15x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine15);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine16)
        {
            if (check22 == true) {
            image22.setIcon(immagine16x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine16);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine17)
        {
            if (check22 == true) {
            image22.setIcon(immagine17x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine17);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine18)
        {
            if (check22 == true) {
            image22.setIcon(immagine18x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine18);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine19)
        {
            if (check22 == true) {
            image22.setIcon(immagine19x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine19);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine20)
        {
            if (check22 == true) {
            image22.setIcon(immagine20x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine20);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine21)
        {
            if (check22 == true) {
            image22.setIcon(immagine21x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine21);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine22)
        {
            if (check22 == true) {
            image22.setIcon(immagine22x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine22);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine23)
        {
            if (check22 == true) {
            image22.setIcon(immagine23x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine23);
            check22 = true;
        }
        }
        if(listaImmagini.get(21)==immagine24)
        {
            if (check22 == true) {
            image22.setIcon(immagine24x);
            check22 = false;
        } else if (check22 == false) {
            image22.setIcon(immagine24);
            check22 = true;
        }
        }
        if(check22==true)
        {
            rimozioneSu+="d4,";
                    }else{
            rimozioneGiu+="d4,";
        }
    }//GEN-LAST:event_image22MouseClicked

    private void image23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image23MouseClicked
        
        if(listaImmagini.get(22)==immagine1)
        {
            if (check23 == true) {
            image23.setIcon(immagine1x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine1);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine2)
        {
            if (check23 == true) {
            image23.setIcon(immagine2x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine2);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine3)
        {
            if (check23 == true) {
            image23.setIcon(immagine3x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine3);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine4)
        {
            if (check23 == true) {
            image23.setIcon(immagine4x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine4);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine5)
        {
            if (check23 == true) {
            image23.setIcon(immagine5x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine5);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine6)
        {
            if (check23 == true) {
            image23.setIcon(immagine6x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine6);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine7)
        {
            if (check23 == true) {
            image23.setIcon(immagine7x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine7);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine8)
        {
            if (check23 == true) {
            image23.setIcon(immagine8x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine8);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine9)
        {
            if (check23 == true) {
            image23.setIcon(immagine9x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine9);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine10)
        {
            if (check23 == true) {
            image23.setIcon(immagine10x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine10);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine11)
        {
            if (check23 == true) {
            image23.setIcon(immagine11x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine11);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine12)
        {
            if (check23 == true) {
            image23.setIcon(immagine12x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine12);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine13)
        {
            if (check23 == true) {
            image23.setIcon(immagine13x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine13);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine14)
        {
            if (check23 == true) {
            image23.setIcon(immagine14x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine14);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine15)
        {
            if (check23 == true) {
            image23.setIcon(immagine15x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine15);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine16)
        {
            if (check23 == true) {
            image23.setIcon(immagine16x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine16);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine17)
        {
            if (check23 == true) {
            image23.setIcon(immagine17x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine17);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine18)
        {
            if (check23 == true) {
            image23.setIcon(immagine18x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine18);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine19)
        {
            if (check23 == true) {
            image23.setIcon(immagine19x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine19);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine20)
        {
            if (check23 == true) {
            image23.setIcon(immagine20x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine20);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine21)
        {
            if (check23 == true) {
            image23.setIcon(immagine21x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine21);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine22)
        {
            if (check23 == true) {
            image23.setIcon(immagine22x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine22);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine23)
        {
            if (check23 == true) {
            image23.setIcon(immagine23x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine23);
            check23 = true;
        }
        }
        if(listaImmagini.get(22)==immagine24)
        {
            if (check23 == true) {
            image23.setIcon(immagine24x);
            check23 = false;
        } else if (check23 == false) {
            image23.setIcon(immagine24);
            check23 = true;
        }
        }
        if(check23==true)
        {
            rimozioneSu+="d5,";
                    }else{
            rimozioneGiu+="d5,";
        }
    }//GEN-LAST:event_image23MouseClicked

    private void image24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image24MouseClicked
        
        if(listaImmagini.get(23)==immagine1)
        {
            if (check24 == true) {
            image24.setIcon(immagine1x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine1);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine2)
        {
            if (check24 == true) {
            image24.setIcon(immagine2x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine2);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine3)
        {
            if (check24 == true) {
            image24.setIcon(immagine3x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine3);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine4)
        {
            if (check24 == true) {
            image24.setIcon(immagine4x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine4);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine5)
        {
            if (check24 == true) {
            image24.setIcon(immagine5x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine5);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine6)
        {
            if (check24 == true) {
            image24.setIcon(immagine6x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine6);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine7)
        {
            if (check24 == true) {
            image24.setIcon(immagine7x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine7);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine8)
        {
            if (check24 == true) {
            image24.setIcon(immagine8x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine8);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine9)
        {
            if (check24 == true) {
            image24.setIcon(immagine9x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine9);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine10)
        {
            if (check24 == true) {
            image24.setIcon(immagine10x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine10);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine11)
        {
            if (check24 == true) {
            image24.setIcon(immagine11x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine11);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine12)
        {
            if (check24 == true) {
            image24.setIcon(immagine12x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine12);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine13)
        {
            if (check24 == true) {
            image24.setIcon(immagine13x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine13);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine14)
        {
            if (check24 == true) {
            image24.setIcon(immagine14x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine14);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine15)
        {
            if (check24 == true) {
            image24.setIcon(immagine15x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine15);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine16)
        {
            if (check24 == true) {
            image24.setIcon(immagine16x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine16);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine17)
        {
            if (check24 == true) {
            image24.setIcon(immagine17x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine17);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine18)
        {
            if (check24 == true) {
            image24.setIcon(immagine18x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine18);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine19)
        {
            if (check24 == true) {
            image24.setIcon(immagine19x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine19);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine20)
        {
            if (check24 == true) {
            image24.setIcon(immagine20x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine20);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine21)
        {
            if (check24 == true) {
            image24.setIcon(immagine21x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine21);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine22)
        {
            if (check24 == true) {
            image24.setIcon(immagine22x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine22);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine23)
        {
            if (check24 == true) {
            image24.setIcon(immagine23x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine23);
            check24 = true;
        }
        }
        if(listaImmagini.get(23)==immagine24)
        {
            if (check24 == true) {
            image24.setIcon(immagine24x);
            check24 = false;
        } else if (check24 == false) {
            image24.setIcon(immagine24);
            check24 = true;
        }
        }
        if(check24==true)
        {
            rimozioneSu+="d6,";
                    }else{
            rimozioneGiu+="d6,";
        }
    }//GEN-LAST:event_image24MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        try {
            String ipname = Gestione.connectedIP.getHostAddress();
            String str = "m;" + jTextArea1.getText() + ";";
            up.setIPclient(ipname);
            up.UDP_send(str);
        } catch (SocketException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        JTextArea text = new JTextArea(1, 20);
        text.setEditable(false);
        text.setLineWrap(true);
        text.setText(jTextArea1.getText());
        gc.gridx = 1;
        gc.gridy = y;
        y++;

        panel.add(text, gc);
        jScrollPane1.getViewport().add(panel);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:

       if (Condivisa.connesso) {
            if (Condivisa.connesso) {
                try {
<<<<<<< Updated upstream
                    Condivisa.connesso = false;
=======
                     c.pronto = true;
>>>>>>> Stashed changes
                    Gestione gp = new Gestione();
                    String ipname = Gestione.connectedIP.getHostAddress();
                    String str = "p;";
                    up.setIPclient(ipname);
                    up.UDP_send(str);
                    gp.connectedIP = null;
                    if (c.pronto && c.prontoDest) {
                        String[] opt = {"OK", "ANNULLA"};
                        int choice = JOptionPane.showOptionDialog(this, "Il gioco ha inizio", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opt, opt[1]);
                    }
                } catch (SocketException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void imageMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMainMouseClicked
       if(checkMain==true)
        {
        imageMain.setIcon((Icon) listaImmagini.get((int) Math.floor(Math.random() * 23)));
        checkMain=false;
        }
    }//GEN-LAST:event_imageMainMouseClicked

    public void cambioImmaginiAvversario(){
        int i=0;
        if("s".equals(rimozioneSuAvversario.substring(0,1)))
        {
            rimozioneSuAvversario=rimozioneSuAvversario.replace("s;", "");
            String[] parts=rimozioneSuAvversario.split(",");
            while(i<parts.length)
            {
            if("a1".equals(parts[i]))
                avversario1.setIcon(avversario);
            if("a2".equals(parts[i]))
                avversario2.setIcon(avversario);
            if("a3".equals(parts[i]))
                avversario3.setIcon(avversario);
            if("a4".equals(parts[i]))
                avversario4.setIcon(avversario);
            if("a5".equals(parts[i]))
                avversario5.setIcon(avversario);
            if("a6".equals(parts[i]))
                avversario6.setIcon(avversario);
            if("b1".equals(parts[i]))
                avversario7.setIcon(avversario);
            if("b2".equals(parts[i]))
                avversario8.setIcon(avversario);
            if("b3".equals(parts[i]))
                avversario9.setIcon(avversario);
            if("b4".equals(parts[i]))
                avversario10.setIcon(avversario);
            if("b5".equals(parts[i]))
                avversario11.setIcon(avversario);
            if("b6".equals(parts[i]))
                avversario12.setIcon(avversario);
            if("c1".equals(parts[i]))
                avversario13.setIcon(avversario);
            if("c2".equals(parts[i]))
                avversario14.setIcon(avversario);
            if("c3".equals(parts[i]))
                avversario15.setIcon(avversario);
            if("c4".equals(parts[i]))
                avversario16.setIcon(avversario);
            if("c5".equals(parts[i]))
                avversario17.setIcon(avversario);
            if("c6".equals(parts[i]))
                avversario18.setIcon(avversario);
            if("d1".equals(parts[i]))
                avversario19.setIcon(avversario);
            if("d2".equals(parts[i]))
                avversario20.setIcon(avversario);
            if("d3".equals(parts[i]))
                avversario21.setIcon(avversario);
            if("d4".equals(parts[i]))
                avversario22.setIcon(avversario);
            if("d5".equals(parts[i]))
                avversario23.setIcon(avversario);
            if("d6".equals(parts[i]))
                avversario24.setIcon(avversario);
            i++;
            }
        }
        i=0;
        if("g".equals(rimozioneGiuAvversario.substring(0,1)))
        {
            rimozioneGiuAvversario=rimozioneGiuAvversario.replace("g;", "");
            String[] parts=rimozioneGiuAvversario.split(",");
            while(i<parts.length)
            {
            if("a1".equals(parts[i]))
                avversario1.setIcon(avversarioRimosso);
            if("a2".equals(parts[i]))
                avversario2.setIcon(avversarioRimosso);
            if("a3".equals(parts[i]))
                avversario3.setIcon(avversarioRimosso);
            if("a4".equals(parts[i]))
                avversario4.setIcon(avversarioRimosso);
            if("a5".equals(parts[i]))
                avversario5.setIcon(avversarioRimosso);
            if("a6".equals(parts[i]))
                avversario6.setIcon(avversarioRimosso);
            if("b1".equals(parts[i]))
                avversario7.setIcon(avversarioRimosso);
            if("b2".equals(parts[i]))
                avversario8.setIcon(avversarioRimosso);
            if("b3".equals(parts[i]))
                avversario9.setIcon(avversarioRimosso);
            if("b4".equals(parts[i]))
                avversario10.setIcon(avversarioRimosso);
            if("b5".equals(parts[i]))
                avversario11.setIcon(avversarioRimosso);
            if("b6".equals(parts[i]))
                avversario12.setIcon(avversarioRimosso);
            if("c1".equals(parts[i]))
                avversario13.setIcon(avversarioRimosso);
            if("c2".equals(parts[i]))
                avversario14.setIcon(avversarioRimosso);
            if("c3".equals(parts[i]))
                avversario15.setIcon(avversarioRimosso);
            if("c4".equals(parts[i]))
                avversario16.setIcon(avversarioRimosso);
            if("c5".equals(parts[i]))
                avversario17.setIcon(avversarioRimosso);
            if("c6".equals(parts[i]))
                avversario18.setIcon(avversarioRimosso);
            if("d1".equals(parts[i]))
                avversario19.setIcon(avversarioRimosso);
            if("d2".equals(parts[i]))
                avversario20.setIcon(avversarioRimosso);
            if("d3".equals(parts[i]))
                avversario21.setIcon(avversarioRimosso);
            if("d4".equals(parts[i]))
                avversario22.setIcon(avversarioRimosso);
            if("d5".equals(parts[i]))
                avversario23.setIcon(avversarioRimosso);
            if("d6".equals(parts[i]))
                avversario24.setIcon(avversarioRimosso);
            i++;
            }
        }
        rimozioneSu="";
        rimozioneGiu="";
    }
    
    
    private void avversario12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario12MouseClicked

    private void avversario13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario13MouseClicked

    private void avversario14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario14MouseClicked

    private void avversario15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario15MouseClicked

    private void avversario16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario16MouseClicked

    private void avversario17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario17MouseClicked

    private void avversario18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario18MouseClicked

    private void avversario19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario19MouseClicked

    private void avversario20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario20MouseClicked

    private void avversario21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario21MouseClicked

    private void avversario22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario22MouseClicked

    private void avversario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario1MouseClicked

    private void avversario23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario23MouseClicked

    private void avversario3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario3MouseClicked

    private void avversario24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario24MouseClicked

    private void avversario2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario2MouseClicked

    private void avversario4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario4MouseClicked

    private void avversario5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario5MouseClicked

    private void avversario6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario6MouseClicked

    private void avversario7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario7MouseClicked

    private void avversario8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario8MouseClicked

    private void avversario9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario9MouseClicked

    private void avversario10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario10MouseClicked

    private void avversario11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avversario11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_avversario11MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SocketException, InterruptedException, UnknownHostException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new MainFrame().setVisible(true);
                } catch (SocketException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        Condivisa c = Condivisa.getInstance();
        ThreadReceive tr = new ThreadReceive(c);
        ThreadGrafica tg = new ThreadGrafica();
        tg.start();
        tr.start();

    }
    JPanel panel = new JPanel();
    GridBagConstraints gc = new GridBagConstraints();
    int i = 0;

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Condivisa c = null;
        try {
            c = Condivisa.getInstance();
        } catch (SocketException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnknownHostException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (!c.messaggio.equals("")) {
            JTextArea text = new JTextArea(1, 20);
            text.setEditable(false);
            text.setLineWrap(true);
            text.setText(c.messaggio);
            gc.gridx = 0;
            gc.gridy = y;
            y++;
            panel.add(text, gc);
            jScrollPane1.getViewport().add(panel);
            c.messaggio = "";
        }
        if (!c.destinatario.equals("")) {
            TitledBorder border = new TitledBorder(c.destinatario + " VS " + c.nome);
            border.setTitleJustification(TitledBorder.CENTER);
            jScrollPane1.setBorder(border);
            this.revalidate();

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel avversario1;
    private javax.swing.JLabel avversario10;
    private javax.swing.JLabel avversario11;
    private javax.swing.JLabel avversario12;
    private javax.swing.JLabel avversario13;
    private javax.swing.JLabel avversario14;
    private javax.swing.JLabel avversario15;
    private javax.swing.JLabel avversario16;
    private javax.swing.JLabel avversario17;
    private javax.swing.JLabel avversario18;
    private javax.swing.JLabel avversario19;
    private javax.swing.JLabel avversario2;
    private javax.swing.JLabel avversario20;
    private javax.swing.JLabel avversario21;
    private javax.swing.JLabel avversario22;
    private javax.swing.JLabel avversario23;
    private javax.swing.JLabel avversario24;
    private javax.swing.JLabel avversario3;
    private javax.swing.JLabel avversario4;
    private javax.swing.JLabel avversario5;
    private javax.swing.JLabel avversario6;
    private javax.swing.JLabel avversario7;
    private javax.swing.JLabel avversario8;
    private javax.swing.JLabel avversario9;
    private javax.swing.JLabel image1;
    private javax.swing.JLabel image10;
    private javax.swing.JLabel image11;
    private javax.swing.JLabel image12;
    private javax.swing.JLabel image13;
    private javax.swing.JLabel image14;
    private javax.swing.JLabel image15;
    private javax.swing.JLabel image16;
    private javax.swing.JLabel image17;
    private javax.swing.JLabel image18;
    private javax.swing.JLabel image19;
    private javax.swing.JLabel image2;
    private javax.swing.JLabel image20;
    private javax.swing.JLabel image21;
    private javax.swing.JLabel image22;
    private javax.swing.JLabel image23;
    private javax.swing.JLabel image24;
    private javax.swing.JLabel image3;
    private javax.swing.JLabel image4;
    private javax.swing.JLabel image5;
    private javax.swing.JLabel image6;
    private javax.swing.JLabel image7;
    private javax.swing.JLabel image8;
    private javax.swing.JLabel image9;
    private javax.swing.JLabel imageMain;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
