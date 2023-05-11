/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Persona {
//    Declarar sus atributos de la clase Persona
//    nombre, domicilio, curp, edad y teléfono. Cada atributo con su respectivo método set's y get's
    private String nombre;
    private String domicilio;
    private String curp;
    private int edad;
    private int telefono;

    public Persona(String nombre, String domicilio, String curp, int edad, int telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.curp = curp;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
}
