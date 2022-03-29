package com.company.utils;

public class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(int hora, int m,int s) {
        this.hora = (hora >= 0 && hora < 24) ? hora : 0;
        this.minutos = (m >= 0 && m < 60) ? m : 0;
        this.segundos = (s >= 0 && s < 60) ? s : 0;
    }

    private void aumentarHoras() {
        if(hora == 23) {
            this.hora = 0;
        } else {
            this.hora++;
        }
    }

    private void aumentarMinutos() {
        if(minutos == 59) {
            this.minutos = 0;
            aumentarHoras();
        } else {
            this.minutos++;
        }
    }

    public Hora aumentarSegundos() {
        if(segundos == 59) {
            this.segundos = 0;
            aumentarMinutos();
        } else {
            this.segundos++;
        }

        return this;
    }

    private void decrementarHora() {
        if(hora == 0) {
            this.hora = 23;
        } else {
            this.hora--;
        }
    }

    private void decrementarMinutos() {
        if(minutos == 0) {
            this.minutos = 0;
            decrementarHora();
        } else {
            this.minutos--;
        }
    }

    public Hora decrementarSegundos() {
        if(segundos == 0) {
            this.segundos = 0;
            decrementarMinutos();
        } else {
            this.segundos--;
        }

        return this;
    }

    @Override
    public String toString(){
        String stringHora = (hora < 10) ? '0'+Integer.toString(hora) : Integer.toString(hora);
        String stringMinutos = (minutos < 10) ? '0'+Integer.toString(minutos) : Integer.toString(minutos);
        String stringSegundos = (segundos < 10) ? '0'+Integer.toString(segundos) : Integer.toString(segundos);
        return stringHora + ':' + stringMinutos + ':' + stringSegundos;
    }
}
