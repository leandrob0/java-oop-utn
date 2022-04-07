package com.company.ejercicio1;

class Circulo {
    private double radio;
    private String color;

    public Circulo() {
        this.radio = 1.0;
        this.color = "Rojo";
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double calculateArea() {
        double area = Math.PI * (radio * radio);
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
        return "Radio: " + radio + ", Color: " + color;
    }
}
