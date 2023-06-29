package be.tftic.webmobile.intro.exo.poo.encaps.exoCompetSportive;

public class Sportif {

    private String nom;
    private String prenom;
    private int anneeNaissance; // par defaut -> int = 0

    Sportif(String nom, String prenom, int anneeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.setAnneeNaissance(anneeNaissance);
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    private void setAnneeNaissance(int anneeNaissance) {
        if(anneeNaissance > 1900 && anneeNaissance < 2023)
            this.anneeNaissance = anneeNaissance;
    }

    public String getPrenom() {
        return prenom;
    }
    private void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }
    private void setNom(String nom) {
        this.nom = nom;
    }
}
