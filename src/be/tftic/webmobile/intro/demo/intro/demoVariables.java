package be.tftic.webmobile.intro.demo.intro;

public class demoVariables {

    public static void main(String[] args) {

        // VARIABLE
        int myNumber = 1, simplDecl, mySecNumber = 2;


        // CONSTANTE
        final char CHARACTER = 'a';
            // Simples quotes à utiliser pour les caractères unique de type char
        final String CHAINE = "Ma chaîne de caractère";


        // LES TYPES PRIMITIFS (1 octet = 8 bit = 00000000)
        // ENTIERS
        byte tresPetitEntier;   // 1 octet -> [-128;127]
        short petitEntier;      // 2 octets -> [-32768;32767]
        int entier;             // 4 octets -> [~-2B;~2B] (B = "milliard")
        long grosEntier;        // 8 octets -> [-beaucoup;beaucoup]

        // REELS
        float reel;             // 4 octets
        double reelPrecis;      // 8 octets

        // AUTRES
        boolean bool;           // environ 1bit
        char character;         // 2 octets -> [0;65_000]

        // Pas un primitif mais s'utilise tout comme...
        String chaine;          // Objet dont la taille est déterminée par ce qu'il contient


        // EXPRESSIONS LITERALES (manière d'écrire les valeurs)

        int a = 5;
            // 5_000_000 -> les "_" sont comme des espaces invisibles pour le code

        // long b = 5_000_000_000; // ça pas marche!
        long b = 5_000_000_000L;

        double monDouble = 1.0;
        // double monDouble = 1.; // il comprend que il y a un 0 après

        float monFloat = 1.F;

        String chaineExpLit = "ma chaîne";

        char monCharactere = '5';

        boolean monBool = true;


        // CONVERSION DE TYPE

        int intConv = 5;
        // short shortConv = intConv;
            // ça pas marche!
        short shortConv = (short)intConv;   // Conversion explicite // Nécessaire si perte de données
        long longConv = intConv;            // Conversion implicite // Pas de risque de perte de données

        float floatConv = longConv;         // Conv implicite // passage de entier à réel, OK
        longConv = (long)floatConv;         // Conv explicite // passage de réel à entier, perte d'infos

        byte byteConv = 65;
        char charConv = (char)byteConv;

        System.out.println(charConv); // ?? -> table ASCII (A)
        // Ce qui permet de faire...
        if (charConv >= 'A' && charConv <= 'Z') {
            System.out.println("C'est bien une lettre majuscule!");
        }

        // char nombreC = '0';
        char nombreC = '2';
        int nombreCInt = nombreC-'0'; // je veux 0 dans mon int
        System.out.println(nombreCInt);

        String nombreDansChaine = "54";
        int nombreParse = Integer.parseInt(nombreDansChaine);
        short petitNombreParse = Short.parseShort(nombreDansChaine);
        boolean boolParsed = Boolean.parseBoolean(nombreDansChaine ); // Retournera toujours false

        char charParsed = nombreDansChaine.charAt(0);

    }
}
