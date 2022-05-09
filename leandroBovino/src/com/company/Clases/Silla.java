package com.company.Clases;

import com.company.Interfaces.Descuentos;

public class Silla extends Producto implements Descuentos {
    // La cantidad de ruedas es irrelevante, asi que solo es un boolean.
    private boolean tieneRuedas;

    public Silla(int stock, String nombre, double precio, boolean tieneRuedas) {
        super(stock, nombre, precio);
        this.tieneRuedas = tieneRuedas;
    }

    @Override
    public double aplicarDescuento(int porcentaje) {
        double precioADescontar = (precio*porcentaje)/100;
        return precio - precioADescontar;
    }

    @Override
    public String toString() {
        return "Silla{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tieneRuedas=" + (tieneRuedas ? "si" : "no") +
                '}';
    }
}
