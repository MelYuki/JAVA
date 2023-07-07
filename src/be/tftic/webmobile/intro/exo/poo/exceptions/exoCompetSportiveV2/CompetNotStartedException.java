package be.tftic.webmobile.intro.exo.poo.exceptions.exoCompetSportiveV2;

public class CompetNotStartedException extends IllegalStateException {
    public CompetNotStartedException() {
        super("La compétition n'a pas encore été lancée");
    }
}
