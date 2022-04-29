package com.company;

import com.company.Clases.Diario;
import com.company.Clases.Libro;
import com.company.Clases.Revista;
import com.company.Enum.Genres;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Libro l1 = new Libro("The name of the wind", "123xz21a", LocalDate.now(), Genres.FANTASY);
        Libro l2 = new Libro("The wise man's fears", "123xz21b", LocalDate.now(), Genres.FANTASY);
        Libro l3 = new Libro("The way of kings", "123xz21c", LocalDate.now(), Genres.FANTASY);

        Diario d1 = new Diario("Temporal en argentina 1", "xsfa321", LocalDate.now());
        Diario d2 = new Diario("Temporal en argentina 2", "xsfa322", LocalDate.now());
        Diario d3 = new Diario("Temporal en argentina 3", "xsfa323", LocalDate.now());

        Revista r1 = new Revista("Nose que poner 1", "232323231", LocalDate.now());
        Revista r2 = new Revista("Nose que poner 2", "232323232", LocalDate.now());
        Revista r3 = new Revista("Nose que poner 3", "232323233", LocalDate.now());

        Manager manager = new Manager();

        manager.agregarDisponible(l1);
        manager.agregarDisponible(l2);
        manager.agregarDisponible(l3);

        System.out.println(l1.alquilar());
        System.out.println(l1.devolver());
        System.out.println(l2.alquilado());
    }
}
