package com.company;
import com.company.ejercicio1.*;

public class Main {

    public static void main(String[] args) {
        // 1)
        Autor a = new Autor();
        Autor aux = new Autor("Leandro","Bovino","leandro@gmail.com",'M');

        a.setFirst("Joshua");
        a.setLast("Bloch");
        a.setEmail("joshua@email.com");
        a.setGender('M');

        System.out.println("Autor: ");
        System.out.println(a);

        Libro l = new Libro();

        l.setTitle("Effective Java");
        l.setPrice(450);
        l.setStock(150);
        l.addAutor(a);

        System.out.println("\nLibro: ");
        System.out.println(l);

        l.setPrice(500);
        l.setStock(l.getStock() + 50);
        l.addAutor(aux);

        System.out.println("Autor(es/as) del libro: " + l.getAutors());
        System.out.println("\n" + l.libroInfo());
    }
}
