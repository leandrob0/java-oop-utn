package com.company.ejercicio3;
import java.util.ArrayList;
import java.util.UUID;

public class Cuenta {
    private UUID id;
    private double balance;
    private ClienteCuenta cliente;
    private ArrayList<String> historial = new ArrayList<>();

    public Cuenta() {
        this.id = UUID.randomUUID();
    }

    public Cuenta(double balance, ClienteCuenta cliente) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.cliente = cliente;
    }

    public void extraer(double monto) {
        if(balance-monto >= -2000) {
            this.balance -= monto;
            agregarAlHistorial("retiro",monto);
        } else {
            System.out.println("No tienes suficiente saldo.");
        }
    }

    public void depositar(double monto) {
        this.balance += monto;
        agregarAlHistorial("deposito",monto);
    }

    private void agregarAlHistorial(String operacion, double monto) {
        if(historial.size() == 10) {
            this.historial.remove(0);
            this.historial.add(cliente.getNombre() + ", " + operacion + " " + monto);
        } else {
            this.historial.add(cliente.getNombre() + ", " + operacion + " " + monto);
        }
    }

    public StringBuilder getHistorial() {
        StringBuilder operaciones = new StringBuilder();
        if(historial.size() > 0) {
            for(String operacion : historial) {
                operaciones.append(operacion).append("\n");
            }
        } else {
            operaciones.append("No hiciste operaciones aun.");
        }
        return operaciones;
    }

    public UUID getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClienteCuenta getCliente() {
        return cliente;
    }

    public void setCliente(ClienteCuenta cliente) {
        this.cliente = cliente;
    }
}
