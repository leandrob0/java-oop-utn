package com.company.Clases;

public abstract class InsCuerdas extends Instrumento{
    protected int cuerdas;

    public InsCuerdas(double precio, String marca, int cuerdas) {
        super(precio, marca);
        this.cuerdas = cuerdas;
    }
}
