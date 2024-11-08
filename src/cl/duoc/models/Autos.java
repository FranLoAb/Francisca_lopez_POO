/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Autos extends Vehiculo {
    
    private int cantidadPasajeros;
    private boolean autoPilot;
    private Iterable<Autos> Vehiculos;

    public Autos(int cantidadPasajeros, boolean autoPilot, int codigoAlfanumerico) {
        super(codigoAlfanumerico);
        this.cantidadPasajeros = cantidadPasajeros;
        this.autoPilot = autoPilot;
    }

    public Autos(int cantidadPasajeros, boolean autoPilot, int codigoAlfanumerico, boolean servicioMantenimiento) {
        super(codigoAlfanumerico, servicioMantenimiento);
        this.cantidadPasajeros = cantidadPasajeros;
        this.autoPilot = autoPilot;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }

    @Override
    public String toString() {
        return "Autos{" + "cantidadPasajeros=" + cantidadPasajeros + ", autoPilot=" + autoPilot + '}';
    }

    public void mostrarVehiculo(){
    for (Autos i : Vehiculos){
        if( i instanceof Autos){
            Autos a = (Autos)i;
        System.out.println("Pasajeros: " + i.getCantidadPasajeros()
                + "Codigo:" + i.getCodigoAlfanumerico()
                + "Autopilot:" + i.isAutoPilot());
    }
    }
}

public interface IReglasTeslaFleet{
 float incrementoDiez();
}
}
