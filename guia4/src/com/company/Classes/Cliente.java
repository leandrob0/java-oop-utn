package com.company.Classes;

import java.util.List;
import java.util.Objects;

public class Cliente {
    private String first;
    private String last;
    private String phoneNumber;
    private List<Alquiler> alquileres;

    public Cliente(String first, String last, String phoneNumber) {
        this.first = first;
        this.last = last;
        this.phoneNumber = phoneNumber;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void addAlquiler(Alquiler alquiler) {
        this.alquileres.add(alquiler);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(first, cliente.first) && Objects.equals(last, cliente.last) && Objects.equals(phoneNumber, cliente.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, last, phoneNumber);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
