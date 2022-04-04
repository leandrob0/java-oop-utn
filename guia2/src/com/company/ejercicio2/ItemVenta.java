package com.company.ejercicio2;
import java.util.UUID;

public class ItemVenta {
    private UUID id;
    private String nombre;
    private String description;
    private double unitPrice;

    public ItemVenta(String nombre, String description, double unitPrice) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
