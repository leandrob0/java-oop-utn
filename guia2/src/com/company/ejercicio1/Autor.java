package com.company.ejercicio1;

public class Autor {

    private String first;
    private String last;
    private String email;
    private char gender;

    public Autor() {

    }

    public Autor(String f, String l, String e, char g) {
        this.first = f;
        this.last = l;
        this.email = e;
        this.gender = g;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + first + " " + last + ".\nEmail: " + email + ".\nGender: " + gender;
    }
}
