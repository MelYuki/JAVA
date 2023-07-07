package be.tftic.webmobile.intro.exo.poo.exceptions.exoCompetSportiveV2;

public class CompetAlreadyStartedException extends IllegalStateException {

    public CompetAlreadyStartedException(){
        super("La compétition a déjà été commencée");
    }

}