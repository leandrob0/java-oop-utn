package com.company.Classes;

import java.util.List;

public class VideoClub {
    private List<Film> peliculas;
    private List<Cliente> clientes;
    private List<Alquiler> alquileres;

    public VideoClub() {
    }

    public VideoClub(List<Film> peliculas, List<Cliente> clientes) {
        this.peliculas = peliculas;
        this.clientes = clientes;
    }

    public VideoClub(List<Film> peliculas, List<Cliente> clientes, List<Alquiler> alquileres) {
        this.peliculas = peliculas;
        this.clientes = clientes;
        this.alquileres = alquileres;
    }

    public void alquilarPelicular(Film pelicula, Cliente cliente) {
        boolean existe = false;

        // Primero veo si el cliente ya esta registrado en nuestra store.
        for(Cliente c : clientes) {
            if(cliente.equals(c)) {
                // el cliente ya existe, segui.
                existe = true;
            }
        }
        if(!existe) {
            // el cliente no existe, que ingrese los datos primero.
        }

        // Ahora veo si la pelicula existe.
        existe = false;
        for(Film a : peliculas) {
            if(a.equals(pelicula)) {
                existe = true;
                // si tiene stock, alquila.
            }
        }
        if(!existe) {
            // la pelicula no existe, no es posible alquilar.
        }
    }

    public void devolverPelicula(Cliente cliente, Film pelicula) {
        //logica
    }

    public List<Film> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Film> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
}
