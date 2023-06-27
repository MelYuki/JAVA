package be.tftic.webmobile.intro.exo.algo.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ExoToDoList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choix;

        // Création de la list
        ArrayList<String> list = new ArrayList<>();

        // Ajouts manuel de test
        list.add("First test task");
        list.add("second test task");

        // Boucle
        do{
            // Affichage des éléments de la liste
            System.out.println("TODO LISTE: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.println((i+1) + " - " + list.get(i));
                // System.out.println( "%d - %s".formatted(i, list.get(i)));
            }

            // Choix au user
            System.out.println("""
                Choix de l'utilisateur:
                -a- Ajouter une tâche
                -s- Supprimer une tâche
                -q- Quitter le programme
                """);
            choix = sc.nextLine().charAt(0);

            switch (choix) {
                case 'a':
                    System.out.println("Quelle tâche voulez-vous ajouter?");
                    String add = sc.nextLine();
                    System.out.println("Ajouter au début (d) ou à la fin (f)?");
                    boolean debut = sc.nextLine().charAt(0) == 'd';
                    if(debut)
                        list.add(0, add);
                    else
                        list.add(add);
                    break;
                case 's':
                    System.out.print("Entrez le numéro de la tâche à supprimer: ");
                    int del = Integer.parseInt(sc.nextLine());
                    if(del-1 >= 0 && del-1 < list.size())
                        list.remove(del-1);
                    else
                        System.out.println("ERROR 404");
                    break;
                case 'q':
                    System.out.println("Au revoir!");
                    break;
                default:
                    System.out.println("ERREUR: entrée invalide!");
            }
        }while (choix != 'q');
    }
}
