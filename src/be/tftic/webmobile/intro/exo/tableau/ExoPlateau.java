package be.tftic.webmobile.intro.exo.tableau;

import java.util.Scanner;

public class ExoPlateau {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] plateau = new int[5][5];
        plateau[2][2] = 1;

        boolean continuer;

        do{
            /*System.out.print("Pour bouger le pion, veuillez entrer gauche, droite, haut ou bas: ");
            String user = sc.nextLine();

            switch(user) {
                case "gauche":

                    break;
                case "droite":

                    break;
                case "haut":

                    break;
                case "bas":

                    break;
                default:
                    System.out.println("ERREUR: Entrée Invalide!");
            }*/

            for (int i = 0; i < plateau.length; i++) {
                System.out.println(i);
                for (int j = 0; j < plateau.length; i++) {
                    System.out.print(j);
                }
            }

            System.out.println("Voulez-vous continuer? (y/n)");
            continuer = sc.next().charAt(0) == 'y';
        }while(continuer);
    }
}
