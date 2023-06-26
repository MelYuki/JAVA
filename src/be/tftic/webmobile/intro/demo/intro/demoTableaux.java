package be.tftic.webmobile.intro.demo.intro;

public class demoTableaux {

    public static void main(String[] args) {

        int[] tab = new int[5]; // => { 0,0,0,0,0 }
        // tab2 n'est possible qu'à la déclaration
        int[] tab2 = { 1,2,3,4,5 };
        tab2 = new int[]{ 1,2,3 };

        String[] tabChaine = new String[10];

        tab[0] = 5;
        tab[1] = tab[0]+1;
        tab[2] = 'A'; // conversion implicite en int (ASCII)

        System.out.println("La taille du tableau: " + tab.length);

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

    }
}
