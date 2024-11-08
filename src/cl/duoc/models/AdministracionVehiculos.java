/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class AdministracionVehiculos extends Vehiculo {
    List <Vehiculo> administracionVehiculos = new ArrayList<>();

   // public AdministracionVehiculos() {
   // }

    public AdministracionVehiculos(int codigoAlfanumerico, boolean servicioMantenimiento) {
        super(codigoAlfanumerico, servicioMantenimiento);
    }

    public AdministracionVehiculos(int codigoAlfanumerico) {
        super(codigoAlfanumerico);
    }

    public List<Vehiculo> getAdministracionVehiculos() {
        return administracionVehiculos;
    }

    public void setAdministracionVehiculos(List<Vehiculo> administracionVehiculos) {
        this.administracionVehiculos = administracionVehiculos;
    }

    @Override
    public String toString() {
        return "AdministracionVehiculos{" + "administracionVehiculos=" + administracionVehiculos + '}';
    }
    
    public void listarVehiculos(){
        for(Vehiculo i: administracionVehiculos){
            System.out.println("Codigo Vehiculo:" + i.getCodigoAlfanumerico());
        }
    }
}
