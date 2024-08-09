package org.example.services;

import org.example.services.interfaces.MusicInterface;

public class Music implements MusicInterface {

    public void list() {
        System.out.println("Lista de musicas");

    }

    public void play() {
        System.out.println("Musica inicializada");

    }

    public void stop() {
        System.out.println("Musica pausada");

    }

    public void favorites() {
        System.out.println("Lista de musicas favoritas");

    }

    public void favorite(String music) {
        System.out.println("Musica "+music+" Favoritada");

    }
}
