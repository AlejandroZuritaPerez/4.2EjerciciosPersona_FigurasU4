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
public class Docente extends Persona{
//    Declarar sus atributos y herede de Persona
//    atributos privados (matrícula, academia, horario). 
//    Cada atributo con su respectivo método set's y get's.
    private String matricula;
    private String academia;
    private String horario;

    public Docente(String nombre, String domicilio, String curp, int edad, int telefono, String matricula, String academia, String horario) {
        super(nombre, domicilio, curp, edad, telefono);
        this.matricula = matricula;
        this.academia = academia;
        this.horario = horario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAcademia() {
        return academia;
    }

    public void setAcademia(String academia) {
        this.academia = academia;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void MostrarDatosDocente(){
        JOptionPane.showMessageDialog(null, "Nombre del Personal Docente: " +getNombre() +
                "\nDomicilio del Personal Docente: " +getDomicilio() +
                "\nCURP del Personal Docente: " +getCurp() +
                "\nEdad del Personal Docente: " +getEdad() +
                "\nTelefono del Personal Docente: " +getTelefono() +
                "\nMatricula del Personal Docente: " +matricula +
                "\nMateria Impartida por el Personal Docente: " +academia +
                "\nHorario del Personal Docente: " +horario, "DATOS DEL PERSONAL DOCENTE", JOptionPane.INFORMATION_MESSAGE);
    

    }
    
    
}
