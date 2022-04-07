package com.company.ejercicio1;

public class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
        super();
        this.altura = 1.0;
    }

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    @Override
    public double calculateArea() {
        double area = (2 * Math.PI) * (getRadio() * altura) + (2 * (Math.PI * (getRadio() * getRadio())));
        return area;
    }

    public double calculateVolumen() {
        double volumen = Math.PI * (altura * (getRadio() * getRadio()));
        return volumen;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
