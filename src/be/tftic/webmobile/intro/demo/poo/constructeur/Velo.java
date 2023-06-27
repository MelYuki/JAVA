package be.tftic.webmobile.intro.demo.poo.constructeur;

public class Velo {

    String couleur;
    boolean petitesRoues;
    String type;
    int diametreRoue;

    // ATTENTION:
    // On ne peut pas avoir deux constructeur avec les même paramètres! remplis ou vide!!
    // Si on ajoute un constructeur, il ECRASE celui par defaut!!
    Velo(){}

    Velo(String couleur){
        this.couleur = couleur;
    }

    Velo(String couleur, boolean petitesRoues, String type, int diametreRoue) {
        this.couleur = couleur;
        this.petitesRoues = petitesRoues;
        this.type = type;
        this.diametreRoue = diametreRoue;
    }
}
