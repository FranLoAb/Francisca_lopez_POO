/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duoc.models;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class SistemaDeRegistroVehiculosE {

    private static Iterable<Autos> Vehiculo;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner (System.in);
        int opcion;
        do{
            System.out.println("**** M E N U ****");
            System.out.println("*****************");
            System.out.println("1. Autos ********");
            System.out.println("2. Motocicletas *");
            System.out.println("3. Bicicletas ***");
            System.out.println("4. Salir ***");   
            System.out.println("Seleccione una opcion.");
             
            opcion = scanner.nextInt();
            switch(opcion){
                
                case 1:
                  break;
                case 2:
                  break;
                case 3:
                   break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida, vuelva a intentar.");
                    return;
                
            }
            
        }while(opcion != 4);
    }
    
}
