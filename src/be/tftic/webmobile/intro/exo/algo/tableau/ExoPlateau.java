package be.tftic.webmobile.intro.exo.algo.tableau;

import java.util.Scanner;

public class ExoPlateau {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Création du tableau
        final int TAILLE_X = 5, TAILLE_Y = 5;
        int[][] plateau = new int[TAILLE_X][TAILLE_Y];
        // Pose du pion
        int posX = 0, posY = 0;
        plateau[posX][posY] = 1;

        char user;

        do {
            // Affichage du tableau
            // Rangées
            for (int i = 0; i < plateau.length; i++) {

                // Cases d'une rangée
                for (int j = 0; j < plateau[i].length; j++) {
                    System.out.print(plateau[i][j]);
                }
                System.out.println();
            }

            // Permettre au user de bouger le pion
            System.out.println("""
                MENU: bouger le pion
                --------------------
                g - aller à gauche
                d - aller à droite
                h - aller en haut
                b - aller en bas
                q - quitter
                """);
            user = sc.nextLine().charAt(0);

            // On retire le pion
            plateau[posX][posY] = 0;
            switch(user) {
                case 'g' -> { if( posY > 0 ) posY--; }
                case 'd' -> { if( posY < TAILLE_Y-1 ) posY++; }
                case 'h' -> { if( posX > 0 ) posX--; }
                case 'b' -> { if( posX < TAILLE_X-1 ) posX++; }
                case 'q' -> System.out.println("Au revoir!");
                default -> System.out.println("ERREUR: Entrée Invalide!");
            }
            // On remet le pion
            plateau[posX][posY] = 1;

        }while (user != 'q');
    }
}
