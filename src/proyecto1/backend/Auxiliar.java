/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.backend;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author gamcas
 */
public class Auxiliar {

    int posicionPersonaje;

    public ImageIcon obtenerImagen(int sizeY, String path) {

        ImageIcon cosaADevolver = new ImageIcon(getClass().getResource(path));

        Image imagen = cosaADevolver.getImage();
        Image sizeImagen = imagen.getScaledInstance(sizeY, sizeY, Image.SCALE_SMOOTH);
        cosaADevolver = new ImageIcon(sizeImagen);

        return cosaADevolver;

    }

    public static int numMovimientos() {
        int numMovimientos;
        numMovimientos = (int) ((Math.random() * 6)+1);

        return numMovimientos;
    }

}
