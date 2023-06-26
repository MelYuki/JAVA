package be.tftic.webmobile.intro.demo.intro;

import java.util.Scanner;

public class demoConditionnelle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Quel âge avez-vous?");
        int age = sc.nextInt();

        // IF
            // On peut faire sans accolades s'il n'y a qu'une seule instruction!!!
        if ( age >= 65 ) {
            System.out.println("Vous êtes à la retraite");
        }
        if( age >= 18 ) {
            System.out.println("Vous êtes majeur");
        }
        else if ( age >= 0 ) {
            System.out.println("Vous êtes mineur");
        }
        else {
            System.out.println("Âge invalide!");
        }

        // SWITCH
        System.out.println("Quel est votre nom?");
        String nom = sc.next();

            // Depuis java14, si on a qu'une instruction, on peut remplacer les ":" par une "->" et enlever le break,
            // le tout sur une ligne
        switch (nom) {
            case "luc", "marie":
                System.out.println("Bonjour CEO");
                break;
            case "dominique":
                System.out.println("Bonjour Administratif");
                break;
            default:
                System.out.println("Bonjour employé");
        }

        // OPERATEUR TERNAIRE
        String message = age >= 18 ? "majeur" : "mineur";
        System.out.println(message);
    }
}
