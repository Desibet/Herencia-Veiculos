
package com.mycompany.transporte;

public class VehiculoEspacial extends Vehiculo{
    private String tipoPropulsionE;
        
    public VehiculoEspacial(String marca,String modelo,String tipoPropulsionE ){   
       super(marca,modelo);
       this.tipoPropulsionE=tipoPropulsionE;
}

public void mostrarInfo(){
    super.mostrarInfo();
    System.out.println("Tipo de Propulsion"+tipoPropulsionE);
}
}