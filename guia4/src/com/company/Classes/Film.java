package com.company.Classes;

import java.time.LocalDate;
import java.util.Objects;

public class Film {
    private String title;
    private LocalDate release;
    private double duration;
    private String classification;
    private String origin;
    private String description;
    private int stock;
    private String genre;

    public Film(String title, LocalDate release, double duration, String classification, String origin, String description, int stock, String genre) {
        this.title = title;
        this.release = release;
        this.duration = duration;
        this.classification = classification;
        this.origin = origin;
        this.description = description;
        this.stock = stock;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return duration == film.duration && stock == film.stock && Objects.equals(title, film.title) && Objects.equals(release, film.release) && Objects.equals(classification, film.classification) && Objects.equals(origin, film.origin) && Objects.equals(description, film.description) && Objects.equals(genre, film.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, release, duration, classification, origin, description, stock, genre);
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", release=" + release +
                ", duration=" + duration +
                ", classification='" + classification + '\'' +
                ", origin='" + origin + '\'' +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                ", genre=" + genre +
                '}';
    }
}
