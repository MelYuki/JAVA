package be.tftic.webmobile.intro.demo.poo.interfaces;
public abstract class Vehicule {

    private final String marque;

    public Vehicule(String marque) {
        this.marque = marque;
    }

    public String getMarque() {
        return marque;
    }
}