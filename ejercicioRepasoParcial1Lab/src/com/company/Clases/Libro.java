package com.company.Clases;

import com.company.Enum.Genres;
import com.company.Interfaz.DocumentFunctionality;

import java.time.LocalDate;

public class Libro extends Documento implements DocumentFunctionality {
    protected Genres genero;

    public Libro(String titulo, String codigo, LocalDate publicacion, Genres genero, boolean disponible) {
        super(titulo,codigo,publicacion, disponible);
        this.genero = genero;
    }

    @Override
    public String alquilar() {
        if(disponible) {
            this.setDisponible(false);
            return "Libro alquilado";
        }

        return "El libro ya esta alquilado";
    }

    @Override
    public String devolver() {
        if(!disponible) {
            this.setDisponible(true);
            return "Libro devuelto";
        }

        return "El libro no esta alquilado";
    }

    @Override
    public String alquilado() {
        if(!disponible) {
            return "Libro alquilado";
        }

        return "Libro no alquilado";
    }
}
