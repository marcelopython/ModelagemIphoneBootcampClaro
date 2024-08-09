package org.example.services.interfaces;

public interface PhoneInterface {

    public  void receiveCall();

    public void makeCall(String number);

    public void getNumbers();

    public void acceptCall();

    public void disconnectCall();
}
