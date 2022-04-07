package com.company;
import com.company.ejercicio1.Cilindro;
import com.company.ejercicio3.*;

public class Main {

    public static void main(String[] args) {
        ej1();
    }

    public static void ej1() {
        Cilindro cilindrin = new Cilindro();
        System.out.println("Cilindro default.");

        System.out.println("Radio: " + cilindrin.getRadio());
        System.out.println("Altura: " + cilindrin.getAltura());
        System.out.println("Area: " + String.format("%.2f", cilindrin.calculateArea()));
        System.out.println("Volumen: " + String.format("%.2f", cilindrin.calculateVolumen()));

        Cilindro cilindrin2 = new Cilindro(2.50, 6.50);
        System.out.println("\nCilindro especificado.");

        System.out.println("Radio: " + cilindrin2.getRadio());
        System.out.println("Altura: " + cilindrin2.getAltura());
        System.out.println("Area: " + String.format("%.2f", cilindrin2.calculateArea()));
        System.out.println("Volumen: " + String.format("%.2f", cilindrin2.calculateVolumen()));
    }

    public static void ej3() {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Cuadrado cuadrado = new Cuadrado();


    }
}
