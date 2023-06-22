package co.com.TiendaDeMusica.Instrumentos;

import co.com.TiendaDeMusica.Interfaces.Afinable;

public abstract class Instrumento implements Afinable {
    private String nombre;
    private String marca;
    private double precio;

    public Instrumento(String nombre, String marca, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Nombre : " + nombre + "; marca: " + marca + "; precio: " + precio +
                ".";
    }

    public abstract void tocar();
}
