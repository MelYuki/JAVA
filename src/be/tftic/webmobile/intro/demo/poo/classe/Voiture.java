package be.tftic.webmobile.intro.demo.poo.classe;

public class Voiture {

    String immat;
    String color;
    int nbrPortes;
    int kmParcourus;

    // Signature: Voiture - rouler - /
    void rouler() {
        rouler(100, true);
    }

    // Signature: Voiture - rouler - int
    void rouler(int distance) {
        rouler(distance, true);
    }

    // Signature:
    // - la classe ou l'interface définissant la méthode
    // - le nom de la méthode
    // - l'ordre/le type des paramètre

    // Signature: Voiture - rouler - int,boolean
    void rouler(int distance, boolean seeDistance) {

        System.out.printf("this.color: %s\n", this.color);

        kmParcourus += distance;

        if(seeDistance)
            System.out.printf("Je roule %d km\n", distance);
        else
            System.out.println("Je roule");
    }

    Voiture comparer(Voiture aComparer) {
        if(aComparer == null)
            return this;

        return kmParcourus >= aComparer.kmParcourus ? this : aComparer;
    }


}
