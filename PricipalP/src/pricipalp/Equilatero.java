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
public class Equilatero extends ClaseFigura implements Metodos{
    private double lado1; 

    public Equilatero( String nombre,double lado1) {
        super(nombre);
        this.lado1 = lado1;
    }

    @Override
    public double obtenerArea() {
        double area;
        area=(((1.73*lado1)/2)*(lado1*lado1));
        return area;
    }

    @Override
    public double obtenerPerimetro() {
        double perimetro;
        perimetro=(3*lado1);
        return perimetro;
    }

    @Override
    public double obtenerAltura() {
        double altura;
        altura=((1.73*lado1)/2);
        return altura;
    }
    
}
