/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Alumno extends Persona{
//    Declarar sus atributos y herede de Persona 
//    atributos privados (ncontrol, especialidad, promedio, modalidad). 
//    Cada atributo con su respectivo método set's y get's.
    private int nControl;
    private String especialidad;
    private float promedio;
    private String modalidad;

    public Alumno(String nombre, String domicilio, String curp, int edad, int telefono, int nControl, String especialidad, float promedio, String modalidad) {
        super(nombre, domicilio, curp, edad, telefono);
        this.nControl = nControl;
        this.especialidad = especialidad;
        this.promedio = promedio;
        this.modalidad = modalidad;
        
    }

    public int getnControl() {
        return nControl;
    }

    public void setnControl(int nControl) {
        this.nControl = nControl;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
    
    public void MostrarDatosAlumno(){
        JOptionPane.showMessageDialog(null, "Nombre del Alumno: " +getNombre() +
                "\nDomicilio del Alumno: " +getDomicilio() +
                "\nCURP del Alumno: " +getCurp() +
                "\nEdad del Alumno: " +getEdad() +
                "\nTelefono del Alumno: " +getTelefono() +
                "\nNum. de Control del Alumno: " +nControl +
                "\nEspecialidad del Alumno: " +especialidad +
                "\nPromedio del Alumno: " +promedio +
                "\nModalidad del Alumno: " +modalidad, "DATOS DEL ALUMNO", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
}
