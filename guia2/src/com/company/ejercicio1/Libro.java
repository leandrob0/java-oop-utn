package com.company.ejercicio1;
import java.util.ArrayList;

public class Libro  {

    private String titulo;
    private double precio;
    private int stock;
    private ArrayList<Autor> aut = new ArrayList<>();

    public Libro() {

    }

    // No tenia ganas de escribir.
    public Libro(String t, double p , int s) {
        this.titulo = t;
        this.precio = p;
        this.stock = s;
    }

    public String getTitle() {
        return titulo;
    }

    public void setTitle(String title) {
        this.titulo = title;
    }

    public double getPrice() {
        return precio;
    }

    public void setPrice(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Autor> getAutors() {
        return aut;
    }

    public void addAutor(Autor aut) {
        this.aut.add(aut);
    }

    private String formatAutores(){
        String autores = "";
        for(int i = 0; i < aut.size(); i++) {
            autores+= aut.get(i).getFirst() + " " + aut.get(i).getLast();
            if(i+1 != aut.size()) {
                autores+= " Y ";
            }
        }
        return autores;
    }

    public String libroInfo() {
        return "El libro, " + titulo + " de " + formatAutores() + ". Se vende a " + precio + " pesos.";
    }

    @Override
    public String toString() {
        return "Title: " + titulo + ".\nPrice: " + precio + ".\nStock: " + stock;
    }
}
