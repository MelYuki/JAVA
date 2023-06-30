package be.tftic.webmobile.intro.exo.poo.encaps.exoCompetSportive;

import java.util.HashSet;

public class Competition{

    private final int limit;
    private final HashSet<Sportif> participants = new HashSet<>();

    public Competition(){
        this.limit = 3;
    }
    public Competition(int limit) {
        this.limit = Math.max(limit, 3);
    }
    public int getLimit() {
        return limit;
    }

    public HashSet<Sportif> getParticipants() {
        // return participants; // Si on renvoie la liste elle pourrait être modifiée de l'extérieur
        return new HashSet<>(participants);
    }
    public void addParticipants(Sportif toAdd) {
        if(participants.size() < limit)
            this.participants.add(toAdd);
    }
    public boolean deleteParticipants(Sportif toDel) {
        return this.participants.remove(toDel);
    }

}
