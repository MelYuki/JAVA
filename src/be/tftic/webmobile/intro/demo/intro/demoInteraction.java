package be.tftic.webmobile.intro.demo.intro;

import java.util.Scanner;

public class demoInteraction {

    public static void main(String[] args) {

        // Création de l'outils scanner qui va récupérer l'input user
        Scanner sc = new Scanner(System.in);

        // Demande au user
        System.out.println("Veuillez entre votre nom: ");

        // Capture de ce que le user écrit, rangé dans une variable
        String inputUser = sc.nextLine();

        System.out.println("Vous vous appelez " + inputUser);

    }
}
