package com.company.ejercicio3;

public abstract class Figura {
    protected String color;

    public Figura() {
    }

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura= Color: " + color;
    }
}
