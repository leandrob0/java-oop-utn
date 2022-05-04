package com.company.Clases;

import com.company.Interfaz.AmplificarGuitarraBajo;

public class Bajo extends InsCuerdas implements AmplificarGuitarraBajo {
    private String modelo;

    public Bajo(double precio, String marca, String modelo) {
        super(precio, marca, 4);
        this.modelo = modelo;
    }

    @Override
    public void SonidoAmplificado() {
        System.out.println("Bajo: SONIDO AMPLIFICADO");
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
