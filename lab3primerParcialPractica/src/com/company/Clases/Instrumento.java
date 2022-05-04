package com.company.Clases;

public abstract class Instrumento {
    protected double precio;
    protected String marca;

    public Instrumento(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
