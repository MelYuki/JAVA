package be.tftic.webmobile.intro.exo.algo.tableau;

import java.util.Scanner;

public class ExoMoyenne {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tab= new int[10];

        System.out.println("Vous allez remplir un tableau de 10 entiers: ");

        for (int i = 0; i < tab.length; i++) {
            System.out.print("Entrez la valeur du " + (i+1) + "e index: ");
            int userInput = sc.nextInt();
            tab[i] = userInput;
        }

        int total = 0;
        for (int i = 0; i < tab.length; i++) {
            total += tab[i];
            // System.out.println(total);
        }

        System.out.println("Voici la moyenne des valeurs: " + ((double)total/tab.length));
    }
}
