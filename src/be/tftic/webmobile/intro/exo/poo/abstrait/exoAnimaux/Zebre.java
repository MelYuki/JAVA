package be.tftic.webmobile.intro.exo.poo.abstrait.exoAnimaux;

public class Zebre extends Animal {

    public Zebre(String nom){
        super(nom);
    }

    @Override
    public String parler() {
        return "Hi han?!";
    }
}
