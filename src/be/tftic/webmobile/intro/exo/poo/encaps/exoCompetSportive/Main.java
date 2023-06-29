package be.tftic.webmobile.intro.exo.poo.encaps.exoCompetSportive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Pour ajouter un nouveau participant à la compétition,
                Veuillez entrer un nom, un prénom et une année de naissance""");

        String nom = sc.next();
        String prenom = sc.next();
        int anneeNaissance = Integer.parseInt(sc.next());

        Sportif num1 = new Sportif(nom, prenom, anneeNaissance);

    }
}
