package com.company;

import com.company.Clases.*;

import java.util.ArrayList;
import java.util.List;

import java.lang.String;

// Leandro Bovino.
// Las clases Escritorio y silla no heredan de una clase mueble porque no comparten nada en especial mas alla de las cosas de producto.

public class Main {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        Escritorio escritorio = new Escritorio(50,"Escritorio de messi",160.25,1.00,4.50);
        Impresora impresora = new Impresora(50,"HP One",50.45,"HP",6);
        Silla silla = new Silla(25,"Silla de messi",12.50,false);
        Notebook notebook = new Notebook(100,"Lenovo thinkpad",100.25,"Lenovo",12);

        productos.add(escritorio);
        productos.add(impresora);
        productos.add(silla);
        productos.add(notebook);

        mostrarInstancias(productos);
        actualizarPrecios(productos);
    }

    public static void mostrarInstancias(List<Producto> productos) {
        for(Producto p : productos) {
            if(p != null) {
                // No supe a que se referia al mostrar el "tipo" de instancia, lo mostre  por pantalla y se ve de que clase es instancia (creo que es eso).
                System.out.println(p);
            }
        }
    }

    public static void actualizarPrecios(List<Producto> productos) {
        // Se actualizan a traves de el metodo de clase aumentar precio. Uso el getter para ver el precio actual.
        for(Producto p : productos) {
            if(p != null) {
                if(p instanceof Escritorio) {
                    System.out.println("\nEscritorio - Precio antes de aumento: " + p.getPrecio());
                    p.aumentarPrecio(10);
                    System.out.println("Precio  despues de aumento: " + String.format("%.2f", p.getPrecio()));
                } else if(p instanceof Notebook) {
                    System.out.println("\nNotebook - Precio antes de aumento: " + p.getPrecio());
                    p.aumentarPrecio(20);
                    System.out.println("Precio  despues de aumento: " + String.format("%.2f", p.getPrecio()));
                } else if(p instanceof Silla) {
                    System.out.println("\nSilla - Precio antes de aumento: " + p.getPrecio());
                    p.aumentarPrecio(5);
                    System.out.println("Precio  despues de aumento: " + String.format("%.2f", p.getPrecio()));
                } else {
                    System.out.println("\nImpresora - Precio antes de aumento: " + p.getPrecio());
                    p.aumentarPrecio(15);
                    System.out.println("Precio  despues de aumento: " + String.format("%.2f", p.getPrecio()));
                }
            }
        }
    }
}
