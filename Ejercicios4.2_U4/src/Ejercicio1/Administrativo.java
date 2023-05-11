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
public class Administrativo extends Persona{
//    Declarar sus atributos y herede de Persona
//    atributos privados (matrícula, puesto, horario). 
//    Cada atributo con su respectivo método set's y get's.
    private String matricula;
    private String puesto;
    private String horario;

    public Administrativo(String nombre, String domicilio, String curp, int edad, int telefono, String matricula, String puesto, String horario) {
        super(nombre, domicilio, curp, edad, telefono);
        this.matricula = matricula;
        this.puesto = puesto;
        this.horario = horario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public void MostrarDatosAdministrativo(){
        JOptionPane.showMessageDialog(null, "Nombre del Personal Administrativo: " +getNombre() +
                "\nDomicilio del Personal Administrativo: " +getDomicilio() +
                "\nCURP del Personal Administrativo: " +getCurp() +
                "\nEdad del Personal Administrativo: " +getEdad() +
                "\nTelefono del Personal Administrativo: " +getTelefono() +
                "\nMatricula del Personal Administrativo: " +matricula +
                "\nPuesto del Personal Administrativo: " +puesto +
                "\nHorario del Personal Administrativo: " +horario, "DATOS DEL PERSONAL ADMINISTRATIVO", JOptionPane.INFORMATION_MESSAGE);
    

    }
}
