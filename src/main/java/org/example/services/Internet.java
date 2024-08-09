package org.example.services;

import org.example.services.interfaces.InternetInterface;

public class Internet implements InternetInterface {


    private boolean connectProvider() {
        return true;
    }

    public boolean isConnected() {

        if(this.connectProvider()){
            System.out.println("Internet conectada");
            return true;
        }
        System.out.println("Falha na conexão com a internet");
        return false;
    }
}
