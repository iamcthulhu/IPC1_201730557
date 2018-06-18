/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.backend;

import java.util.TimerTask;
import proyecto1.ui.Interfaz1;

/**
 *
 * @author gamcas
 */
public  class Cronometro  {
public int segundos=0;
public int minutos=0;
    
 java.util.Timer timer = new java.util.Timer();
 TimerTask task = new TimerTask(){
     
    public void run(){
        segundos++;
        if (segundos==60){
            segundos=0;
            minutos+=1;
        }
    }
};
 
 public void start(){
     timer.scheduleAtFixedRate(task,1000,1000);
 }

}
