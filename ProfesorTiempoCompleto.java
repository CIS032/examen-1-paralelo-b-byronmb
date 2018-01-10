/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;


public class ProfesorTiempoCompleto extends Profesor {
    public int horasSemanales=40;

    public ProfesorTiempoCompleto(String cedula, String nombres, String apelllidos, int horasClase, String carrera) {
        super(cedula, nombres, apelllidos, horasClase, carrera);
    }


    public int horasComplementarias(int horasClase){
      return horasClase-this.horasSemanales;
    }


    

    
}
