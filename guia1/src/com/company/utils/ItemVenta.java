package com.company.utils;

public class ItemVenta {
    private int id;
    private String description;
    private int cantidad;
    private double priceByUnit;

    public ItemVenta(int id, String desc, int cant, double price) {
        this.id = id;
        this.description = desc;
        this.cantidad = cant;
        this.priceByUnit = price;
    }

    private double totalPrice() {
        return cantidad*priceByUnit;
    }

    @Override
    public String toString() {
        return "ItemVenta[id=" + id + ",description=" + description + ",cantidad=" + cantidad + ",pUnitario=" + priceByUnit + ",pTotal=" + totalPrice() + "]";
    }
}
