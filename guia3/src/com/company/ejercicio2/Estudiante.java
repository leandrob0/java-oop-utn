package com.company.ejercicio2;

import java.time.LocalDate;

public class Estudiante extends Persona {
    protected LocalDate ingreso;
    protected double cuota;
    protected String carrera;

    public Estudiante(String dni, String first,String last,String email, String direccion ,LocalDate ingreso, double cuota, String carrera) {
        super(dni,first,last,email,direccion);
        this.ingreso = ingreso;
        this.cuota = cuota;
        this.carrera = carrera;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                super.toString() +
                "ingreso=" + ingreso +
                ", cuota=" + cuota +
                ", carreta='" + carrera + '\'' +
                '}';
    }
}
