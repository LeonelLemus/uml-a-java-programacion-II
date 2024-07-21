package com.ejemplo.personajes;

public class Ogro extends Personaje implements Villano {
    public Ogro(String nombre, String descripcion, long tamaño, int poder, int vida) {
        super(nombre, descripcion, tamaño, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Ogro atacando");
    }

    @Override
    public void destruir() {
        System.out.println("Ogro destruyendo");
    }

    @Override
    public void desplazarse() {
        System.out.println("Ogro desplazándose");
    }

    @Override
    public int mostrarVida() {
        return this.vida;
    }

    @Override
    public void mostrarPoder() {
        System.out.println("Poder del Ogro: " + this.poder);
    }
}
