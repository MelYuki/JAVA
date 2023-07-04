package be.tftic.webmobile.intro.demo.poo.exceptions;

public class HireCapacityException extends RuntimeException{

    public HireCapacityException(){
        super("Capacité d'engagement excedée.");
    }

}