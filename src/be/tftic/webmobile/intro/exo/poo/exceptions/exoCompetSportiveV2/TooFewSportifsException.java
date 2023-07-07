package be.tftic.webmobile.intro.exo.poo.exceptions.exoCompetSportiveV2;

public class TooFewSportifsException extends RuntimeException {

    private final int nbrParticipants;

    public TooFewSportifsException(int nbrParticipants) {
        super("La competition manque de participants (%d/3 min)".formatted(nbrParticipants));
        this.nbrParticipants = nbrParticipants;
    }

    public int getNbrParticipants() {
        return nbrParticipants;
    }

}