package com.company.ejercicio3;

import java.util.Random;

public class Rectangulo extends Figura {
    protected double base;
    protected double altura;

    public Rectangulo() {
        super();
        this.base = new Random().nextDouble(1000);
        this.altura = new Random().nextDouble(1000);
    }

    public Rectangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (2*base) + (2*altura);
        return perimetro;
    }

    @Override
    public String toString() {
        String col = (color == null) ? color : "No tiene";
        return "Rectangulo{" +
                ", color=" + col +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
