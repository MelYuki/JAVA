package be.tftic.webmobile.intro.demo.poo.encapsulation.frontiere;

import be.tftic.webmobile.intro.demo.poo.encapsulation.Voiture;

// HERITAGE : extends Voiture
public class Citadine extends Voiture {

    Citadine(String immat, String color, int nbrPortes, int kmParcourus) {

        this.immat = immat;
        this.color = color;
        // Ne fonctionnera pas à cause des modif d'accès:
//        this.nbrPortes = nbrPortes;
//        this.kmParcourus = kmParcourus;
    }
}
