package be.tftic.webmobile.intro.demo.algo;

import java.util.Scanner;

public class demoBoucles {

    public static void main(String[] args) {

        // WHILE
        int nbrOeuf = 5;

        while (nbrOeuf > 0) {
            System.out.println("Je lance un oeuf");
            nbrOeuf--;
        }
        System.out.println("Il n'y a plus d'oeufs dans le frigo");


        // DO ... WHILE
            // le DO donne une itération gratuite non vérifiée
        System.out.println("Entrez un nombre entre 1 et 10");
        Scanner sc = new Scanner(System.in);

        int nbr;

        do {
            nbr = sc.nextInt();
        } while (nbr < 1 || nbr > 10);

        System.out.println(nbr);


        // FOR
            // raccourci: fori
        for (int i = 5; i > 0; i--) {
            System.out.println("Je lance un oeuf");
        }
        // Pour utiliser la variable i à l'exterieur du for, la déclarer avant le for!
        int i;
        for (i = 5; i > 0; i--) {
            System.out.println("Je lance un oeuf");
        }
        // Autre cas d'utilisation...
        String a = null;
        for( /*je peux ne rien mettre*/; (a=sc.next()).length() > 5 ; /*je peux ne rien mettre*/);

        System.out.println("///");


        // FOREACH
        int[] ints = {1, 2, 3};
        for (int entier : ints) {
            entier++; // 1 -> 2
            // entier est une variable
            // entier contient la copie des valeurs du tableau
            // Agir sur entier n'a pas d'effet sur les valeurs du tableau
        }
        for (int entier : ints) {
            System.out.println(ints);
        }
    }
}
