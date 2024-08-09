package org.example.services;

import org.example.services.interfaces.PhoneInterface;

public class Phone implements PhoneInterface {


    public void receiveCall() {
        this.soundCall();
        System.out.println("Recebendo chamada");
    }

    public void acceptCall() {
        System.out.println("Ligação aceita");
    }

    public void disconnectCall() {
        System.out.println("Ligação finalizada");
    }

    private void soundCall() {
        System.out.println("Telefone toca");
    }

    public void getNumbers() {
        System.out.println("Lista de numeros de telefone");
    }

    public void makeCall(String number) {
        System.out.println("Fazendo ligação para o numero "+number);
    }
}
