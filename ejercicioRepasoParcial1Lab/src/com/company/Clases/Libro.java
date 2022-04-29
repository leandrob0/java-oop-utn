package com.company.Clases;

import com.company.Enum.Genres;
import com.company.Interfaz.DocumentFunctionality;

import java.time.LocalDate;

public class Libro extends Documento implements DocumentFunctionality {
    protected Genres genero;

    public Libro(String titulo, String codigo, LocalDate publicacion, Genres genero) {
        super(titulo,codigo,publicacion);
        this.genero = genero;
    }

    @Override
    public String alquilar() {
        return "null";
    }

    @Override
    public String devolver() {
        return "null";
    }

    @Override
    public String alquilado() {
        return "null";
    }
}
