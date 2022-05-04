package com.company.Clases;

public abstract class Instrumento {
    protected double precio;
    protected String marca;

    public Instrumento(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }
}
