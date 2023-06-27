package be.tftic.webmobile.intro.demo.algo;

import java.util.*;

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


        // Set - pas de doublon, pas d'ordre, pas de récupération
        HashSet<String> monSet = new HashSet<>();

        monSet.add("salut");
        monSet.add("salut");

        System.out.println("--- HASHSET ---");
        for (String s : monSet) {
            System.out.println(s);
        }

        monSet.remove("salut");
            // et d'autres méthodes mais très limité!


        // Queue - FIFO
        Queue<String> queue = new LinkedList<>();
        queue.add("à la fin");
        queue.remove(); // supprime le premier -> error si vide
        queue.poll(); // supprime le premier
        String checkPremier = queue.peek();


        // Stack - LIFO
        Stack<String> stack = new Stack<>();
        stack.push("à la fin");
        String checkDernier = stack.peek(); // check le dernier sans le supprimer
        String leDernier = stack.pop(); // supprime et récupère le dernier


        // MAP

        // Map
        HashMap<String,Integer> notes = new HashMap<>();
        // Le put va servire à:
        // l'insertion si la clé n'existe pas encore
        // la modification de la valeur associée à la clé si elle existe déjà
        notes.put("Marie", 15);
        notes.put("Luc", 12);

        notes.put("Marie", 17);

        // Récupérer un valeur
        System.out.println(notes.get("Marie")); // -> 17

        notes.remove("Marie");

        boolean marieExiste = notes.containsKey("Marie"); // -> false
        boolean laNote12Existe = notes.containsValue(12); // -> true

        // Parcourire l'ensemble des key/value
        for (String s : notes.keySet()) {
            System.out.printf("%s -> %d\n", s, notes.get(s));
        }

        for (Map.Entry<String, Integer> entry : notes.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
        }


    }
}
