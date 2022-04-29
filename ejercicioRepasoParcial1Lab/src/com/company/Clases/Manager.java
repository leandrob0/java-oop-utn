package com.company.Clases;

import java.util.ArrayList;
import java.util.List;

public final class Manager {
    private List<Documento> documentos = new ArrayList<>();

    public Manager() {
    }

    public void agregarDocumento(Documento d) {
        documentos.add(d);
    }

    public void mostrarDocumentos() {
        for(Documento d : documentos) {
            if(d != null) {
                System.out.println(d.toString());
            }
        }
    }
}
