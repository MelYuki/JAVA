package be.tftic.webmobile.intro.exo.poo.constructeur.exoPersonneV2;

public class Main {

    public static void main(String[] args) {

        Personne perso1 = new Personne("Taï", "Mel", 34);
        Personne perso2 = new Personne("Grind", "Billy");

        System.out.printf("\n%s: \n", perso1.prenom);
        perso1.saluer(); // OK

        System.out.printf("\n%s: \n", perso2.prenom);
        perso2.saluer(true); // OK

        System.out.printf("\n%s: \n", perso1.prenom);
        perso1.saluer(perso2, true); // OK

        System.out.printf("\n%s: \n", perso2.prenom);
        perso2.saluer(perso1); // OK

    }
}
