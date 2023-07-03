package be.tftic.webmobile.intro.demo.poo.abstrait;

public class CEO extends Cadre {

    public CEO(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public void travailler() {
        System.out.println("*ronfle*");
    }
}
