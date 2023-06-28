package be.tftic.webmobile.intro.demo.poo.classe;

public class Main {

    public static void main(String[] args) {

        Voiture voiture1 = new Voiture();
        voiture1.immat = "1-AAA-001";
        voiture1.nbrPortes = 3;
        voiture1.color = "rouge";

        Voiture voiture2 = new Voiture();
        voiture2.immat = "1-AAA-002";
        voiture2.nbrPortes = 5;
        voiture2.color = "bleue";

        voiture1.rouler(1000, true);
        voiture2.rouler(500, false);

        voiture1.kmParcourus += 200_000;

        System.out.println(voiture1.kmParcourus); // 1000
        System.out.println(voiture2.kmParcourus); // 500

        System.out.printf(
                "La voiture avec le plus de km parcourus est: %s\n",
                voiture1.comparer(voiture2).color
        ); // -> rouge

        Voiture voiture3 = null;
        // voiture3.rouler(10, true); // -> NullPointerException
        voiture1.comparer(voiture3);

    }
}
