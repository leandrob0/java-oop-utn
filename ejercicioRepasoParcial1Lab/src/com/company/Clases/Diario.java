package com.company.Clases;

import com.company.Interfaz.DocumentFunctionality;

import java.time.LocalDate;

public class Diario extends Documento implements DocumentFunctionality {
    public Diario(String codigo, String titulo, LocalDate publicacion) {
        super(codigo, titulo, publicacion);
        super.agregarDisponible(this);
    }

    @Override
    public String alquilar(Documento d) {
        try {
            if(super.verSiEstaAlquilado(d)) {
                return "El diario esta siendo leido";
            }
        } catch (NullPointerException e) {
            return e.getMessage();
        }

        super.agregarNoDisponible(d);

        return "Diario alquilado correctamente";
    }

    @Override
    public String devolver(Documento d) {
        try {
            if(!super.verSiEstaAlquilado(d)) {
                return "El diario no esta siendo leido";
            }
        } catch (NullPointerException e) {
            return e.getMessage();
        }

        super.agregarDisponible(d);
        return "Diario devuelto correctamente";
    }

    @Override
    public String alquilado(Documento d) {
        try {
            if(super.verSiEstaAlquilado(d)) {
                return "El diario esta siendo leido.";
            }
        } catch (NullPointerException e) {
            return e.getMessage();
        }

        return "Libro disponible para leer.";
    }
}
