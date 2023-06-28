package be.tftic.webmobile.intro.demo.poo.constructeur;

public class Main {

    public static void main(String[] args) {

        Velo velo = new Velo("noir", false, "VTT", 60);
        System.out.println(velo.couleur);

        // Possible grâce au constructeur vide
        Velo velo2 = new Velo();

        Velo velo3 = new Velo("bleu");

        System.out.println(velo.petitesRoues); // false


    }
}
