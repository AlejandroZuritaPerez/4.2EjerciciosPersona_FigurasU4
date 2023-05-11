/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Principal {
    
    public static void main(String[] args) {
        
    Cuadrilatero cuadri1 = new Cuadrilatero(0, 0, 0, 0, 0, 0, 0, 0);
    Trapezoide trape1 = new Trapezoide(0, 0, 0, 0, 0, 0, 0, 0, 6, 4, 3);
    Paralelogramo parale1 = new Paralelogramo(0, 0, 0, 0, 0, 0, 0, 0, 10, 5);
    Rectangulo rect1 = new Rectangulo(0, 0, 0, 0, 0, 0, 0, 0, 8, 6);
    Cuadrado cuadra = new Cuadrado(0, 0, 0, 0, 0, 0, 0, 0, 0, 4);
    
        System.out.println("El area del Trapecio es: " + trape1.CalcularArea());
        System.out.println("El area del Paralelogramo es: " + parale1.CalcularArea());
        System.out.println("El area del Rectangulo es: " + rect1.CalcularArea());
        System.out.println("El area del Cuadrado es: " + cuadra.CalcularArea());
        
    }
    
    
    
    
}
