package com.ejemplo.personajes;

public abstract class Personaje {
    protected String nombre;
    protected String descripcion;
    protected long tamaño;
    protected int poder;
    protected int vida;

    public Personaje(String nombre, String descripcion, long tamaño, int poder, int vida) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tamaño = tamaño;
        this.poder = poder;
        this.vida = vida;
    }

    public abstract void desplazarse();
    public abstract int mostrarVida();
    public abstract void mostrarPoder();
}

