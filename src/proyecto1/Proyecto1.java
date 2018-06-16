/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import proyecto1.backend.Auxiliar;
import proyecto1.ui.Interfaz;

/**
 *
 * @author gamcas
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        interfaz.setVisible(true);
        
        System.out.println(Auxiliar.numMovimientos());
    }
    
    
}
