package be.tftic.webmobile.intro.demo.poo.classe;

public class Main {

    public static void main(String[] args) {

        Voiture voiture1 = new Voiture();
        Voiture voiture2 = new Voiture();

        voiture1.color = "rouge";
        voiture2.color = "bleue";

        voiture1.rouler(1000, true);
        voiture2.rouler(500, false);

        voiture1.kmParcourus += 200_000;

        System.out.println(voiture1.kmParcourus); // 1000
        System.out.println(voiture2.kmParcourus); // 500

        System.out.printf("La voiture avec le plus de km parcourus est: %s\n", voiture1.comparer(voiture2).color); // -> rouge

        /*Voiture voiture3 = null;
        voiture3.rouler(10, true); // -> NullPointerException*/

    }
}
