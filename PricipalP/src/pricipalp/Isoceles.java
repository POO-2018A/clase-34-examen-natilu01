/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricipalp;

/**
 *
 * @author ESFOT
 */
public class Isoceles extends ClaseFigura implements Metodos{
    private double lado1;
    private double lado2;

    public Isoceles(String nombre, double lado1, double lado2) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double obtenerArea() {
        double area;
        area=((lado2*(((lado1*lado1)-((lado2*lado2)/4))*0.5))/2);
        return area;
    }

    @Override
    public double obtenerPerimetro() {
        double perimetro;
        perimetro=(2*(lado1+lado2));
        return perimetro;
    }

    @Override
    public double obtenerAltura() {
        double altura;
        altura=(((lado1*lado1)-(lado2*lado2)/4)*0.5);
        return altura;
    }
    
}
