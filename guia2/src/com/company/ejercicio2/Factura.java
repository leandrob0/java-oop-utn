package com.company.ejercicio2;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Factura {
    private UUID id;
    private LocalDateTime date;
    private Cliente client;
    private ArrayList<ItemVenta> items = new ArrayList<>();

    public Factura(Cliente client) {
        this.id = UUID.randomUUID();
        this.date = LocalDateTime.now();
        this.client = client;
    }

    public double getTotal() {
        double total = 0;
        for(ItemVenta item : items) {
            total += item.getUnitPrice();
        }
        return total;
    }

    public void addItemVenta(ItemVenta item) {
        this.items.add(item);
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }

    public double totalWithDiscount() {
        double discountPercentage = client.getDiscountPercentage();
        double total = getTotal();
        if(total == 0) {
            return 0;
        } else {
            double discountedPrice = (total - (total * (discountPercentage/100)));
            return discountedPrice;
        }
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", total=" + getTotal() +
                ", date=" + date +
                ", montoDesc=" + totalWithDiscount() +
                ", cantItems=" + items.size() +
                ", " + client +
                '}';
    }
}
