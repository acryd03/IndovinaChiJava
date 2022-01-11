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
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public boolean check1=true;
    public boolean check2=true;
    public boolean check3=true;
    public boolean check4=true;
    public boolean check5=true;
    public boolean check6=true;
    public boolean check7=true;
    public boolean check8=true;
    public boolean check9=true;
    public boolean check10=true;
    public boolean check11=true;
    public boolean check12=true;
    public boolean check13=true;
    public boolean check14=true;
    public boolean check15=true;
    public boolean check16=true;
    public boolean check17=true;
    public boolean check18=true;
    public boolean check19=true;
    public boolean check20=true;
    public boolean check21=true;
    public boolean check22=true;
    public boolean check23=true;
    public boolean check24=true;
    ImageIcon immagine1=new ImageIcon("src\\Images\\1.png");
    ImageIcon immagine2=new ImageIcon("src\\Images\\2.png");
    ImageIcon immagine3=new ImageIcon("src\\Images\\3.png");
    ImageIcon immagine4=new ImageIcon("src\\Images\\4.png");
    ImageIcon immagine5=new ImageIcon("src\\Images\\5.png");
    ImageIcon immagine6=new ImageIcon("src\\Images\\6.png");
    ImageIcon immagine7=new ImageIcon("src\\Images\\7.png");
    ImageIcon immagine8=new ImageIcon("src\\Images\\8.png");
    ImageIcon immagine9=new ImageIcon("src\\Images\\9.png");
    ImageIcon immagine10=new ImageIcon("src\\Images\\10.png");
    ImageIcon immagine11=new ImageIcon("src\\Images\\11.png");
    ImageIcon immagine12=new ImageIcon("src\\Images\\12.png");
    ImageIcon immagine13=new ImageIcon("src\\Images\\13.png");
    ImageIcon immagine14=new ImageIcon("src\\Images\\14.png");
    ImageIcon immagine15=new ImageIcon("src\\Images\\15.png");
    ImageIcon immagine16=new ImageIcon("src\\Images\\16.png");
    ImageIcon immagine17=new ImageIcon("src\\Images\\17.png");
    ImageIcon immagine18=new ImageIcon("src\\Images\\18.png");
    ImageIcon immagine19=new ImageIcon("src\\Images\\19.png");
    ImageIcon immagine20=new ImageIcon("src\\Images\\20.png");
    ImageIcon immagine21=new ImageIcon("src\\Images\\21.png");
    ImageIcon immagine22=new ImageIcon("src\\Images\\22.png");
    ImageIcon immagine23=new ImageIcon("src\\Images\\23.png");
    ImageIcon immagine24=new ImageIcon("src\\Images\\24.png");
    
    ImageIcon immagine1x=new ImageIcon("src\\Imageswithx\\1.png");
    ImageIcon immagine2x=new ImageIcon("src\\Imageswithx\\2.png");
    ImageIcon immagine3x=new ImageIcon("src\\Imageswithx\\3.png");
    ImageIcon immagine4x=new ImageIcon("src\\Imageswithx\\4.png");
    ImageIcon immagine5x=new ImageIcon("src\\Imageswithx\\5.png");
    ImageIcon immagine6x=new ImageIcon("src\\Imageswithx\\6.png");
    ImageIcon immagine7x=new ImageIcon("src\\Imageswithx\\7.png");
    ImageIcon immagine8x=new ImageIcon("src\\Imageswithx\\8.png");
    ImageIcon immagine9x=new ImageIcon("src\\Imageswithx\\9.png");
    ImageIcon immagine10x=new ImageIcon("src\\Imageswithx\\10.png");
    ImageIcon immagine11x=new ImageIcon("src\\Imageswithx\\11.png");
    ImageIcon immagine12x=new ImageIcon("src\\Imageswithx\\12.png");
    ImageIcon immagine13x=new ImageIcon("src\\Imageswithx\\13.png");
    ImageIcon immagine14x=new ImageIcon("src\\Imageswithx\\14.png");
    ImageIcon immagine15x=new ImageIcon("src\\Imageswithx\\15.png");
    ImageIcon immagine16x=new ImageIcon("src\\Imageswithx\\16.png");
    ImageIcon immagine17x=new ImageIcon("src\\Imageswithx\\17.png");
    ImageIcon immagine18x=new ImageIcon("src\\Imageswithx\\18.png");
    ImageIcon immagine19x=new ImageIcon("src\\Imageswithx\\19.png");
    ImageIcon immagine20x=new ImageIcon("src\\Imageswithx\\20.png");
    ImageIcon immagine21x=new ImageIcon("src\\Imageswithx\\21.png");
    ImageIcon immagine22x=new ImageIcon("src\\Imageswithx\\22.png");
    ImageIcon immagine23x=new ImageIcon("src\\Imageswithx\\23.png");
    ImageIcon immagine24x=new ImageIcon("src\\Imageswithx\\24.png");
    
    
    
    
    /**
     * Creates new form MainFrame
     */
    int port = 666;
    int y = 0;
    Condivisa c;
    UtilPacchetto up;

    public MainFrame() throws SocketException, UnknownHostException {
        initComponents();
        image1.setIcon(immagine1);
        image2.setIcon(immagine2);
        image3.setIcon(immagine3);
        image4.setIcon(immagine4);
        image5.setIcon(immagine5);
        image6.setIcon(immagine6);
        image7.setIcon(immagine7);
        image8.setIcon(immagine8);
        image9.setIcon(immagine9);
        image10.setIcon(immagine10);
        image11.setIcon(immagine11);
        image12.setIcon(immagine12);
        image13.setIcon(immagine13);
        image14.setIcon(immagine14);
        image15.setIcon(immagine15);
        image16.setIcon(immagine16);
        image17.setIcon(immagine17);
        image18.setIcon(immagine18);
        image19.setIcon(immagine19);
        image20.setIcon(immagine20);
        image21.setIcon(immagine21);
        image22.setIcon(immagine22);
        image23.setIcon(immagine23);
        image24.setIcon(immagine24);
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
        c = Condivisa.getInstance();
        c.setFrame(this);
        this.setTitle("INDOVINA CHI");
        String s = (String) JOptionPane.showInputDialog(
                this,
                "Inserire username giocatore\n",
                "Login Dialog",
                JOptionPane.PLAIN_MESSAGE
                
        );
        c.nome = s;
        System.out.println("NOME: " + s);
        panel.setLayout(new GridBagLayout());
        panel.setDoubleBuffered(true);
        up = new UtilPacchetto(port, "");
        getContentPane().setBackground(Color.YELLOW);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
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
                                .addComponent(image23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(image24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(image11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(image5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(image6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(image12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(Logo)
                .addGap(0, 0, 0))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
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
                                    .addComponent(image24)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(60, 60, 60))))
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
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void image1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image1MouseClicked
        if(check1==true)
        {
        image1.setIcon(immagine1x);   
        check1=false;
        }else if(check1==false)
        {
        image1.setIcon(immagine1);   
        check1=true;
        }
    }//GEN-LAST:event_image1MouseClicked

    private void image2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image2MouseClicked
        if(check2==true)
        {
        image2.setIcon(immagine2x);   
        check2=false;
        }else if(check2==false)
        {
        image2.setIcon(immagine2);   
        check2=true;
        }
    }//GEN-LAST:event_image2MouseClicked

    private void image3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image3MouseClicked
        if(check3==true)
        {
        image3.setIcon(immagine3x);   
        check3=false;
        }else if(check3==false)
        {
        image3.setIcon(immagine3);   
        check3=true;
        }
    }//GEN-LAST:event_image3MouseClicked

    private void image4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image4MouseClicked
        if(check4==true)
        {
        image4.setIcon(immagine4x);   
        check4=false;
        }else if(check4==false)
        {
        image4.setIcon(immagine4);   
        check4=true;
        }
    }//GEN-LAST:event_image4MouseClicked

    private void image5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image5MouseClicked
        if(check5==true)
        {
        image5.setIcon(immagine5x);   
        check5=false;
        }else if(check5==false)
        {
        image5.setIcon(immagine5);   
        check5=true;
        }
    }//GEN-LAST:event_image5MouseClicked

    private void image6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image6MouseClicked
        if(check6==true)
        {
        image6.setIcon(immagine6x);   
        check6=false;
        }else if(check6==false)
        {
        image6.setIcon(immagine6);   
        check6=true;
        }
    }//GEN-LAST:event_image6MouseClicked

    private void image7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image7MouseClicked
        if(check7==true)
        {
        image7.setIcon(immagine7x);   
        check7=false;
        }else if(check7==false)
        {
        image7.setIcon(immagine7);   
        check7=true;
        }
    }//GEN-LAST:event_image7MouseClicked

    private void image8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image8MouseClicked
        if(check8==true)
        {
        image8.setIcon(immagine8x);   
        check8=false;
        }else if(check8==false)
        {
        image8.setIcon(immagine8);   
        check8=true;
        }
    }//GEN-LAST:event_image8MouseClicked

    private void image9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image9MouseClicked
        if(check9==true)
        {
        image9.setIcon(immagine9x);   
        check9=false;
        }else if(check9==false)
        {
        image9.setIcon(immagine9);   
        check9=true;
        }
    }//GEN-LAST:event_image9MouseClicked

    private void image10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image10MouseClicked
        if(check10==true)
        {
        image10.setIcon(immagine10x);   
        check10=false;
        }else if(check10==false)
        {
        image10.setIcon(immagine10);   
        check10=true;
        }
    }//GEN-LAST:event_image10MouseClicked

    private void image11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image11MouseClicked
        if(check11==true)
        {
        image11.setIcon(immagine11x);   
        check11=false;
        }else if(check1==false)
        {
        image11.setIcon(immagine11);   
        check11=true;
        }
    }//GEN-LAST:event_image11MouseClicked

    private void image12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image12MouseClicked
        if(check12==true)
        {
        image12.setIcon(immagine12x);   
        check12=false;
        }else if(check12==false)
        {
        image12.setIcon(immagine12);   
        check12=true;
        }
    }//GEN-LAST:event_image12MouseClicked

    private void image13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image13MouseClicked
        if(check13==true)
        {
        image13.setIcon(immagine13x);   
        check13=false;
        }else if(check13==false)
        {
        image13.setIcon(immagine13);   
        check13=true;
        }
    }//GEN-LAST:event_image13MouseClicked

    private void image14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image14MouseClicked
        if(check14==true)
        {
        image14.setIcon(immagine14x);   
        check14=false;
        }else if(check14==false)
        {
        image14.setIcon(immagine14);   
        check14=true;
        }
    }//GEN-LAST:event_image14MouseClicked

    private void image15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image15MouseClicked
        if(check15==true)
        {
        image15.setIcon(immagine15x);   
        check15=false;
        }else if(check15==false)
        {
        image15.setIcon(immagine15);   
        check15=true;
        }
    }//GEN-LAST:event_image15MouseClicked

    private void image16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image16MouseClicked
        if(check16==true)
        {
        image16.setIcon(immagine16x);   
        check16=false;
        }else if(check16==false)
        {
        image16.setIcon(immagine16);   
        check16=true;
        }
    }//GEN-LAST:event_image16MouseClicked

    private void image17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image17MouseClicked
        if(check17==true)
        {
        image17.setIcon(immagine17x);   
        check17=false;
        }else if(check17==false)
        {
        image17.setIcon(immagine17);   
        check17=true;
        }
    }//GEN-LAST:event_image17MouseClicked

    private void image18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image18MouseClicked
        if(check18==true)
        {
        image18.setIcon(immagine18x);   
        check18=false;
        }else if(check18==false)
        {
        image18.setIcon(immagine18);   
        check18=true;
        }
    }//GEN-LAST:event_image18MouseClicked

    private void image19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image19MouseClicked
        if(check19==true)
        {
        image19.setIcon(immagine19x);   
        check19=false;
        }else if(check19==false)
        {
        image19.setIcon(immagine19);   
        check19=true;
        }
    }//GEN-LAST:event_image19MouseClicked

    private void image20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image20MouseClicked
        if(check20==true)
        {
        image20.setIcon(immagine20x);   
        check20=false;
        }else if(check20==false)
        {
        image20.setIcon(immagine20);   
        check20=true;
        }
    }//GEN-LAST:event_image20MouseClicked

    private void image21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image21MouseClicked
        if(check21==true)
        {
        image21.setIcon(immagine21x);   
        check21=false;
        }else if(check21==false)
        {
        image21.setIcon(immagine21);   
        check21=true;
        }
    }//GEN-LAST:event_image21MouseClicked

    private void image22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image22MouseClicked
        if(check22==true)
        {
        image22.setIcon(immagine22x);   
        check22=false;
        }else if(check22==false)
        {
        image22.setIcon(immagine22);   
        check22=true;
        }
    }//GEN-LAST:event_image22MouseClicked

    private void image23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image23MouseClicked
        if(check23==true)
        {
        image23.setIcon(immagine23x);   
        check23=false;
        }else if(check23==false)
        {
        image23.setIcon(immagine23);   
        check23=true;
        }
    }//GEN-LAST:event_image23MouseClicked

    private void image24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image24MouseClicked
        if(check24==true)
        {
        image24.setIcon(immagine24x);   
        check24=false;
        }else if(check24==false)
        {
        image24.setIcon(immagine24);   
        check24=true;
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
            TitledBorder border = new TitledBorder(c.destinatario);
            border.setTitleJustification(TitledBorder.CENTER);
            jScrollPane1.setBorder(border);
            this.revalidate();

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
