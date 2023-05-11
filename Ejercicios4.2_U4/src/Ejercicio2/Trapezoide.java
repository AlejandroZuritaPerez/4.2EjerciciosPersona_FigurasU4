/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author ALEJANDRO ZURITA PÉREZ
 */
public class Trapezoide extends Cuadrilatero{
    private int baseMayor;
    private int baseMenor;
    private int altura;

    public Trapezoide(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4, int baseMayor,int baseMenor, int altura) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public int getBaseMayor() {
        return baseMayor;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public int getAltura() {
        return altura;
    }

    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    @Override
    public int CalcularArea(){
        return ((baseMayor - baseMenor)*altura)/2;
    }
    
}
