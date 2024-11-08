/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo implements IReglasTeslaFleet {

   
   private final int codigoAlfanumerico;
   private boolean servicioMantenimiento;
   private int costoAlquiler;
   // public Vehiculo() {
    //}
    

   
   
    public Vehiculo(int codigoAlfanumerico, boolean servicioMantenimiento) {
        this.codigoAlfanumerico = codigoAlfanumerico;
        this.servicioMantenimiento = servicioMantenimiento;
    }

    public Vehiculo(int codigoAlfanumerico) {
        this.codigoAlfanumerico = codigoAlfanumerico;
    }

    public boolean isServicioMantenimiento() {
        return servicioMantenimiento;
    }

    public int getCodigoAlfanumerico() {
        return codigoAlfanumerico;
    }

    //public void setCodigoAlfanumerico(int codigoAlfanumerico) {
     //   this.codigoAlfanumerico = codigoAlfanumerico;
    // }

   @Override
   public abstract String toString();
 
   public float incrementoDiez(){
       int costoALquiler = 0;
       return this.costoAlquiler = costoAlquiler +costoALquiler*10/100;
   }

      public float incrementoOcho(){
       int costoALquiler = 0;
       return this.costoAlquiler = costoAlquiler +costoALquiler*8/100;
   }

        public float descuentoCinco(){ 
       return this.costoAlquiler = costoAlquiler *5/100;
   }

  
}
