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
public class Escaleno extends ClaseFigura implements Metodos {
    private double lado1;
    private double lado2;
    private double lado3;

    public Escaleno(String nombre, double lado1, double lado2, double lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double obtenerArea() {
       double area;
       double semiPer;
       semiPer=((lado1+lado2+lado3)/2);
       area=(((semiPer)*(semiPer-lado1)*(semiPer-lado2)*(semiPer-lado3))*0.5);
       return area;
    }

    @Override
    public double obtenerPerimetro() {
        double Perimetro;
        Perimetro=(lado1+lado2+lado3);
        return Perimetro;
    }

    @Override
    public double obtenerAltura() {
        double altura;
        double semiPer;
        semiPer=((lado1+lado2+lado3)/2);
        altura=((2/lado1)*((semiPer)*(semiPer-lado1)*(semiPer-lado2)*(semiPer-lado3)*0.5));
        return altura;
    }
    
    
    
}
