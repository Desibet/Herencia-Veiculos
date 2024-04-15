
package com.mycompany.transporte;

public class VehiculoAcuatico extends Vehiculo{
    private String tipoPropulsion;

public VehiculoAcuatico(String marca,String modelo,String tipoPropulsion){   
    super(marca,modelo);
    this.tipoPropulsion=tipoPropulsion;
}
 
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Tipo de Propulsion"+tipoPropulsion);
}
}
