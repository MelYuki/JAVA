package be.tftic.webmobile.intro.demo.poo.encapsulation;

public class Main {

    public static void main(String[] args) {

        Voiture v1 = new Voiture();
        v1.color = "vert";
        v1.immat = "fa";
        v1.nbrPortes = 5;
//        v1.kmParcourus = 8; // impossible acces private

        Pilote p = new Pilote("Mel", "Taï", 0);

        // Ajoute à la copie -> pas d'effet sur la liste interne
        // -> Donc pas bon!
//        p.getPermis().add("Permis B");
        p.addPermis("Permis B");

    }
}
