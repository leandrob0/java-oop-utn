package com.company.utils;

public class Rectangle {

    private double ancho = 1.0;
    private double alto = 1.0;

    public double calculateArea() {
        return (this.ancho * this.alto);
    }

    public double calculatePerimetro() {
        return ((this.ancho * 2) + (this.alto * 2));
    }

    // GETTERS AND SETTERS FOR THE CLASS ATTRIBUTES.
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
}
