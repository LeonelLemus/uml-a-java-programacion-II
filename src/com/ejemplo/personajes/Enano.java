package com.ejemplo.personajes;

public class Enano extends Personaje implements Heroe {
    public Enano(String nombre, String descripcion, long tamaño, int poder, int vida) {
        super(nombre, descripcion, tamaño, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Enano atacando");
    }

    @Override
    public void defender() {
        System.out.println("Enano defendiendo");
    }

    @Override
    public void recibirAtaque() {
        System.out.println("Enano recibiendo ataque");
    }

    @Override
    public void desplazarse() {
        System.out.println("Enano desplazándose");
    }

    @Override
    public int mostrarVida() {
        return this.vida;
    }

    @Override
    public void mostrarPoder() {
        System.out.println("Poder del Enano: " + this.poder);
    }
}
