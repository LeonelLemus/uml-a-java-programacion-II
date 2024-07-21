package com.ejemplo.personajes;

public class Duende extends Personaje implements Villano {
    public Duende(String nombre, String descripcion, long tamaño, int poder, int vida) {
        super(nombre, descripcion, tamaño, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Duende atacando");
    }

    @Override
    public void destruir() {
        System.out.println("Duende destruyendo");
    }

    @Override
    public void desplazarse() {
        System.out.println("Duende desplazándose");
    }

    @Override
    public int mostrarVida() {
        return this.vida;
    }

    @Override
    public void mostrarPoder() {
        System.out.println("Poder del Duende: " + this.poder);
    }
}
