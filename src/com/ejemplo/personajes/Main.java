package com.ejemplo.personajes;

public class Main {
    public static void main(String[] args) {
        Elfo elfo = new Elfo("Legolas", "Elfo arquero", 180, 90, 100);
        elfo.atacar();
        elfo.defender();
        elfo.recibirAtaque();
        elfo.desplazarse();
        System.out.println("Vida del Elfo: " + elfo.mostrarVida());
        elfo.mostrarPoder();

        Ogro ogro = new Ogro("Shrek", "Ogro amistoso", 300, 100, 200);
        ogro.atacar();
        ogro.destruir();
        ogro.desplazarse();
        System.out.println("Vida del Ogro: " + ogro.mostrarVida());
        ogro.mostrarPoder();
    }
}
