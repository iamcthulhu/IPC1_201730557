/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.backend;

/**
 *
 * @author gamcas
 */
public class Jugador {
    
    private String name;
    private  int vidas;

    public Jugador() {
    }

    
    
    public Jugador(String name) {
        this.name = name;
        this.vidas=5;
    }

    public int getVidas() {
        return vidas;
    }

    public String getName() {
        return name;
    }
    
    
    public void addVidas(int vidas){
        this.vidas+=vidas;
    }
    
    public void quitarVidas(int vidas){
        this.vidas-=vidas;
    }
    
}
