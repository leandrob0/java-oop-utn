package com.company.ejercicio2;

public class Staff extends Persona {
    protected double salario;
    protected String turno;

    public Staff(String dni, String first,String last,String email, String direccion,double salario, String turno) {
        super(dni,first,last,email,direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double salarioAnual() {
        return salario*12;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Staff{" +
                super.toString() +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                '}';
    }
}
