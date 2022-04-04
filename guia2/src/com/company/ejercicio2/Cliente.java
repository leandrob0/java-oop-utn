package com.company.ejercicio2;
import java.util.UUID;

public class Cliente {
    private UUID id;
    private String name;
    private String email;
    private int discountPercentage;

    public Cliente() {
        this.id = UUID.randomUUID();
    }

    public Cliente(String name, String email, int discount) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.discountPercentage = discount;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", discountPercentage=" + discountPercentage +
                '}';
    }
}
