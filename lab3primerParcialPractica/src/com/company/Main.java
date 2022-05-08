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
        List<Instrumento> instrumentos = new ArrayList<>();
        ejercicio3y4(instrumentos);
        ejercicio5(instrumentos);
    }

    public static void ejercicio3y4(List<Instrumento> instrumentos) {

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
            if(i != null) {
                System.out.println(i);
                if(i instanceof GuitarraElectrica) {
                    ((GuitarraElectrica) i).SonidoAmplificado();
                } else if(i instanceof Bajo) {
                    ((Bajo) i).SonidoAmplificado();
                }
            }
        }
    }

    public static void ejercicio5(List<Instrumento> instrumentos) {
        for(Instrumento i : instrumentos) {
            if(i != null) {
                if(i instanceof GuitarraElectrica) {
                    i.setPrecio(i.getPrecio() + (i.getPrecio() * 0.05));
                } else if(i instanceof GuitarraAcustica) {
                    i.setPrecio(i.getPrecio() + (i.getPrecio() * 0.10));
                } else if(i instanceof Bajo) {
                    i.setPrecio(i.getPrecio() + (i.getPrecio() * 0.20));
                } else {
                    i.setPrecio(i.getPrecio() + (i.getPrecio() * 0.15));
                }
            }
        }
    }
}
