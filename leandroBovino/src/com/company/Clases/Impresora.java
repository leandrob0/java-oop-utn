package com.company.Clases;

import com.company.Interfaces.Descuentos;

public class Impresora extends ProdInformatico implements Descuentos {
    private double ImpresionesPorMinuto;

    public Impresora(int stock, String nombre, double precio, String fabricante, double impresionesPorMinuto) {
        super(stock, nombre, precio, fabricante);
        ImpresionesPorMinuto = impresionesPorMinuto;
    }

    @Override
    public double aplicarDescuento(int porcentaje) {
        double precioADescontar = (precio*porcentaje)/100;
        return precio - precioADescontar;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "ImpresionesPorMinuto=" + ImpresionesPorMinuto +
                ", fabricante='" + fabricante + '\'' +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
