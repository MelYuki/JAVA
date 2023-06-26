package be.tftic.webmobile.intro.exo.conditionnelle;

import java.util.Scanner;

public class ExoCalculatrice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez le premier nombre de l'opération: ");
        int num1 = Integer.parseInt(sc.next());

        System.out.println("Choisissez une opération entre +, -, x, /: ");
        char operateur = sc.next().charAt(0);

        System.out.println("Choisissez le deuxième nombre: ");
        int num2 = Integer.parseInt(sc.next());

        switch (operateur) {
            case '+' -> System.out.println("Résultat = " + (num1 + num2));
            case '-' -> System.out.println("Résultat = " + (num1 - num2));
            case 'x' -> System.out.println("Résultat = " + (num1 * num2));
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("ERROR: Vous ne pouvez diviser par 0!");
                } else {
                    System.out.println("Résultat = " + (num1 / num2));
                }
            }
            default -> System.out.println("Entrées invalides!");
        }
    }
}
