
package com.mycompany.transporte;

public class VehiculoTerrestre  extends Vehiculo{
  private int numRuedas;  
  
  public VehiculoTerrestre(String marca,String modelo,int numRuedas){
    super(marca,modelo);
    this.numRuedas= numRuedas;     
  }
  
  public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Numero de ruesdas"+numRuedas);
  }
}
