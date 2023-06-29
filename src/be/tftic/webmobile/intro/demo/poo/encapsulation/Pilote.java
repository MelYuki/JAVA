package be.tftic.webmobile.intro.demo.poo.encapsulation;

import java.util.ArrayList;

public class Pilote {

    private String prenom;
    private String nom;
    private int kmConduit;
    private final ArrayList<String> permis = new ArrayList<>();

    public Pilote(String prenom, String nom, int kmConduit) {
        this.prenom = prenom;
        this.nom = nom;
        this.setKmConduit(kmConduit);
    }

    public int getKmConduit() {
        return kmConduit;
    }
    protected void setKmConduit(int kmConduit) {
//        if(kmConduit >= 0 && kmConduit > this.kmConduit)
        if(kmConduit > this.kmConduit)
            this.kmConduit = kmConduit;
    }

    public String getPrenom() {
        return prenom;
    }
    // Raccourcis: Alt + Insert -> Setter -> prenom
    private void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    private void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<String> getPermis() {
        // Si renvoie la liste, on peut la modifier de l'extérieur
        // Je renvoie donc une copie (un clone) de la liste interne!
        // Par Ex: liste de courses qu'on fait à deux...
        return new ArrayList<>(permis);
    }

    public void addPermis(String toAdd) {
        permis.add(toAdd);
    }
}
