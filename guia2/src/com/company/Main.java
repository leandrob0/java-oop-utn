package com.company;
import com.company.ejercicio1.*;
import com.company.ejercicio2.*;
import com.company.ejercicio3.*;

public class Main {

    public static void main(String[] args) {
        // 1)
        ejercicio1();

        // 2)
        ejercicio2();

        // 3)
        ejercicio3();
    }

    public static void ejercicio1() {
        System.out.println("EJERCICIO 1.\n");
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
        System.out.println(l.libroInfo());
    }

    public static void ejercicio2() {
        System.out.println("\nEJERCICIO 2.\n");

        Cliente cliente1 = new Cliente("Leandro Bovino", "leandro@gmail.com", 15);
        System.out.println(cliente1);

        Factura facturaCliente1 = new Factura(cliente1);
        ItemVenta coca = new ItemVenta("Coca cola","Lata coca cola",5.45);
        ItemVenta pepsi = new ItemVenta("Pepsi","Lata pepsi",3.50);

        facturaCliente1.addItemVenta(coca);
        facturaCliente1.addItemVenta(pepsi);

        System.out.println(facturaCliente1.getTotal());
        System.out.println(facturaCliente1.totalWithDiscount());
        System.out.println(facturaCliente1);
    }

    public static void ejercicio3() {
        System.out.println("\nEJERCICIO 3.\n");

        //a)
        ClienteCuenta cliente = new ClienteCuenta("Leandro Bovino", 'M');
        System.out.println(cliente);

        //b)
        Cuenta cuenta = new Cuenta(10000,cliente);

        //c)
        cuenta.depositar(2000);
        System.out.println(cuenta.getBalance());
        cuenta.extraer(2000);
        System.out.println(cuenta.getBalance());

        //d)
        cuenta.extraer(12000);
        System.out.println(cuenta.getBalance());

        //e)
        System.out.println("Historial: ");
        System.out.println(cuenta.getHistorial());
    }
}
