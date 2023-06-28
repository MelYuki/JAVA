package be.tftic.webmobile.intro.demo.poo.constructeur;

public class Velo {

    String couleur = "vert";
    boolean petitesRoues; // par défaut -> false
    String type = "vélo de vitesse";
    int diametreRoue = 58; // par défaut -> 0

    // ATTENTION:
    // On ne peut pas avoir deux constructeur avec les même paramètres! remplis ou vide!!
    // Si on ajoute un constructeur, il ECRASE celui par defaut!!

    // Signature: Velo - constructeur - /
    Velo(){}

    // Signature: Velo - constructeur - String
    Velo(String couleur){
        this.couleur = couleur;
    }

    // Signature: Velo - constructeur - String,boolean,String,int
    Velo(String couleur, boolean petitesRoues, String type, int diametreRoue) {
        this.couleur = couleur;
        this.petitesRoues = petitesRoues;
        this.type = type;
        this.diametreRoue = diametreRoue;
    }
}
