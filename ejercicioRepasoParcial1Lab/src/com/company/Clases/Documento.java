package com.company.Clases;

import java.time.LocalDate;
import java.util.List;

public abstract class Documento {
    protected String codigo;
    protected String titulo;
    protected LocalDate publicacion;
    private List<Documento> disponibles;
    private List<Documento> noDisponibles;

    public Documento(String codigo, String titulo, LocalDate publicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.publicacion = publicacion;
    }

    public List<Documento> getDisponibles() {
        return disponibles;
    }

    public List<Documento> getNoDisponibles() {
        return noDisponibles;
    }

    public void agregarDisponible(Documento d) {
        if(d != null) {
            for(Documento doc : disponibles) {
                if(doc.codigo.equals(d.codigo)) {
                    noDisponibles.remove(doc);
                }
            }
            disponibles.add(d);
        }
    }

    public void agregarNoDisponible(Documento d) {
        if(d != null) {
            for(Documento doc : disponibles) {
                if(doc.codigo.equals(d.codigo)) {
                    disponibles.remove(doc);
                }
            }
            noDisponibles.add(d);
        }
    }

    public boolean verSiEstaAlquilado(Documento d) {
        boolean alquilado = false;

        if(d != null) {
            for(Documento doc : noDisponibles) {
                if(doc.codigo.equals(d.codigo)) {
                    alquilado = true;
                }
            }
        } else {
            throw new NullPointerException("The document passed doesn't exist");
        }

        return alquilado;
    }
}
