package com.company.ejercicio3;

import java.util.Random;

public class Circulo extends Figura {
    protected double radio;

    public Circulo() {
        super();
        this.radio = new Random().nextDouble(50);
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = (Math.PI * Math.pow(radio,2));
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (2 * Math.PI * radio);
        return perimetro;
    }

    @Override
    public String toString() {
        String col = (color == null) ? "No tiene" : color;
        return "Circulo{" +
                "radio=" + String.format("%.2f",radio) +
                ", color='" + col + '\'' +
                '}';
    }
}
