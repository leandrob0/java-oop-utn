package com.company;

import com.company.utils.*;

public class Main {

    public static void main(String[] args) {
	    //1)
        Rectangle rec = new Rectangle();
        rec.setAlto(20.22);
        rec.setAncho(10.5);
        System.out.println("Ejecicio 1:");
        System.out.println("Ancho: " + rec.getAncho() + ". Alto: " + rec.getAlto());
        System.out.println("Perimetro: " + rec.calculatePerimetro() + ". Area: " + rec.calculateArea());
        rec.setAncho(5.45);
        rec.setAlto(20.00);
        System.out.println("Perimetro: " + rec.calculatePerimetro() + ". Area: " + rec.calculateArea());
        Rectangle defo = new Rectangle();
        System.out.println("Ancho: " + defo.getAncho() + ". Alto: " + defo.getAlto());

        //2)
        Empleado carlos = new Empleado(23456345,"Carlos","Guiterrez",25000);
        Empleado ana = new Empleado(34234123,"Ana", "Sanchez", 27500);
        System.out.println("\n\nEjercicio 2:");
        System.out.println(carlos);
        System.out.println(ana);
        carlos.raiseSalary(15);
        System.out.println("Carlos anual salary after raise: " + carlos.anualSalary());

        //3)
        System.out.println("\n\nEjercicio 3:");
        ItemVenta caramelos = new ItemVenta(01,"Caramelos Butter toffess", 150,2.25);
        System.out.println(caramelos);
    }
}
