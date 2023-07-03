package be.tftic.webmobile.intro.exo.poo.abstrait.exoAnimaux;

public class Lion extends Animal {

    public Lion(String nom) {
        super(nom);
    }

    @Override
    public String parler() {
        return "Rrrh!!!";
    }
}