package com.company.Interfaces;

// Decidi usar una interfaz ya que no todas las clases van a aplicar un descuento. Implemento la interfaz solo en las clases que quiero un descuento.
public interface Descuentos {
    // El porcentaje podria ser pasado como double en el caso de que se aplique un %52,10 de descuento por ejemplo, pero me parecio un caso un poco especial.
    // El descuento no modifica el precio original.
    double aplicarDescuento(int porcentaje);
}
