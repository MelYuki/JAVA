package be.tftic.webmobile.intro.demo.poo.enums;

public enum TemperatureUnite {

    CELCIUS('C'),
    FARHENHEIT('F'),
    KELVIN('K');

    private final char symbole;

    TemperatureUnite(char symbole){
        this.symbole = symbole;
    }

    public char getSymbole() {
        return symbole;
    }
}