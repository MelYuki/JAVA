package be.tftic.webmobile.intro.exo.type;

import java.util.Scanner;

public class ExoOperateur {

    public static void main(String[] args) {

        // Définition des constantes de conversion
        final int sec_min = 60;
        final int sec_hr = 60 * sec_min;
        final int sec_jr = 24 * sec_hr;

        // Création du scanner et de l'input
        Scanner input = new Scanner(System.in);

        // Demande au user et rangement en Int dans sa variable
        System.out.println("Nombre de secondes? ");
        int ns = input.nextInt();

        // On divise le nombre de sec obtenu par celui par jour
        int jr = ns / sec_jr;
        // On retient le reste de la division
        ns %= sec_jr;

        // On divise le reste retenu par le nombre de sec par heure
        int hr = ns / sec_hr;
        // on retient le reste de la division
        ns %= sec_hr;

        // On divise le reste retenu par le nombre de sec par minute
        int min = ns / sec_min;
        // on retient ce qui reste pour afficher les secondes restantes!
        ns %= sec_min;

        // Affichage des résultats!
        System.out.println(jr + " jours, " + hr + " heures, " + min + " minutes, " + ns + " secondes.");

    }
}
