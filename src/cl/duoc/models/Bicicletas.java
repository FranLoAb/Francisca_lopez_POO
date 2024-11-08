/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Bicicletas extends Vehiculo {
    
   private String tipoFrenos;
   private float capacidadBateriaEnKilometros;
    private Iterable<Bicicletas> Vehiculos;

   

    public Bicicletas(String tipoFrenos, float capacidadBateriaEnKilometros, int codigoAlfanumerico) {
        super(codigoAlfanumerico);
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateriaEnKilometros = capacidadBateriaEnKilometros;
    }

    public Bicicletas(String tipoFrenos, float capacidadBateriaEnKilometros, int codigoAlfanumerico, boolean servicioMantenimiento) {
        super(codigoAlfanumerico, servicioMantenimiento);
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateriaEnKilometros = capacidadBateriaEnKilometros;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public float getCapacidadBateriaEnKilometros() {
        return capacidadBateriaEnKilometros;
    }

    public void setCapacidadBateriaEnKilometros(float capacidadBateriaEnKilometros) {
        this.capacidadBateriaEnKilometros = capacidadBateriaEnKilometros;
    }

    @Override
    public String toString() {
        return "Bicicletas{" + "tipoFrenos=" + tipoFrenos + ", capacidadBateriaEnKilometros=" + capacidadBateriaEnKilometros + '}';
    }

    

    public void mostrarVehiculo(){
    for (Bicicletas i : Vehiculos){
        if( i instanceof Bicicletas){
            Bicicletas b = (Bicicletas)i;
        System.out.println("Tipo de frenos: " + i.getTipoFrenos()
                + "Codigo:" + i.getCodigoAlfanumerico()
                + "Autopilot:" + i.getCapacidadBateriaEnKilometros());
    }
    }
    

    
    
    

    }
    public interface IReglasTeslaFleet{

       /**
        *
        * @return
        */
       float descuentoCinco();
   }
}