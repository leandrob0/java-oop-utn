package com.company.ejercicio3;

import java.util.Random;

public class Cuadrado extends Rectangulo {

    public Cuadrado() {
        super(new Random().nextDouble(1000),new Random().nextDouble(1000));
    }
    public Cuadrado(double lado) {
        super(lado, lado);
    }

    public Cuadrado(String color, double lado) {
        super(color, lado, lado);
    }

    @Override
    public String toString() {
        String col = (color == null) ? color : "No tiene";
        return "Cuadrado{" +
                "color='" + col + '\'' +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }
}
