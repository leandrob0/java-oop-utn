package com.company.Clases;

import java.time.LocalDate;

public abstract class Documento {
    protected String codigo;
    protected String titulo;
    protected LocalDate publicacion;

    public Documento(String titulo, String codigo, LocalDate publicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.publicacion = publicacion;
    }
}
