package proyecto1.backend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import proyecto1.ui.Interfaz1;

public class Tablero {

    public int size = 0;
    public JPanel fondo = null;
    public Interfaz1 ui = new Interfaz1();

    public int[][] matrizLogica;
    public JLabel[][] matrizGrafica;
   

    public int sizeBloqueY;
    public Personaje princesa, princesaR;
    public Personaje mago, magoR;
    public Personaje guerrero, guerreroR;
    public Personaje bomba;
    public Personaje corazon;
    
    public Random random = new Random();

    public Tablero(int size, JPanel panel) {
        this.size = size;
        this.fondo = panel;
        llenar();
 
    }

    public Tablero() {

    }
    
    public void llenarBombas() {
        int cantidadBombas = (int) (size * (0.0938) * size);
        for (int i = 0; i <= cantidadBombas; i++) {
            matrizLogica[random.nextInt(size)][random.nextInt(size)] = 2;

        }
    }

    public void llenarCorazones() {
        int cantidadVidas = (int) (size * (0.047) * size);
        for (int i = 0; i <= cantidadVidas; i++) {
            matrizLogica[random.nextInt(size)][random.nextInt(size)] = 1;

        }
    }

    public void llenar() {

        sizeBloqueY = 600 / size;
        matrizLogica = new int[size][size];
        matrizGrafica = new JLabel[size][size];

        for (int i = 1; i < size; i++) {
            for (int j = 1; j < size; j++) {

                matrizLogica[i][j] = 0;
            }
        }
        llenarBombas();
        llenarCorazones();

        matrizLogica[random.nextInt(size)][random.nextInt(size)] = 3;
        mago = new Personaje();

        matrizLogica[random.nextInt(size)][random.nextInt(size)] = 4;
        guerrero = new Personaje();

        matrizLogica[random.nextInt(size)][random.nextInt(size)] = 5;
        princesa = new Personaje();

        matrizLogica[random.nextInt(size)][random.nextInt(size)] = 6;
        magoR = new Personaje();

        matrizLogica[random.nextInt(size)][random.nextInt(size)] = 7;
        guerreroR = new Personaje();

        matrizLogica[random.nextInt(size)][random.nextInt(size)] = 8;
        princesaR = new Personaje();

        bomba = new Personaje();
        corazon = new Personaje();
        repintar();
    }

    public void getPosicion() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                switch (matrizLogica[i][j]) {
                    case 3:
                        mago.posicionPersonajeX = j;
                        mago.posicionPersonajeY = i;
                        break;
                    case 4:
                        guerrero.posicionPersonajeX = j;
                        guerrero.posicionPersonajeY = i;
                        break;
                    case 5:
                        princesa.posicionPersonajeX = j;
                        princesa.posicionPersonajeY = i;
                        break;
                    case 6:
                        magoR.posicionPersonajeX = j;
                        magoR.posicionPersonajeY = i;
                        break;
                    case 7:
                        guerreroR.posicionPersonajeX = j;
                        guerreroR.posicionPersonajeY = i;
                        break;
                    case 8:
                        princesaR.posicionPersonajeX = j;
                        princesaR.posicionPersonajeY = i;
                        break;
                    default:
                        break;
                }
            }
        }
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
                        casilla = new JLabel(this.corazon.obtenerImagen(sizeBloqueY, "/Imagen/corazon.jpg"));
                        break;
                    case 2:
                        casilla = new JLabel(this.bomba.obtenerImagen(sizeBloqueY, "/Imagen/bomba.jpg"));
                        break;
                    case 3:
                        casilla = new JLabel(this.mago.obtenerImagen(sizeBloqueY, "/Imagen/mago.png"));
                        break;
                    case 4:
                        casilla = new JLabel(this.guerrero.obtenerImagen(sizeBloqueY, "/Imagen/guerrero.jpg"));
                        break;
                    case 5:
                        casilla = new JLabel(this.princesa.obtenerImagen(sizeBloqueY, "/Imagen/princesa.jpg"));
                        break;
                    case 6:
                        casilla = new JLabel(this.magoR.obtenerImagen(sizeBloqueY, "/Imagen/magoR.png"));
                        break;
                    case 7:
                        casilla = new JLabel(this.guerreroR.obtenerImagen(sizeBloqueY, "/Imagen/guerreroR.jpg"));
                        break;
                    case 8:
                        casilla = new JLabel(this.princesaR.obtenerImagen(sizeBloqueY, "/Imagen/princesaR.jpg"));
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
