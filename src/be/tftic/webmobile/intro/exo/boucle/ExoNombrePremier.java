package be.tftic.webmobile.intro.exo.boucle;

import java.util.Scanner;

public class ExoNombrePremier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choisissez un nombre pour afficher les nombres premiers qui le précèdent: ");
        int nbrUser = sc.nextInt();

        System.out.println("Voici tous les nombres (premiers) inférieurs à " + nbrUser);
        for ( int i = 2; i <= nbrUser; i++) {

            boolean estPremier = true;
            for ( int j = 2; j < i && estPremier; j++) {
                if(i % j == 0) {
                    estPremier = false;
                }
            }

            if(estPremier) {
                System.out.println(i);
            }
        }
    }
}
