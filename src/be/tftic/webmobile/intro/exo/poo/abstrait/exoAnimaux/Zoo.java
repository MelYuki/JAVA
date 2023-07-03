package be.tftic.webmobile.intro.exo.poo.abstrait.exoAnimaux;

import java.util.HashSet;

public class Zoo {

    private final HashSet<Animal> animals = new HashSet<>();

    public void ajouter(Animal animal){
        animals.add(animal);
    }

    public HashSet<Animal> getAnimals() {
        return new HashSet<>(animals);
    }
}
