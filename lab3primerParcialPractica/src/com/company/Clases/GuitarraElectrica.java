package com.company.Clases;

import com.company.Interfaz.AmplificarGuitarraBajo;

public class GuitarraElectrica extends InsCuerdas implements AmplificarGuitarraBajo {
    private String modelo;

    public GuitarraElectrica(double precio, String marca, String modelo) {
        super(precio, marca, 6);
        this.modelo = modelo;
    }

    @Override
    public void SonidoAmplificado() {
        System.out.println("GuitarraElectrica: SONIDO AMPLIFICADO");
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
