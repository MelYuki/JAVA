package be.tftic.webmobile.intro.exo.poo.encaps.exoCompetSportive;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Competition competition = new Competition(); // -> limit = 3

        Sportif spor1 = new Sportif("Grind", "Billy", 1995);
        Sportif spor2 = new Sportif("Taï", "Naomi", 2011);
        Sportif spor3 = new Sportif("Vde", "Asya", 0);
        Sportif spor4 = new Sportif("Taï", "Mel", 1989);
        Sportif spor5 = new Sportif("To", "Delete", 1);

        competition.addParticipants(spor1);
        competition.addParticipants(spor2);
        competition.addParticipants(spor3);
        competition.addParticipants(spor4);
        competition.addParticipants(spor5);

        System.out.println("""
                
                Voici les participants de la 1ère compétition:
                """);
        for (Sportif participant : competition.getParticipants()) {
            System.out.printf("""
                            %s - %s
                            """,
                    participant.getNom(),
                    participant.getPrenom());
        }
        System.out.println("""
                
                ---------- Fin de la compétition ----------
                
                
                -Actualisation de la liste de participants-
                """);


        // SI ON UTILISE QU'UN SEUL OBJET -> SUPPRESSION ITERATIVE

//        competition.deleteParticipants(spor1);
//        competition.deleteParticipants(spor2);
//        competition.deleteParticipants(spor3);

        for (Sportif participant : competition.getParticipants()) {
            if(competition.deleteParticipants(participant))
                System.out.println("Suppression effectuée...");
        }

        Competition competition2 = new Competition(4);

        Sportif sport1 = new Sportif("Grind", "Billy", 1995);
        Sportif sport2 = new Sportif("To", "Delete", 1);
        Sportif sport3 = new Sportif("Vde", "Asya", 0);
        Sportif sport4 = new Sportif("Taï", "Naomi", 2011);
        Sportif sport5 = new Sportif("Taï", "Mel", 1989);

        competition2.addParticipants(sport1);
        competition2.addParticipants(sport2);
        competition2.addParticipants(sport3);
        competition2.addParticipants(sport4);
        competition2.addParticipants(sport5);

        System.out.println("""
                
                
                Voici les participants de la 2ème compétition:
                """);
        for (Sportif participant : competition2.getParticipants()) {
            System.out.printf("""
                            %s - %s
                            """,
                    participant.getNom(),
                    participant.getPrenom());
        }

        System.out.println("""
                
                -------- Nous avons un désistement --------
                """);
        if(competition2.deleteParticipants(sport2))
            System.out.printf("""
                    Suppression de: %s - %s,
                    ...Effectuée...
                    """,
                    sport2.getNom(),
                    sport2.getPrenom());

        System.out.println("""
                
                ---Ajout d'un participant supplémentaire---
                """);
        competition2.addParticipants(sport5);

        System.out.println("""
                
                Liste finale de la 2ème compétition:
                """);
        for (Sportif participant : competition2.getParticipants()) {
            System.out.printf("""
                            %s - %s
                            """,
                    participant.getNom(),
                    participant.getPrenom());
        }
    }
}
