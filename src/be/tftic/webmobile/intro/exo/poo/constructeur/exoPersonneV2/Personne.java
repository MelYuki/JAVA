package be.tftic.webmobile.intro.exo.poo.constructeur.exoPersonneV2;

public class Personne {

    String nom;
    String prenom;
    int age = 35;

    Personne(){}
    Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    Personne(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }


    void saluer(){

        System.out.println("  Bonjour!");
    }
    void saluer(boolean sePresenter){

        if(sePresenter)
            System.out.printf("  Je m'appelle %s %s et j'ai %d ans.\n",
                    this.prenom,
                    this.nom,
                    this.age
            );
        else
            saluer();
    }
    void saluer (Personne aSaluer) {

        System.out.printf("  Bonjour %s %s!\n",
                aSaluer.prenom,
                aSaluer.nom
        );
    }
    void saluer (Personne aSaluer, boolean sePresenter) {

        saluer(aSaluer);

        if(sePresenter) {
            saluer(sePresenter);
        }
    }
}
