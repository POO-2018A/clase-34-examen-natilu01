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
public class Rectangulo extends ClaseFigura implements Metodos{
    private double lado1;
    private double lado2;

    public Rectangulo( String nombre, double lado1, double lado2) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
   

    @Override
    public double obtenerArea() {
        double lado3;
        double area;
        lado3=(((lado1*lado1)+(lado2*lado2))*0.5);
        area=((lado1*lado2)/2);
        return area;
    }

    @Override
    public double obtenerPerimetro() {
        double lado3;
        double perimetro;
        lado3=(((lado1*lado1)+(lado2*lado2))*0.5);
        perimetro=lado1+lado2+lado3;
        return perimetro;
    }

    @Override
    public double obtenerAltura() {
        double lado3;
        double altura;
        lado3=(((lado1*lado1)+(lado2*lado2))*0.5);
        altura=((lado1*lado2)/lado3);
        return altura;
    }
    
}
