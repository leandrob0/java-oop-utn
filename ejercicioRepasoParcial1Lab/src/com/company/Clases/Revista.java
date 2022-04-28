package com.company.Clases;

import com.company.Interfaz.DocumentFunctionality;

import java.time.LocalDate;

public class Revista extends Documento implements DocumentFunctionality {
    public Revista(String titulo, String codigo, LocalDate publicacion) {
        super(titulo,codigo,publicacion);
        super.agregarDisponible(this);
    }

    @Override
    public String alquilar(Documento d) {
        try {
            if(super.verSiEstaAlquilado(d)) {
                return "La revista ya esta alquilada";
            }
        } catch (NullPointerException e) {
            return e.getMessage();
        }

        super.agregarNoDisponible(d);
        return "Revista alquilada correctamente";
    }

    @Override
    public String devolver(Documento d) {
        try {
            if(!super.verSiEstaAlquilado(d)) {
                return "La revista ya esta alquilada";
            }
        } catch (NullPointerException e) {
            return e.getMessage();
        }

        super.agregarDisponible(d);
        return "Revista alquilada correctamente";
    }

    @Override
    public String alquilado(Documento d) {
        try {
            if(super.verSiEstaAlquilado(d)) {
                return "La revista esta alquilada";
            }
        } catch (NullPointerException e) {
            return e.getMessage();
        }

        return "Revista no alquilada";
    }
}
