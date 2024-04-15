
package com.mycompany.transporte;


public class Transporte {

    public static void main(String[] args) {
      VehiculoTerrestre vehiculoTerrestre=new VehiculoTerrestre("Mattel","Terreneitor",4);
      
      VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha","Motor");
      
      VehiculoAereo vehiculoAereo=new VehiculoAereo("Avion","BMW", "Turbina");
      
      VehiculoEspacial vehiculoEspacial=new VehiculoEspacial("Cohete","NASA","Propulsion");
     
      
    //Mostrar informarcio de los vehiculos
    System.out.println("Informacion del Vehiculo Terrestre");
    vehiculoTerrestre.mostrarInfo();
    
    System.out.println("Informacion del Vehiculo Acuatico");
    vehiculoAcuatico.mostrarInfo();
    
    
    System.out.println("Informacion del Vehiculo Aereo");
    vehiculoAereo.mostrarInfo();
    
    
    System.out.println("Informacion del Vehiculo Espacial");
    vehiculoEspacial.mostrarInfo();
    }
}
