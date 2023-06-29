package be.tftic.webmobile.intro.exo.poo.encaps.exoCompetSportive;

import java.util.HashSet;

public class Competition{

    private final int limit;
    private final HashSet<Sportif> participants = new HashSet<>();

    public Competition(int limit) {
        this.limit = limit;
    }

    public HashSet<Sportif> getParticipants() {
        return new HashSet<>(participants);
    }
    public void addParticipants(Sportif toAdd) {
        this.participants.add(toAdd);
    }
    public boolean deleteParticipants(Sportif toDel) {
        return this.participants.remove(toDel);
    }

}
