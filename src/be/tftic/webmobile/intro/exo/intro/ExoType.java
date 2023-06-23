package be.tftic.webmobile.intro.exo.type;

import java.util.Scanner;

public class ExoType {

    public static void main(String[] args) {

        // Création de l'outils scanner qui va récupérer l'input user
        Scanner sc = new Scanner(System.in);

        System.out.println("Veuillez entrer une lettre majuscule: ");

        // Version manipulation du string
        // String input2 = sc.nextLine().toLowerCase();
        // System.out.println("Voici votre lettre en minuscule: " + input2);

        // On s'amuse avec la table ASCII
        String input2 = sc.nextLine();
        System.out.println("Voici votre lettre en minuscule: " + (char)(input2.charAt(0)+32));

    }
}
