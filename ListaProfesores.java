/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;


public class ListaProfesores {
    ArrayList<Profesor>profesores=new ArrayList<>();

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }
    
    public void agregar(Profesor p){
       profesores.add(p);
    }
    public void horasComplementarias(int horas){
        for (Profesor profesore : profesores) {
            profesore.horasComplementarias(horas);
        }
    
    }
    
    public void grabar(){
      File archivo=new File ("Profesores.csv");
        try {
            FileWriter fw=new FileWriter(archivo);
            
            for (Profesor profesore : profesores) {
                if (profesore instanceof ProfesorTiempoCompleto) {
                    ProfesorTiempoCompleto ptc=(ProfesorTiempoCompleto)profesore;
                    fw.write(ptc.getCedula()+";"+ptc.getNombres()+";"+ptc.getApelllidos()+";"+ptc.getCarrera()+";"+ptc.getHorasClase()+";"+ptc.horasComplementarias(ptc.getHorasClase())+"\r\n");
                }
                if (profesore instanceof ProfesorMedioTiempo) {
                    ProfesorMedioTiempo pmt=(ProfesorMedioTiempo)profesore;
                    fw.write(pmt.getCedula()+";"+pmt.getNombres()+";"+pmt.getApelllidos()+";"+pmt.getCarrera()+";"+pmt.getHorasClase()+";"+pmt.horasComplementarias(pmt.getHorasClase())+"\r\n");
                }
                if (profesore instanceof ProfesorTiempoParcial) {
                    ProfesorTiempoParcial ptp=(ProfesorTiempoParcial)profesore;
                    fw.write(ptp.getCedula()+";"+ptp.getNombres()+";"+ptp.getApelllidos()+";"+ptp.getCarrera()+";"+ptp.getHorasClase()+";"+ptp.horasComplementarias(ptp.getHorasClase())+"\r\n");
                }
                
            }
            fw.close();
        } catch (Exception e) {
        }
    }
}
