package com.company.Classes;

import java.time.LocalDate;

public class Alquiler {
    private Film pelicula;
    private Cliente cliente;
    private LocalDate alquiladoEn;
    private LocalDate fechaFinal;

    public Alquiler(Film pelicula, Cliente cliente) {
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.alquiladoEn = LocalDate.now();
        this.fechaFinal = LocalDate.now().plusDays(2);
    }

    public Film getPelicula() {
        return pelicula;
    }

    public void setPelicula(Film pelicula) {
        this.pelicula = pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getAlquiladoEn() {
        return alquiladoEn;
    }

    public void setAlquiladoEn(LocalDate alquiladoEn) {
        this.alquiladoEn = alquiladoEn;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                ", pelicula=" + pelicula +
                ", cliente=" + cliente.toString() +
                ", alquiladoEn=" + alquiladoEn +
                ", fechaFinal=" + fechaFinal +
                '}';
    }
}
