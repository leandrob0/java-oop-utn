package com.company;

import com.company.utils.Rectangle;

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
    }
}
