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

    public void registrarCliente(String first, String last, String phoneNumber) {
        if(first == null || first.equals("") || last == null || last.equals("") || phoneNumber == null || phoneNumber.equals("")) {
            System.out.println("The client must provide a first name, last name, and a phone number.");
        } else {
            Cliente newClient = new Cliente(first, last, phoneNumber);
            clientes.add(newClient);
            System.out.println("The client was successfully created!");
        }
    }

    // Va a retornar un String, que describa el estado del alquiler (alquilado, cliente no registrado, etc...)
    public String alquilarPelicular(Film pelicula, Cliente cliente) {
        boolean existe = false;

        // Primero veo si el cliente ya esta registrado en nuestra store.
        for(Cliente c : clientes) {
            if(cliente.equals(c)) {
                // El cliente existe, por lo tanto puede alquilar
                existe = true;
            }
        }
        if(!existe) {
            // El cliente no existe, primero hay que crearlo.
            // Podria pedirle por consola que ingrese los datos pero decidi que no.
            return "To rent a movie you must first create the client!";
        }

        // Ahora veo si la pelicula existe.
        for(Film a : peliculas) {
            if(a.equals(pelicula)) {
                // Miro primero si hay stock de esa pelicula.
                if(a.getStock() > 0) {
                    // Hay stock, le doy la peli.
                    Alquiler newAlquiler = new Alquiler(pelicula,cliente);
                    pelicula.setStock(pelicula.getStock() - 1);
                    alquileres.add(newAlquiler);

                } else {
                    return "We currently don't have that film in stock, return later!";
                }
            }
        }
        // la pelicula no existe, no es posible alquilar.
        return "Sorry! we don't have that film.";
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
