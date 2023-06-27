package be.tftic.webmobile.intro.exo.poo.classe.exoPersonne;

public class Personne {

    String nom;
    String prenom;
    int age;

    void saluer (Personne aSaluer) {
        System.out.printf("Bonjour %s %s\n", aSaluer.prenom, aSaluer.nom);
        System.out.printf("Je m'appelle %s %s et j'ai %d ans\n", this.prenom, this.nom, this.age);
    }
}
