
package concurrencia.Models;

import javafx.concurrent.Task;

import java.util.Observer;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;



public class CarrosTasks extends Task<Integer>{
    Observer obeserver;
    Semaphore mutex = new Semaphore(1);
    Semaphore entrada = new Semaphore(0);
    Semaphore salida = new Semaphore(0);
    Semaphore vacios = new Semaphore(20);
    Estacionamiento e = new Estacionamiento();
    
    public CarrosTasks(Observer observador){
        this.obeserver =observador;
    }
//peroooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
    //perrooooooooooooooooooooooooooooo
    @Override
    protected Integer call() throws Exception {
       int dormir = 0;
       //Se cra los 100 carros
        for(int i=0; i<100; i++){
            try {                
                Vehiculo hilo = new Vehiculo(e, obeserver, mutex, vacios, salida, entrada);
                Thread auto = new Thread(hilo);
                auto.setDaemon(true);
                auto.start();       
                dormir=((int)(Math.random()*600))+100;
                Thread.sleep(dormir);
            } catch (InterruptedException ex) {
                Logger.getLogger(CarrosTasks.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return null;
    }
    
}
