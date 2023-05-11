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
public class Principal {
    
    public static void main(String[] args) {

    String nombre, domicilio, curp, especialidad, modalidad, matricula, puesto, horario, academia;
    int edad, telefono, nControl;
    float promedio;
    
    nombre = JOptionPane.showInputDialog(null, "Ingresa el Nombre del Alumno: ", "INFORMACION DEL ALUMNO", 3);
    domicilio = JOptionPane.showInputDialog(null, "Ingresa la Direccion del Alumno: ", "INFORMACION DEL ALUMNO", 3);
    curp = JOptionPane.showInputDialog(null, "Ingresa la CURP del Alumno: ", "INFORMACION DEL ALUMNO", 3);
    edad = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa la Edad del Alumno: ", "INFORMACION DEL ALUMNO", 3));
    telefono = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa el numero de Telefono del Alumno: ", "INFORMACION DEL ALUMNO", 3));
    nControl = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa el numero de Control del Alumno: ", "INFORMACION DEL ALUMNO", 3));
    especialidad = JOptionPane.showInputDialog(null, "Ingresa la Especialidad del Alumno: ", "INFORMACION DEL ALUMNO", 3);
    promedio = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa el Promedio del Alumno: ", "INFORMACION DEL ALUMNO", 3));
    modalidad = JOptionPane.showInputDialog(null, "Ingresa la Modalidad del Alumno: ", "INFORMACION DEL ALUMNO", 3);
    
    Alumno alum1 = new Alumno(nombre, domicilio, curp, edad, telefono, nControl, especialidad, promedio, modalidad);
    alum1.MostrarDatosAlumno();
    
    nombre = JOptionPane.showInputDialog(null, "Ingresa el Nombre del Personal Administrativo: ", "INFORMACION DEL PERSONAL ADMINISTRATIVO", 3);
    domicilio = JOptionPane.showInputDialog(null, "Ingresa la Direccion del Personal Administrativo: ", "INFORMACION DEL PERSONAL ADMINISTRATIVO", 3);
    curp = JOptionPane.showInputDialog(null, "Ingresa la CURP del Personal Administrativo: ", "INFORMACION DEL PERSONAL ADMINISTRATIVO", 3);
    edad = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa la Edad del Personal Administrativo: ", "INFORMACION DEL PERSONAL ADMINISTRATIVO", 3));
    telefono = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa el numero de Telefono del Personal Administrativo: ", "INFORMACION DEL PERSONAL ADMINISTRATIVO", 3));
    nControl = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa el numero de Control del Personal Administrativo: ", "INFORMACION DEL PERSONAL ADMINISTRATIVO", 3));
    matricula = JOptionPane.showInputDialog(null, "Ingresa la Matricula del Personal Administrativo: ", "INFORMACION DEL PERSONAL ADMINISTRATIVO", 3);
    puesto = JOptionPane.showInputDialog(null, "Ingresa el Promedio del Personal Administrativo: ", "INFORMACION DEL PERSONAL ADMINISTRATIVO", 3);
    horario = JOptionPane.showInputDialog(null, "Ingresa la Modalidad del Personal Administrativo: ", "INFORMACION DEL PERSONAL ADMINISTRATIVO", 3);
    
    Administrativo adms1 = new Administrativo(nombre, domicilio, curp, edad, telefono, matricula, puesto, horario);
    adms1.MostrarDatosAdministrativo();
    
    nombre = JOptionPane.showInputDialog(null, "Ingresa el Nombre del Personal Docente: ", "INFORMACION DEL PERSONAL DOCENTE", 3);
    domicilio = JOptionPane.showInputDialog(null, "Ingresa la Direccion del Personal Docente: ", "INFORMACION DEL PERSONAL DOCENTE", 3);
    curp = JOptionPane.showInputDialog(null, "Ingresa la CURP del Personal Docente: ", "INFORMACION DEL PERSONAL DOCENTE", 3);
    edad = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa la Edad del Personal Docente: ", "INFORMACION DEL PERSONAL DOCENTE", 3));
    telefono = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa el numero de Telefono del Personal Docente: ", "INFORMACION DEL PERSONAL DOCENTE", 3));
    nControl = Integer.parseInt (JOptionPane.showInputDialog(null, "Ingresa el numero de Control del Personal Docente: ", "INFORMACION DEL PERSONAL DOCENTE", 3));
    matricula = JOptionPane.showInputDialog(null, "Ingresa la Matricula del Personal Docente: ", "INFORMACION DEL PERSONAL DOCENTE", 3);
    academia = JOptionPane.showInputDialog(null, "Ingresa la Materia que Imparte el Personal Docente: ", "INFORMACION DEL PERSONAL DOCENTE", 3);
    horario = JOptionPane.showInputDialog(null, "Ingresa la Modalidad del Personal Docente: ", "INFORMACION DEL PERSONAL DOCENTE", 3);
    
    Docente doc1 = new Docente(nombre, domicilio, curp, edad, telefono, matricula, academia, horario);
    doc1.MostrarDatosDocente();
    
    
    }
}
