package com.company.Clases;

public class InsBaterias extends Instrumento{
    private int tambores;
    private int platillos;

    public InsBaterias(String marca, int tambores, int platillos) {
        super(tambores*3000 + platillos*2000, marca);
        this.tambores = tambores >= 3 ? tambores : 3;
        this.platillos = platillos >= 1 && platillos <=5 ? platillos : 1;
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
