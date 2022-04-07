package com.company;

import com.company.ejercicio1.Cilindro;
import com.company.ejercicio2.*;
import com.company.ejercicio3.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("EJERCICIO 1: ");
        ej1();

        System.out.println("\nEJERCICIO 2: ");
        ej2();

        System.out.println("\nEJERCICIO 3: ");
        ej3();
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

        System.out.println("\n" + cilindrin2);
    }

    public static void ej2() {
        Estudiante e1 = new Estudiante("42.594.296","Leandro","Bovino","leandro@gmail.com","casa",LocalDate.now(),40.56,"Informatica");
        Estudiante e2 = new Estudiante("42.242.214","Lionel","Messi","messi@gmail.com","casa2",LocalDate.now(),4056.2,"Futbol");
        Estudiante e3 = new Estudiante("41.242.241","Otrin","Otro","otro@gmail.com","casa3",LocalDate.now(),402.56,"Nose");

        Staff s1 = new Staff("31.242.241","Trabajador","Uno","uno@gmail.com","cason1",3445.23,"Tarde");
        Staff s2 = new Staff("34.242.241","Trabajador","Dos","dos@gmail.com","caso3n",2445.33,"Maniana");
        Staff s3 = new Staff("33.242.241","Trabajador","Tres","tres@gmail.com","cason2",2000.00,"Tarde");

        ArrayList<Persona> gente = new ArrayList<>(Arrays.asList(e1,e2,e3,s1,s2,s3));
        int staffs = 0, estudiantes = 0;
        double totalCuotas = 0;

        for(Persona p: gente) {
            if(p instanceof Staff) {
                staffs++;
            } else {
                estudiantes++;
                Estudiante x = (Estudiante)p;
                totalCuotas += x.getCuota();
            }
        }

        System.out.println("Cantidad staff: " + staffs + ", Cantidad estudiantes: " + estudiantes);
        System.out.println("Ingreso de cuotas: " + String.format("%.2f",totalCuotas));
    }

    public static void ej3() {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Cuadrado cuadrado = new Cuadrado();

        System.out.println(circulo);
        System.out.println(rectangulo);
        System.out.println(cuadrado);
    }
}
