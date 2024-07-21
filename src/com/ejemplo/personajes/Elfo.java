package com.ejemplo.personajes;

public class Elfo extends Personaje implements Heroe {
    public Elfo(String nombre, String descripcion, long tamaño, int poder, int vida) {
        super(nombre, descripcion, tamaño, poder, vida);
    }

    @Override
    public void atacar() {
        System.out.println("Elfo atacando");
    }

    @Override
    public void defender() {
        System.out.println("Elfo defendiendo");
    }

    @Override
    public void recibirAtaque() {
        System.out.println("Elfo recibiendo ataque");
    }

    @Override
    public void desplazarse() {
        System.out.println("Elfo desplazándose");
    }

    @Override
    public int mostrarVida() {
        return this.vida;
    }

    @Override
    public void mostrarPoder() {
        System.out.println("Poder del Elfo: " + this.poder);
    }
}
