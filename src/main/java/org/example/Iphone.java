package org.example;


import org.example.services.Internet;
import org.example.services.Music;
import org.example.services.Phone;

public class Iphone {
    public static void main(String[] args) {

        power();

        Phone phone = new Phone();
        phone.receiveCall();
        phone.acceptCall();
        phone.disconnectCall();

        Music music = new Music();
        music.list();
        music.play();
        music.stop();
        music.favorite("Guns rose");
        music.favorites();

        Internet internet = new Internet();
        internet.isConnected();

        shutdown();
    }

    private static void power() {
        System.out.println("Telefone ligado");
    }

    private static void shutdown() {
        System.out.println("Telefone desligado");
    }


}