package com.company.ejercicio1;

public abstract class Circulo {
    protected double radio;
    protected String color = "Rojo";

    public Circulo() {
        this.radio = 1.0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calculateArea() {
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo= {Radio: " + radio + ", Color: " + color + "}";
    }
}
