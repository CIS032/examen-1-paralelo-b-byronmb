/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
            ListaProfesores paint=new ListaProfesores();
       int opcion=0;
       while (opcion<4) {
           opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese una opcion...\n1.-Profesor tiempo completo\n2.-Profesor Medio tiempo\n3.-Profesor tiempo parcial\n4.-Salir"));
           switch (opcion) {
               case 1:
                   boolean a=true;
                    String cedula=JOptionPane.showInputDialog(null,"Ingrese cedula");
                    String nombres=JOptionPane.showInputDialog(null,"Ingrese nombre");
                    String apelllidos=JOptionPane.showInputDialog(null,"Ingrese apellido");
                    int horasClase=0;
                    
                    while (a==true) {
                       horasClase=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese horas de clase"));
                        if (horasClase<3 ||(horasClase>16)) {
                            JOptionPane.showInputDialog(null,"Ingrese dentro del rango de (3-16)");
                        }else{
                           a=false;           
                        }
                    }
                    String carrera=JOptionPane.showInputDialog(null,"Ingrese carrera");
                    ProfesorTiempoCompleto ptc=new ProfesorTiempoCompleto(cedula, nombres, apelllidos, horasClase, carrera);
                    ptc.horasComplementarias(horasClase);
                    paint.agregar(ptc);
                    paint.grabar();
                   break;
              case 2:
                     String cedula2=JOptionPane.showInputDialog(null,"Ingrese cedula");
                    String nombres2=JOptionPane.showInputDialog(null,"Ingrese nombre");
                    String apellidos2=JOptionPane.showInputDialog(null,"Ingrese apellido");
                    int horasClase2=10;
                    String carrera2=JOptionPane.showInputDialog(null,"Ingrese carrera");
                    ProfesorMedioTiempo pmt=new ProfesorMedioTiempo(cedula2, nombres2, apellidos2, horasClase2, carrera2);
                    pmt.horasComplementarias(horasClase2);
                    paint.agregar(pmt);
                    paint.grabar();
                   break;
              case 3:
                    String cedula3=JOptionPane.showInputDialog(null,"Ingrese cedula");
                    String nombres3=JOptionPane.showInputDialog(null,"Ingrese nombre");
                    String apelllidos3=JOptionPane.showInputDialog(null,"Ingrese apellido");
                    int horasClase3=0;
                    while (horasClase3<2 || horasClase3>9) {
                              horasClase3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese horas de clase","Entre 2 y 9"));
                     }
                     int horasSemanales=0;
                     
                     while (horasSemanales<1 || horasSemanales>20) {
                         horasSemanales=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese horas semanales","Entre 2 y 20"));
                     }
                    String carrera3=JOptionPane.showInputDialog(null,"Ingrese carrera");
                    ProfesorTiempoParcial ptp=new ProfesorTiempoParcial(horasSemanales, cedula3, nombres3, apelllidos3, horasClase3, carrera3);
                    ptp.horasComplementarias(horasClase3);
                    paint.agregar(ptp);
                    paint.grabar();
                   break;
              case 4:
                   
                   break;
               default:
                   throw new AssertionError();
           }
        
    }
    }

}
