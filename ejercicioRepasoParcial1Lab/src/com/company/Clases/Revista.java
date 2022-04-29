package com.company.Clases;

import com.company.Interfaz.DocumentFunctionality;

import java.time.LocalDate;

public class Revista extends Documento implements DocumentFunctionality {
    public Revista(String titulo, String codigo, LocalDate publicacion) {
        super(titulo,codigo,publicacion);
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
