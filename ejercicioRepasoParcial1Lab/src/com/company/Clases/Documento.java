package com.company.Clases;

import java.time.LocalDate;

public abstract class Documento {
    protected String codigo;
    protected String titulo;
    protected LocalDate publicacion;
    protected boolean disponible;

    public Documento(String titulo, String codigo, LocalDate publicacion, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.publicacion = publicacion;
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "titulo='" + titulo + '\'' +
                ", publicacion=" + publicacion +
                ", disponible=" + disponible +
                '}';
    }
}
