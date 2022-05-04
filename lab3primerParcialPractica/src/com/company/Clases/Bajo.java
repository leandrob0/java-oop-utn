package com.company.Clases;

public class Bajo extends InsCuerdas{
    private String modelo;

    public Bajo(double precio, String marca, String modelo) {
        super(precio, marca, 4);
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Bajo{" +
                "modelo='" + modelo + '\'' +
                ", cuerdas=" + cuerdas +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
