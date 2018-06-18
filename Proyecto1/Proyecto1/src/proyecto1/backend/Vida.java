/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.backend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author joses
 */

    public class Vida {	
	
    public static int vidas = 5;
    public JPanel fondo = null;
    public static int[][] matrizLogica;
    public JLabel[][] matrizGrafica;
    public int sizeBloqueY = 0;
    public Vida vida;

    public Vida() {

    }

    public Vida(int vidas, JPanel fondo) {
        this.vidas = vidas;
        this.fondo = fondo;
        llenar();
    }

    public void llenar() {
        sizeBloqueY = 100 / vidas;
        matrizLogica = new int[vidas][vidas];
        matrizGrafica = new JLabel[vidas][vidas];

        for (int i = 0; i < vidas; i++) {
            for (int j = 0; j < vidas; j++) {
                matrizLogica[i][j] = 0;
            }
        }

        llenarVidas();
        vida = new Vida();
        repintar();
    }

    public void llenarVidas() {
        int cantVidas = 4;

        for (int j = 0; j <= cantVidas; j++) {
            matrizLogica[0][j] = 1;
            if(matrizLogica[0][4]==1){
                cantVidas++;
                matrizLogica[1][j]=1;
            }
            else if(matrizLogica[1][4]==1){
                cantVidas++;
                matrizLogica[2][j]=1;
            }
        }
    }

    public void repintar() {
        JLabel casilla = null;
        for (int i = 0; i < vidas; i++) {
            for (int j = 0; j < vidas; j++) {
                //0 casilla vacia
                if (matrizLogica[i][j] == 0) {
                    casilla = new JLabel();
                } //2 vida
                else if (matrizLogica[i][j] == 1) {
                    casilla = new JLabel(this.vida.obtenerImagen(sizeBloqueY,"/imagen/vida.png"));
                }

                casilla.setOpaque(false);
                casilla.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
                casilla.setBounds(j * sizeBloqueY, i * sizeBloqueY, sizeBloqueY, sizeBloqueY);

                matrizGrafica[i][j] = casilla;
                fondo.add(matrizGrafica[i][j], BorderLayout.CENTER);
                fondo.repaint();
            }
        }
    
    }
        public ImageIcon obtenerImagen(int sizeY, String path) {

        ImageIcon icon = new ImageIcon(getClass().getResource(path));

        Image imagen = icon.getImage();
        Image sizeImagen = imagen.getScaledInstance(sizeY, sizeY, Image.SCALE_SMOOTH);
        icon = new ImageIcon(sizeImagen);

        return icon;

    }

    }