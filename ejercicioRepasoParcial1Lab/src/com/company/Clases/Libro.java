package com.company.Clases;

import com.company.Enum.Genres;
import com.company.Interfaz.DocumentFunctionality;

import java.time.LocalDate;

public class Libro extends Documento implements DocumentFunctionality {
    protected String tipo;
    protected Genres genero;

    public Libro(String titulo, String codigo, LocalDate publicacion, String tipo, Genres genero) {
        super(titulo,codigo,publicacion);
        this.tipo = tipo;
        this.genero = genero;
        super.agregarDisponible(this);
    }

    @Override
    public String alquilar(Documento d) {

        try {
            if(super.verSiEstaAlquilado(d)) {
                return "El libro ya esta alquilado";
            }
        } catch (NullPointerException e) {
            return e.getMessage();
        }

        super.agregarNoDisponible(d);

        return "Libro alquilado correctamente";
    }

    @Override
    public String devolver(Documento d) {
        try {
            if(!super.verSiEstaAlquilado(d)) {
                return "El libro no fue alquilado";
            }
        } catch (NullPointerException e) {
            return e.getMessage();
        }

        super.agregarDisponible(d);
        return "Libro devuelto correctamente";
    }

    @Override
    public String alquilado(Documento d) {
        try {
            if(super.verSiEstaAlquilado(d)) {
                return "El libro esta alquilado";
            }
        } catch (NullPointerException e) {
            return e.getMessage();
        }

        return "Libro no alquilado";
    }
}
