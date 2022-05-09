package com.company.Clases;

public class Escritorio extends Producto{
    private double alto;
    private double ancho;

    public Escritorio(int stock, String nombre, double precio, double alto, double ancho) {
        super(stock, nombre, precio);
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Escritorio{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
