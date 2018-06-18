package proyecto1.ui;

import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import proyecto1.backend.Personaje;
import proyecto1.backend.Movimiento;
import proyecto1.backend.Tablero;
import proyecto1.backend.*;

public class Interfaz1 extends javax.swing.JFrame {

    public Tablero tablero;
    public boolean tableroCreado,v1,v2 = false;
    public Informarcion info;
    public static String botonPulsado;
    public Movimiento movi;
    public Vida vida1,vida2;
    public Timer timer = new Timer();
    public Cronometro cronometro= new Cronometro();
    public TimerTask tt;

    public Interfaz1() {
        initComponents();
        info = new Informarcion(this);
        cronometro.start();
        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                tiempoM.setText(String.valueOf(cronometro.minutos));
                int min = cronometro.minutos;
                tiempoS.setText(String.valueOf(cronometro.segundos));

                if (((String.valueOf(info.tiempo.getText()))).equals(cronometro.minutos)) {
                    timer.cancel();
                    JOptionPane.showMessageDialog(null, "Termino el juego");
                }
            }
        };
        timer.schedule(tt, 0, 1000);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        moverArriba = new javax.swing.JButton();
        moverIzquierda = new javax.swing.JButton();
        moverDerecha = new javax.swing.JButton();
        lanzarDado = new javax.swing.JButton();
        atacar = new javax.swing.JButton();
        numDado = new javax.swing.JLabel();
        tiempoM = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        moverAbajo = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        panelv1 = new javax.swing.JPanel();
        panelv2 = new javax.swing.JPanel();
        panelv3 = new javax.swing.JPanel();
        tiempoS = new javax.swing.JLabel();
        tiempoM1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(21, 14, 14));

        panel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(142, 52, 52)));
        panel1.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jLabel19.setText("JUGADOR 2:");

        name2.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        name2.setText("NOMBRE");

        jLabel22.setText("PERSONAJES:");

        p4.setText("personaje 1");

        p5.setText("personaje 2");

        moverArriba.setForeground(new java.awt.Color(255, 0, 51));
        moverArriba.setText("Arriba");
        moverArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverArribaActionPerformed(evt);
            }
        });

        moverIzquierda.setText("Izquierda");
        moverIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverIzquierdaActionPerformed(evt);
            }
        });

        moverDerecha.setText("Derecha");
        moverDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverDerechaActionPerformed(evt);
            }
        });

        lanzarDado.setText("Lanzar dado");
        lanzarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarDadoActionPerformed(evt);
            }
        });

        atacar.setText("Atacar");

        numDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/dadofondo.jpg"))); // NOI18N
        numDado.setText("NUMERO DADO");
        numDado.setPreferredSize(new java.awt.Dimension(150, 150));

        tiempoM.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        tiempoM.setText("00");

        jLabel26.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel26.setText("TIEMPO:");

        jLabel27.setText("JUGADOR 1:");

        name1.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        name1.setText("NOMBRE");

        jLabel29.setText("PERSONAJES:");

        p1.setText("personaje 1");

        p2.setText("personaje 2");

        p3.setText("personaje 3");

        jLabel33.setText("VIDAS");

        p6.setText("personaje 3");

        jLabel36.setText("VIDAS");

        moverAbajo.setForeground(new java.awt.Color(255, 0, 51));
        moverAbajo.setText("Abajo");
        moverAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverAbajoActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel28.setText("Jugador en turno");

        jLabel37.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel37.setText("Turno:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel38.setText("Personaje:");

        jLabel39.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel39.setText("Personaje en turno");

        javax.swing.GroupLayout panelv1Layout = new javax.swing.GroupLayout(panelv1);
        panelv1.setLayout(panelv1Layout);
        panelv1Layout.setHorizontalGroup(
            panelv1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        panelv1Layout.setVerticalGroup(
            panelv1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        panelv2.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout panelv2Layout = new javax.swing.GroupLayout(panelv2);
        panelv2.setLayout(panelv2Layout);
        panelv2Layout.setHorizontalGroup(
            panelv2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelv2Layout.setVerticalGroup(
            panelv2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelv3Layout = new javax.swing.GroupLayout(panelv3);
        panelv3.setLayout(panelv3Layout);
        panelv3Layout.setHorizontalGroup(
            panelv3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelv3Layout.setVerticalGroup(
            panelv3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        tiempoS.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        tiempoS.setText("00");

        tiempoM1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        tiempoM1.setText(":");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name1)
                                    .addComponent(panelv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel39))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(p1)
                                                            .addComponent(p2)
                                                            .addComponent(p3))
                                                        .addComponent(jLabel29))
                                                    .addComponent(jLabel22))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel28)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(12, 12, 12)
                                                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(43, 43, 43)))))
                                        .addGap(16, 16, 16))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(p5)
                                                    .addComponent(p4)
                                                    .addComponent(p6))
                                                .addGap(18, 18, 18)
                                                .addComponent(numDado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tiempoM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tiempoM1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tiempoS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel36)
                                                .addGap(33, 33, 33)
                                                .addComponent(panelv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(moverIzquierda)
                                                .addGap(54, 54, 54)
                                                .addComponent(moverDerecha)
                                                .addGap(79, 79, 79)
                                                .addComponent(atacar)
                                                .addGap(18, 18, 18)
                                                .addComponent(lanzarDado))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(18, 18, 18)
                                        .addComponent(name2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(moverArriba)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(panelv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(moverAbajo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(name1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panelv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel37)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel28)
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel38)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel39))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(panelv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(name2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel36)))
                        .addGap(33, 33, 33)
                        .addComponent(moverArriba))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(tiempoM)
                            .addComponent(tiempoS)
                            .addComponent(tiempoM1))
                        .addGap(13, 13, 13)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(p4)
                        .addGap(12, 12, 12)
                        .addComponent(p5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p6)
                            .addComponent(numDado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moverIzquierda)
                    .addComponent(moverDerecha)
                    .addComponent(atacar)
                    .addComponent(lanzarDado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(moverAbajo)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jMenu1.setText("Opciones");

        jMenuItem1.setText("Nuevo Juego");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        info.setVisible(true);
        panel1.removeAll();
        panel1.repaint();
       
        panelv3.removeAll();
        panelv3.repaint();
        vida1 = new Vida();
        vida1 = new Vida(Vida.vidas, panelv3);
        v1=true;   
        
        try {
            tablero = new Tablero();
            tablero = new Tablero(tablero.validar(Integer.parseInt(info.sizeTablero.getText())), panel1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
     
        panelv2.removeAll();
        panelv2.repaint();
        vida2=new Vida(Vida.vidas,panelv2);
        v2=true;
        
        name1.setText(info.name1.getText());
        name2.setText(info.name2.getText());
        p1.setText((String) info.pos1.getValue());
        p2.setText((String) info.pos2.getValue());
        p3.setText((String) info.pos3.getValue());
        p4.setText((String) info.pos4.getValue());
        p5.setText((String) info.pos5.getValue());
        p6.setText((String) info.pos6.getValue());
        tableroCreado = true;

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void moverArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverArribaActionPerformed
        botonPulsado = evt.getActionCommand();
        if (!tableroCreado) {
            System.out.println("Tablero no creado");
            return;
        }
        movi = new Movimiento(2, tablero);
        movi.start();
// TODO add your handling code here:
    }//GEN-LAST:event_moverArribaActionPerformed

    private void moverIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverIzquierdaActionPerformed
        botonPulsado = evt.getActionCommand();
        if (!tableroCreado) {
            System.out.println("Tablero no creado");
            return;
        }
        movi = new Movimiento(2, tablero);
        movi.start();
// TODO add your handling code here:
    }//GEN-LAST:event_moverIzquierdaActionPerformed

    private void moverDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverDerechaActionPerformed
        botonPulsado = evt.getActionCommand();
        if (!tableroCreado) {
            System.out.println("Tablero no creado");
            return;
        }
        movi = new Movimiento(2, tablero);
        movi.start();

    }//GEN-LAST:event_moverDerechaActionPerformed

    private void lanzarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarDadoActionPerformed

        System.out.println(lanzarDado());
        lanzarDado();
    }//GEN-LAST:event_lanzarDadoActionPerformed

    private void moverAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverAbajoActionPerformed

        botonPulsado = evt.getActionCommand();
        if (!tableroCreado) {
            System.out.println("Tablero no creado");
            return;
        }
        movi = new Movimiento(2, tablero);
        movi.start();
    }//GEN-LAST:event_moverAbajoActionPerformed

    public int lanzarDado() {
        int numMovimientos = (int) (Math.random() * 6 + 1);

        switch (numMovimientos) {

            case 1:
                numDado.setIcon(new ImageIcon(getClass().getResource("/imagen/dado1.png")));
                break;
            case 2:
                numDado.setIcon(new ImageIcon(getClass().getResource("/imagen/dado2.png")));
                break;
            case 3:
                numDado.setIcon(new ImageIcon(getClass().getResource("/imagen/dado3.png")));
                break;
            case 4:
                numDado.setIcon(new ImageIcon(getClass().getResource("/imagen/dado4.png")));
                break;
            case 5:
                numDado.setIcon(new ImageIcon(getClass().getResource("/imagen/dado5.png")));
                break;
            case 6:
                numDado.setIcon(new ImageIcon(getClass().getResource("/imagen/dado6.png")));
                break;

        }
        return numMovimientos;
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton atacar;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton lanzarDado;
    public javax.swing.JButton moverAbajo;
    public javax.swing.JButton moverArriba;
    public javax.swing.JButton moverDerecha;
    public javax.swing.JButton moverIzquierda;
    public javax.swing.JLabel name1;
    public javax.swing.JLabel name2;
    public javax.swing.JLabel numDado;
    public javax.swing.JLabel p1;
    public javax.swing.JLabel p2;
    public javax.swing.JLabel p3;
    public javax.swing.JLabel p4;
    public javax.swing.JLabel p5;
    public javax.swing.JLabel p6;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelv1;
    public javax.swing.JPanel panelv2;
    public javax.swing.JPanel panelv3;
    public javax.swing.JLabel tiempoM;
    public javax.swing.JLabel tiempoM1;
    public javax.swing.JLabel tiempoS;
    // End of variables declaration//GEN-END:variables
}
