
package com.mycompany.transporte;

public class VehiculoAereo extends Vehiculo{
  private String tipoMotor; 
  
  public VehiculoAereo(String marca,String modelo,String tipoMotor){   
    super(marca,modelo);
    this.tipoMotor=tipoMotor;
  
}
  
public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Tipo motor"+tipoMotor);
}
}

