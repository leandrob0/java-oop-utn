package com.company.Clases;

public abstract class ProdInformatico extends Producto{
    protected String fabricante;

    public ProdInformatico(int stock, String nombre, double precio, String fabricante) {
        super(stock, nombre, precio);
        this.fabricante = fabricante;
    }
}
