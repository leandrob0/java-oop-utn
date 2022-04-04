package com.company.ejercicio3;
import java.util.UUID;

public class ClienteCuenta {
    private UUID id;
    private String nombre;
    private char genero;

    public ClienteCuenta() {
        this.id = UUID.randomUUID();
    }

    public ClienteCuenta(String nombre, char genero) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ClienteCuenta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", genero=" + genero +
                '}';
    }
}
