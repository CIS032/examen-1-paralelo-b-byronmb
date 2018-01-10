/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;


public abstract class Profesor {
    private  String cedula;
    private  String nombres;
    private  String apelllidos;
    private  int horasClase;
   private  String carrera;

    public Profesor(String cedula, String nombres, String apelllidos, int horasClase, String carrera) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apelllidos = apelllidos;
        this.horasClase = horasClase;
        this.carrera = carrera;
    }



   
   
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApelllidos() {
        return apelllidos;
    }

    public void setApelllidos(String apelllidos) {
        this.apelllidos = apelllidos;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    public abstract int horasComplementarias(int horas);
    
}
