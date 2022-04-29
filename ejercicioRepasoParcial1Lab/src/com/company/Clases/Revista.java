package com.company.Clases;

import com.company.Interfaz.DocumentFunctionality;

import java.time.LocalDate;

public class Revista extends Documento implements DocumentFunctionality {
    public Revista(String titulo, String codigo, LocalDate publicacion, boolean disponible) {
        super(titulo,codigo,publicacion, disponible);
    }

    @Override
    public String alquilar() {
        if(disponible) {
            this.setDisponible(false);
            return "Revista alquilada";
        }

        return "La revista ya esta alquilada";
    }

    @Override
    public String devolver() {
        if(!disponible) {
            this.setDisponible(true);
            return "Revista devuelta";
        }

        return "La revista no esta alquilada";
    }

    @Override
    public String alquilado() {
        if(!disponible) {
            return "Revista alquilada";
        }

        return "Revista no alquilada";
    }
}
