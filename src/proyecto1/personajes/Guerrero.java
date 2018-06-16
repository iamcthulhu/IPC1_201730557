
package proyecto1.personajes;

import java.awt.Image;
import javax.swing.ImageIcon;


public class Guerrero {
    
    
        public ImageIcon obtenerImagen(int sizeY, String path) {

        ImageIcon cosaADevolver = new ImageIcon(getClass().getResource(path));

        Image imagen = cosaADevolver.getImage();
        Image sizeImagen = imagen.getScaledInstance(sizeY, sizeY, Image.SCALE_SMOOTH);
        cosaADevolver = new ImageIcon(sizeImagen);

        return cosaADevolver;

    }
}
