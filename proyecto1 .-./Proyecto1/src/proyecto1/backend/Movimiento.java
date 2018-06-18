/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.backend;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto1.ui.Interfaz1;

/**
 *
 * @author gamcas
 */
public class Movimiento extends Thread{
    
    public int cantidad=0;
    public Tablero tablero=null;
 
    
    public Movimiento(int cantidad, Tablero tablero){
        this.cantidad=cantidad;
        this.tablero=tablero;
    }
    
  public boolean finX(Personaje personaje){
        if(personaje.posicionPersonajeX>=tablero.size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean inicioX(Personaje personaje){
        if(personaje.posicionPersonajeX<=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean finY(Personaje personaje){
        if(personaje.posicionPersonajeY>=tablero.size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean inicioY(Personaje personaje){
        if(personaje.posicionPersonajeY<=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void moverAbajo(int cantidad){
        tablero.getPosicion();
        if(cantidad<=0){
            return;
        }
        if(finY(tablero.mago)){
            cantidad=0;
            
            tablero.matrizLogica[tablero.size-1][tablero.mago.posicionPersonajeX]=0;
            tablero.matrizGrafica[tablero.size-1][tablero.mago.posicionPersonajeX].setIcon(null);
            tablero.mago.posicionPersonajeX=0;
            tablero.mago.posicionPersonajeY=0;
            
            if(tablero.size%2==1){
                tablero.matrizLogica[(tablero.size-1)-((tablero.size-1)/2)][(tablero.size-1)-((tablero.size-1)/2)]=3;
            }
            else{
                tablero.matrizLogica[((tablero.size/2))][((tablero.size/2)+1)-1]=3;
            }
            tablero.repintar();
            return;
        }
        else{
            try {
                //mover una posicion
                tablero.matrizLogica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX]=0;
                tablero.matrizGrafica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX].setIcon(null);
                tablero.repintar();
                tablero.mago.posicionPersonajeY+=1;
                tablero.matrizLogica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX]=3;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
                
                moverAbajo(cantidad);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    public void moverArriba(int cantidad){
        tablero.getPosicion();
        if(cantidad<=0){
            return;
        }
        if(inicioY(tablero.mago)){
            cantidad=0;
            tablero.matrizLogica[0][tablero.mago.posicionPersonajeX]=0;
            tablero.matrizGrafica[0][tablero.mago.posicionPersonajeX].setIcon(null);
            tablero.mago.posicionPersonajeX=tablero.size-1;
            tablero.mago.posicionPersonajeY=tablero.size-1;
            
            if(tablero.size%2==1){
                tablero.matrizLogica[(tablero.size-1)-((tablero.size-1)/2)][(tablero.size-1)-((tablero.size-1)/2)]=3;
            }
            else{
                tablero.matrizLogica[((tablero.size/2))][((tablero.size/2)+1)-1]=3;
            }
            tablero.repintar();
            return;
        }
        else{
            try {
                //mover una posicion
                tablero.matrizLogica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX]=0;
                tablero.matrizGrafica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX].setIcon(null);
                tablero.repintar();
                tablero.mago.posicionPersonajeY-=1;
                tablero.matrizLogica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX]=3;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
                
                moverArriba(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void moverIzquierda(int cantidad){
        tablero.getPosicion();
        if(cantidad<=0){
            return;
        }
        if(inicioX(tablero.mago)){
            cantidad=0;
            tablero.matrizLogica[tablero.mago.posicionPersonajeY][0]=0;
            tablero.matrizGrafica[tablero.mago.posicionPersonajeY][0].setIcon(null);
            tablero.mago.posicionPersonajeX=tablero.size-1;
            tablero.mago.posicionPersonajeY=tablero.size-1;
            
            if(tablero.size%2==1){
                tablero.matrizLogica[(tablero.size-1)-((tablero.size-1)/2)][(tablero.size-1)-((tablero.size-1)/2)]=3;
            }
            else{
                tablero.matrizLogica[((tablero.size/2))][((tablero.size/2)+1)-1]=3;
            }
            tablero.repintar();
            return;
        }
        else{
            try {
                //mover una posicion
                tablero.matrizLogica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX]=0;
                tablero.matrizGrafica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX].setIcon(null);
                tablero.repintar();
                tablero.mago.posicionPersonajeX-=1;
                tablero.matrizLogica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX]=3;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
                
                moverIzquierda(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void moverDerecha(int cantidad){
        tablero.getPosicion();
        if(cantidad<=0){
            return;
        }
        if(finX(tablero.mago)){
            cantidad=0;
            
            tablero.matrizLogica[tablero.mago.posicionPersonajeY][tablero.size-1]=0;
            tablero.matrizGrafica[tablero.mago.posicionPersonajeY][tablero.size-1].setIcon(null);
            tablero.mago.posicionPersonajeX=0;
            tablero.mago.posicionPersonajeY=0;
            
            if(tablero.size%2==1){
                tablero.matrizLogica[(tablero.size-1)-((tablero.size-1)/2)][(tablero.size-1)-((tablero.size-1)/2)]=3;
            }
            else{
                tablero.matrizLogica[((tablero.size/2))][((tablero.size/2)+1)-1]=3;
            }
            tablero.repintar();
            return;
        }
        else{
            try {
                //mover una posicion
                tablero.matrizLogica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX]=0;
                tablero.matrizGrafica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX].setIcon(null);
                tablero.repintar();
                tablero.mago.posicionPersonajeX+=1;
                tablero.matrizLogica[tablero.mago.posicionPersonajeY][tablero.mago.posicionPersonajeX]=3;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
                
                moverDerecha(cantidad);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    public void run(){
      
        
        switch (Interfaz1.botonPulsado) {
            case "Abajo":
                moverAbajo(cantidad);
                break;       
            case "Arriba":
                moverArriba(cantidad);
                break;
            case "Izquierda":
               moverIzquierda(cantidad);
                break;
                 case "Derecha":
               moverDerecha(cantidad);
                break;
            default:
                break;
        }
    }
}