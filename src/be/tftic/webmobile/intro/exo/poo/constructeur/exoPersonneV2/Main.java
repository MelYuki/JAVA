package be.tftic.webmobile.intro.exo.poo.constructeur.exoPersonneV2;

public class Main {

    public static void main(String[] args) {

        Personne perso1 = new Personne();
        Personne perso2 = new Personne();

        perso1.nom = "TaÏ";
        perso1.prenom = "Mel";
        perso1.age = 34;

        perso2.nom = "Grind";
        perso2.prenom = "Billy";
        perso2.age = 28;

        perso1.saluer(perso2);
        perso2.saluer(perso1);

    }
}
