package com.company.Clases;

import com.company.Interfaz.DocumentFunctionality;

import java.time.LocalDate;

public class Diario extends Documento implements DocumentFunctionality {
    public Diario(String titulo, String codigo, LocalDate publicacion, boolean disponible) {
        super(titulo, codigo, publicacion, disponible);
    }

    @Override
    public String alquilar() {
        if(disponible) {
            this.setDisponible(false);
            return "Diario tomado";
        }

        return "El diario esta siendo leido";
    }

    @Override
    public String devolver() {
        if(!disponible) {
            this.setDisponible(true);
            return "Diario devuelto";
        }

        return "El diario no esta siendo leido";
    }

    @Override
    public String alquilado() {
        if(!disponible) {
            return "Diario siendo leido";
        }

        return "Diario disponible";
    }
}
