package com.company.Clases;

// Esta clase y ProdInformatico son abstractas porque no queremos instanciarlas, y por eso tambien les puse protected, ya que van a ser accedidas mas facilmente desde los hijos.
// Si quiero acceder a una propiedad en especifico desde el main por ejemplo, simplemente agrego el getter, o setter si necesito cambiarlo.
// Como no los necesito, no los agregue.
public abstract class Producto {
    protected int stock;
    protected String nombre;
    protected double precio;

    public Producto(int stock, String nombre, double precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void aumentarPrecio(double porcentaje) {
        double nuevoPrecio = precio + (precio * (porcentaje/100));
        this.precio = nuevoPrecio;
    }
}
