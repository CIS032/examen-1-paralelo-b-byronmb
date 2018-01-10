/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;


public class ProfesorMedioTiempo extends Profesor{
    public int horasSemanalaes=20;

    public ProfesorMedioTiempo(String cedula, String nombres, String apelllidos, int horasClase, String carrera) {
        super(cedula, nombres, apelllidos, horasClase, carrera);
    }
    

  

  

    public void setHorasSemanalaes(int horasSemanalaes) {
        this.horasSemanalaes = horasSemanalaes;
    }
    
    public int horasComplementarias(int horasClase){
       int hc=horasClase-this.horasSemanalaes;
       return hc;
    }
}
