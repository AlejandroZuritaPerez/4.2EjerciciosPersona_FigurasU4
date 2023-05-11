/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author AMD A6
 */
public class Paralelogramo extends Cuadrilatero{
    private int base;
    private int altura;

    public Paralelogramo(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int base, int altura) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public int CalcularArea(){
        return base * altura;
    
    }
}
