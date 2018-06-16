/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.backend;

import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto1.ui.Interfaz;

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
    
    public boolean comprobarfin(){
        if(tablero.personaje.posicionPersonaje>=tablero.size-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean comprobarinicio(){
        if(tablero.personaje.posicionPersonaje<=0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void moverAbajo(int cantidad){
        if(cantidad<=0){
            return;
        }
        if(comprobarfin()){
            cantidad=0;
            tablero.matrizLogica[tablero.size-1][tablero.size-1]=0;
            tablero.matrizGrafica[tablero.size-1][tablero.size-1].setIcon(null);
            tablero.personaje.posicionPersonaje=0;
            tablero.matrizLogica[0][0]=1;
            tablero.repintar();
            return;
        }
        else{
            try {
                //mover una posicion
                tablero.matrizLogica[tablero.personaje.posicionPersonaje][tablero.personaje.posicionPersonaje]=0;
                tablero.matrizGrafica[tablero.personaje.posicionPersonaje][tablero.personaje.posicionPersonaje].setIcon(null);
                tablero.repintar();
                tablero.personaje.posicionPersonaje+=1;
                tablero.matrizLogica[tablero.personaje.posicionPersonaje][tablero.personaje.posicionPersonaje]=1;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
                
                moverAbajo(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void moverArriba(int cantidad){
        if(cantidad<=0){
            return;
        }
        if(comprobarinicio()){
             cantidad=0;
            tablero.matrizLogica[0][0]=0;
            tablero.matrizGrafica[0][0].setIcon(null);
            tablero.personaje.posicionPersonaje=0;
            tablero.matrizLogica[tablero.size-1][tablero.size-1]=1;
            tablero.repintar();
            return;
        }
        else{
            try {
                //mover una posicion
                tablero.matrizLogica[tablero.personaje.posicionPersonaje][tablero.personaje.posicionPersonaje]=0;
                tablero.matrizGrafica[tablero.personaje.posicionPersonaje][tablero.personaje.posicionPersonaje].setIcon(null);
                tablero.repintar();
                tablero.personaje.posicionPersonaje+=1;
                tablero.matrizLogica[tablero.personaje.posicionPersonaje][tablero.personaje.posicionPersonaje]=1;
                tablero.repintar();
                cantidad--;
                Thread.sleep(500);
                
                moverArriba(cantidad);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movimiento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void run(){
        String moverAbajo="Abajo";
        String moverArriba="Arriba";
        if(Interfaz.botonPulsado.equals(moverAbajo)){
            moverAbajo(cantidad);
        }
        else if(Interfaz.botonPulsado.equals(moverArriba)){
            moverArriba(cantidad);
        }
        //moverAbajo(cantidad);
        //moverArriba(cantidad);        
    }
}