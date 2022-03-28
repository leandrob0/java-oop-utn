package com.company.utils;

public class Empleado {
    private int dni; // Nose si usar un string o un int para el DNI.
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado(int dni, String first, String last, int salary) {
        this.dni = dni;
        this.nombre = first;
        this.apellido = last;
        this.salario = salary;
    }

    public int anualSalary() {
        return salario*12;
    }

    public void raiseSalary(int percentage) {
        int raisedSalary = ((salario/100) * (100+percentage));
        this.salario = raisedSalary;
    }

    @Override
    public String toString() {
        return "Empleado[dni=" + dni + ",nombre=" + nombre + ",apellido=" + apellido + ",salario=" + salario + "]";
    }
}
