package com.ejemplo.personajes;

public class Humano extends Personaje implements Heroe {
    public Humano(String nombre, String descripcion, long tamaño, int poder, int vida) {
        super(nombre, descripcion, tamaño, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Humano atacando");
    }

    @Override
    public void defender() {
        System.out.println("Humano defendiendo");
    }

    @Override
    public void recibirAtaque() {
        System.out.println("Humano recibiendo ataque");
    }

    @Override
    public void desplazarse() {
        System.out.println("Humano desplazándose");
    }

    @Override
    public int mostrarVida() {
        return this.vida;
    }

    @Override
    public void mostrarPoder() {
        System.out.println("Poder del Humano: " + this.poder);
    }
}
