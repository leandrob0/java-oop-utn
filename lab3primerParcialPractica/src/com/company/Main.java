package com.company;

import com.company.Clases.Instrumento;
import com.company.Clases.Bajo;
import com.company.Clases.GuitarraAcustica;
import com.company.Clases.GuitarraElectrica;
import com.company.Clases.InsBaterias;
import com.company.Enums.TipoMadera;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ejercicio3();
    }

    public static void ejercicio3() {
        List<Instrumento> instrumentos = new ArrayList<>();

        Bajo bajito = new Bajo(350.45,"Nose", "XG1");
        Bajo bajito2 = new Bajo(600,"Otro bajo", "OB1");

        GuitarraElectrica guitarraE = new GuitarraElectrica(1000, "Marca de guitarra", "modelo de guitarra");
        GuitarraAcustica guitarraA = new GuitarraAcustica(234, "Guitarra acustica", TipoMadera.CAOBA);
        InsBaterias bato = new InsBaterias("Marca de bateria", 4, 2);

        instrumentos.add(bajito);
        instrumentos.add(bajito2);
        instrumentos.add(guitarraE);
        instrumentos.add(guitarraA);
        instrumentos.add(bato);

        for(Instrumento i : instrumentos) {
            System.out.println(i);
        }
    }
}
