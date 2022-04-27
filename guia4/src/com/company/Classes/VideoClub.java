package com.company.Classes;

import java.time.LocalDate;
import java.util.ArrayList;
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

    // Estas funciones estarian bien en el caso que hiciera que el video club maneje todas las funcionalidades, para simplificar, no lo hice asi.
    /*public String agregarPelicula(String title, LocalDate release, int duration, String classification, String origin, String description, int stock, Genero genre) {
        for(Film f : peliculas) {
            // Don't allow adding already added movies.
            if(f.getTitle() == title && f.getDuration() == duration) {
                return "The movie already exists, you should increase the stock!";
            }
        }

        Film newFilm = new Film(title,release,duration,classification,origin,description,stock,genre);
        peliculas.add(newFilm);
        return "The movie was successfully added.";
    }

    public String registrarCliente(String first, String last, String phoneNumber) {
        if(first == null || first.equals("") || last == null || last.equals("") || phoneNumber == null || phoneNumber.equals("")) {
            return "The client must provide a first name, last name, and a phone number.";
        }
        Cliente newClient = new Cliente(first, last, phoneNumber);
        clientes.add(newClient);
        return "The client was successfully created!";
    }*/

    // Va a retornar un String, que describa el estado del alquiler (alquilado, cliente no registrado, etc...)
    public String alquilarPelicular(Film pelicula, Cliente cliente) {
        boolean existe = false;

        // Primero veo si el cliente ya esta registrado en nuestra store.
        // Como estoy creando las instancias desde el main, esta funcionalidad es al pedo, pero en caso de querer abstraer completamente a el desarrollador, lo haria asi.
        for(Cliente c : clientes) {
            if(cliente.equals(c)) {
                // El cliente existe, por lo tanto puede alquilar
                existe = true;
                break;
            }
        }
        if(!existe) {
            // El cliente no existe, primero hay que crearlo.
            // Podria pedirle por consola que ingrese los datos pero decidi que no.
            return "To rent a movie you must first create the client!";
        }

        // Ahora veo si la pelicula tiene stock.
        if(pelicula.getStock() > 0) {
            // Hay stock, le doy la peli.
            Alquiler newAlquiler = new Alquiler(pelicula,cliente);
            pelicula.setStock(pelicula.getStock() - 1);
            cliente.addAlquiler(newAlquiler);
            alquileres.add(newAlquiler);

        }
        return "We currently don't have that film in stock, return later!";
    }

    public String devolverPelicula(Cliente cliente, Film pelicula) {
        for(Alquiler a : alquileres) {
            if(a.getCliente().equals(cliente) && a.getPelicula().equals(pelicula)) {
                pelicula.setStock(pelicula.getStock() + 1);
                return "The movie was returned.";
            }
        }

        return "This movie wasn't rented by this client.";
    }

    public List<Alquiler> devolucionesDeHoy() {
        int today = LocalDate.now().getDayOfYear();
        List<Alquiler> a = new ArrayList<>();

        for(Alquiler al : alquileres) {
            if(al.getFechaFinal().getDayOfYear() == today) {
                a.add(al);
            }
        }

        return a;
    }

    public List<Alquiler> ultimasDiezDeCadaCliente() {
        List<Alquiler> a = new ArrayList<>();

        for(Cliente c : clientes) {
            if(c.getAlquileres().size() > 10) {
                a.addAll(c.getAlquileres().subList(0,10));
            } else {
                a.addAll(c.getAlquileres());
            }
        }

        return a;
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
