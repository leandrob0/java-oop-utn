package com.company.Clases;

public class Notebook extends ProdInformatico{
    private int memoria;

    public Notebook(int stock, String nombre, double precio, String fabricante, int memoria) {
        super(stock, nombre, precio, fabricante);
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "memoria=" + memoria +
                ", fabricante='" + fabricante + '\'' +
                ", stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
