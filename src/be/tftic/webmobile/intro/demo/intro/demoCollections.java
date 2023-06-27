package be.tftic.webmobile.intro.demo.intro;

import java.util.ArrayList;

public class demoCollections {

    public static void main(String[] args) {

        // COLLECTIONS

        // List
            // Ajouter
            ArrayList<String> strings = new ArrayList<>();
            ArrayList<Integer> entiers = new ArrayList<>();

            strings.add("Luc");
            strings.add(0, "Dom");
                // strings.add(1, true); -> NON
            strings.add(1, "true");

            entiers.add(15);

            // Récupérer la taille/un élément
            for (int i = 0; i < strings.size(); i++) {
                System.out.println(strings.get(i));
            }

            // Supprimer un élément
            strings.remove("Luc");
            strings.remove(0);

            String elementSupprime = strings.remove(0);

            // Utilitaires
            boolean contientLuc = strings.contains("Luc");
            int indexOfTrue = strings.indexOf("true"); // renvoi la première occurence
            indexOfTrue = strings.lastIndexOf("true"); // renvoi la dernière occurence
            boolean vide = strings.isEmpty();
            strings.clear(); // vide la liste

            // FOREACH (iter)
            for (String chaine : strings) {
                System.out.println(chaine);
            }

            for (Integer entier : entiers) {
                System.out.println(entier);
            }


        // Set
        // Queue

        // MAP
        // Map
    }
}
