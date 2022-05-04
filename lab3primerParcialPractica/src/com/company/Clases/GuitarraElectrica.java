package com.company.Clases;

public class GuitarraElectrica extends InsCuerdas{
    private String modelo;

    public GuitarraElectrica(double precio, String marca, String modelo) {
        super(precio, marca, 6);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "GuitarraElectrica{" +
                "modelo='" + modelo + '\'' +
                ", cuerdas=" + cuerdas +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
