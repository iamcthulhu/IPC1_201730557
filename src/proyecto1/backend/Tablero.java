package proyecto1.backend;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tablero {

    public int size = 0;
    public JPanel fondo = null;

    public int[][] matrizLogica;
    public JLabel[][] matrizGrafica;

    public int sizeBloqueY;
    public Auxiliar personaje;

    public Tablero(int size, JPanel panel) {
        this.size = size;
        this.fondo = panel;
        llenarBombas();
    }

    public Tablero() {
    }

    public void llenarBombas() {
        sizeBloqueY = 600 / size;
        matrizLogica = new int[size][size];
        matrizGrafica = new JLabel[size][size];

        //bombas 1, casillas vacias 0
        matrizLogica[0][0] = 1;
        personaje = new Auxiliar();
        personaje.posicionPersonaje = 0;

        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {

                matrizLogica[i][j] = 0;
            }

        }

        repintar();
    }

    public void repintar() {

        JLabel casilla = null;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                //0 casilla vacia
                switch (matrizLogica[i][j]) {
                    case 0:
                        casilla = new JLabel();
                        //si es uno
                        break;
                    case 1:
                        casilla = new JLabel(this.personaje.obtenerImagen(sizeBloqueY, "/Imagen/mago.png"));
                        break;
                    case 2:
                        break;
                    default:
                        break;
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

    public int validar(int numero) throws Exception {

        if (numero > 18 || numero < 8) {
            throw new Exception("Introduzca un numero correcto");
        } else {
            return numero;
        }
    }
}
