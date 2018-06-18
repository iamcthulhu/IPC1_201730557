
package proyecto1.backend;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.ImageIcon;
import proyecto1.ui.Interfaz1;


public class Nucleo {
    
    	public Jugador jugador1;
	public Jugador jugador2;
        public Personaje dado;
	private ControladorTurno controlador;
        private Interfaz1 ui;
    public Nucleo() {
        controlador=new ControladorTurno();
        ui= new Interfaz1();
    }

    

  
    
    public Jugador iniciarJuego(Jugador jugador1, Jugador jugador2 ){
        
        this.jugador1=jugador1;
        this.jugador2=jugador2; 
        
        return controlador.iniciarTurno(jugador1, jugador2);
    }
  
    public Jugador obtenerGandor(){
        
        if (jugador1.getVidas()>jugador2.getVidas()) {
            return jugador1;
            
        }else if (jugador2.getVidas()> jugador1.getVidas()) {
            return jugador2;
        }

            return null;
        }
    
    }
    

