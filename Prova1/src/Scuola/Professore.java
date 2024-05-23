package Scuola;

public class Professore extends Persona {
    int anniDiServizio;

    public Professore(String nome, String cognome, int eta, int anniDiServizio) {
        super(nome, cognome, eta);
        this.anniDiServizio = anniDiServizio;
    }

    
}
