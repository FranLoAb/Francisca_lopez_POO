/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Motocicletas extends Vehiculo {
    
    private int capacidadBateria;
    private boolean asistenciaModoEco;
    private Iterable<Motocicletas> Vehiculos;

  
    public Motocicletas(int capacidadBateria, boolean asistenciaModoEco, int codigoAlfanumerico) {
        super(codigoAlfanumerico);
        this.capacidadBateria = capacidadBateria;
        this.asistenciaModoEco = asistenciaModoEco;
    }

    public Motocicletas(int capacidadBateria, boolean asistenciaModoEco, int codigoAlfanumerico, boolean servicioMantenimiento) {
        super(codigoAlfanumerico, servicioMantenimiento);
        this.capacidadBateria = capacidadBateria;
        this.asistenciaModoEco = asistenciaModoEco;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isAsistenciaModoEco() {
        return asistenciaModoEco;
    }

    public void setAsistenciaModoEco(boolean asistenciaModoEco) {
        this.asistenciaModoEco = asistenciaModoEco;
    }

    @Override
    public String toString() {
        return "Motocicletas{" + "capacidadBateria=" + capacidadBateria + ", asistenciaModoEco=" + asistenciaModoEco + '}';
    }

    
   public void mostrarVehiculo(){
    for (Motocicletas i : Vehiculos){
       if( i instanceof Motocicletas){
        Motocicletas m = (Motocicletas)i;
         System.out.println("Capacidad de bateria: " + i.getCapacidadBateria()
                + "Codigo:" + i.getCodigoAlfanumerico()
                + "Asistencia:" + i.isAsistenciaModoEco());
    }
    }
   }
   
    public interface IReglasTeslaFleet{
    float incrementoOcho();
}
}
