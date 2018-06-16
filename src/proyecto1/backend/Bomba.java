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
public class Bomba {
    
    
    public ImageIcon obtenerImagen(int sizeY, String path) {

        ImageIcon personaje = new ImageIcon(getClass().getResource(path));

        Image imagen = personaje.getImage();
        Image sizeImagen = imagen.getScaledInstance(sizeY, sizeY, Image.SCALE_SMOOTH);
        personaje = new ImageIcon(sizeImagen);

        return personaje;

    }
}
