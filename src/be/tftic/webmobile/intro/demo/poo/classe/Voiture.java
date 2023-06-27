package be.tftic.webmobile.intro.demo.poo.classe;

public class Voiture {

    String immat;
    String color;
    int nbrPortes;
    int kmParcourus;

    void rouler(int distance, boolean seeDistance) {

        System.out.printf("this.color: %s\n", this.color);

        kmParcourus += distance;

        if(seeDistance)
            System.out.printf("Je roule %d km\n", distance);
        else
            System.out.println("Je roule");
    }

    Voiture comparer(Voiture aComparer) {
        return kmParcourus >= aComparer.kmParcourus ? this : aComparer;
    }


}
