
package concurrencia.Models;

import concurrencia.Models.Vehiculo;

import java.util.ArrayList;


public class Estacionamiento {
    ArrayList<Vehiculo> caja;
    int[] cajas;
    int eEntrada=0;
    int eSalida=0;
    boolean autodentro = false;
    int indexAutos = 0;
    
    public Estacionamiento(){
        this.caja = new ArrayList<>();
        cajas = new int[20];
    }
    

    
}
