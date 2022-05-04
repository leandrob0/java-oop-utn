package com.company.Clases;

import com.company.Enums.TipoMadera;

public class GuitarraAcustica extends InsCuerdas{
    private TipoMadera madera;

    public GuitarraAcustica(double precio, String marca, TipoMadera madera) {
        super(precio, marca, 6);
        this.madera = madera;
    }

    @Override
    public String toString() {
        return "GuitarraAcustica{" +
                "madera=" + madera +
                ", cuerdas=" + cuerdas +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
