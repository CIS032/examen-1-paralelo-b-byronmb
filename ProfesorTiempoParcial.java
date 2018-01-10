/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;


public class ProfesorTiempoParcial extends Profesor{
    private int horasSemanales;

    public ProfesorTiempoParcial(int horasSemanales, String cedula, String nombres, String apelllidos, int horasClase, String carrera) {
        super(cedula, nombres, apelllidos, horasClase, carrera);
        this.horasSemanales = horasSemanales;
    }

    
    public int horasComplementarias(int horas){
       int hc=horas-this.horasSemanales;
       return hc;
    }
}
