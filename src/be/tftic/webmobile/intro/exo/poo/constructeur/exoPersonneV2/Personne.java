package be.tftic.webmobile.intro.exo.poo.constructeur.exoPersonneV2;

public class Personne {

    // region ATTRIBUS
    String nom;
    String prenom;
    int age = 35;
    // endregion

    // region CONSTRUCTEUR
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
    // endregion

    // region METHODS
    /*void saluer(){

        System.out.println("  Bonjour!");
    }
    boolean bjr = true;
    void saluer(boolean sePresenter){

        if(bjr)
            saluer();

        if(sePresenter)
            System.out.printf("  Je m'appelle %s %s et j'ai %d ans.\n",
                    this.prenom,
                    this.nom,
                    this.age
            );
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
            bjr = false;
            saluer(true);
        }
    }*/
    // endregion

    // region ALEX METHODS
    void saluer(){
        this.saluer(null, false);
    }

    void saluer(Personne aSaluer){
        this.saluer(aSaluer, false);
    }

    void saluer(boolean sePresenter){
        this.saluer(null, sePresenter);
    }

    void saluer(Personne aSaluer, boolean sePresenter){

        String message = sePresenter ?
                ",je suis %s %s et j'ai %d ans.".formatted(this.prenom, this.nom, this.age)
                : "!";

        if( aSaluer != null )
            message = "Bonjour %s %s".formatted(aSaluer.prenom, aSaluer.nom) + message;
        else
            message = "Bonjour" + message;

        System.out.println(message);

    }
    // endregion
}
