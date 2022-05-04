package com.company.Clases;

public class InsBaterias extends Instrumento{
    private int tambores;
    private int platillos;

    public InsBaterias(String marca, int tambores, int platillos) {
        super(tambores*3000 + platillos*2000, marca);
        this.tambores = tambores;
        this.platillos = platillos;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "tambores=" + tambores +
                ", platillos=" + platillos +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                '}';
    }
}
